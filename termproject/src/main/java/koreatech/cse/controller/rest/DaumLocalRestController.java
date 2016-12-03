package koreatech.cse.controller.rest;

import koreatech.cse.domain.LocalInfo;
import koreatech.cse.domain.daumLocal.DaumLocal;
import koreatech.cse.domain.daumLocal.Item;
import koreatech.cse.domain.restRoomDistance.RestRoomDistance;
import koreatech.cse.domain.restRoomDistance.RestRoomItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by HYERIM on 2016-12-03.
 */
@RestController
@RequestMapping("/local")
public class DaumLocalRestController {

    public static final String DAUM_LOCAL_URI = "https://apis.daum.net/local/v1/search/keyword.json?apikey=";
    public static final String DAUM_API_KEY = "5586387b13aec9a6942f17b9db59146b";

    @RequestMapping(value="/{query}", method=RequestMethod.GET,
            produces="application/json")
    //private ResponseEntity<DaumLocal> getDaumBook(@PathVariable("query") String query) {
    //private ResponseEntity<LocalInfo> getDaumBook(@PathVariable("query") String query) {
    private ResponseEntity<RestRoomDistance> getDaumBook(@PathVariable("query") String query) {
        RestTemplate restTemplate = new RestTemplate();

        DaumLocal daumLocal = null;
        try {
            //try catch 안은 단순히 다음에서 가져오는 코드

            ResponseEntity<DaumLocal> daumLocalResponseEntity = restTemplate.getForEntity(DAUM_LOCAL_URI +
                    DAUM_API_KEY + "&query=" + query , DaumLocal.class);


            daumLocal = daumLocalResponseEntity.getBody();

            List<Item> itemList = daumLocal.getChannel().getItem();
            for (Item item : itemList) {
                System.out.println(item.getTitle() + " , " + item.getAddress());

            }

            System.out.println(daumLocal.getChannel().getItem()); // getItem은 리스트형태로 받아옴

        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + " : " + e.getStatusText());
        }

        if (daumLocal == null) {
            System.out.println("error");
            //return new ResponseEntity<DaumLocal>(HttpStatus.NOT_FOUND);
            //return new ResponseEntity<LocalInfo>(HttpStatus.NOT_FOUND);
            return new ResponseEntity<RestRoomDistance>(HttpStatus.NOT_FOUND);

        }

        LocalInfo localInfo = new LocalInfo();
        localInfo.setTitle(daumLocal.getChannel().getItem().get(0).getTitle());
        localInfo.setId(daumLocal.getChannel().getItem().get(0).getId());
        localInfo.setAddress(daumLocal.getChannel().getItem().get(0).getAddress());
        localInfo.setLongitude(daumLocal.getChannel().getItem().get(0).getLongitude());
        localInfo.setLatitude(daumLocal.getChannel().getItem().get(0).getLatitude());

        RestRoomDistance restRoomDistance = searchRestRoom(localInfo);

        //return new ResponseEntity<DaumLocal>(daumLocal, HttpStatus.OK);
        //return new ResponseEntity<LocalInfo>(localInfo, HttpStatus.OK);
        return new ResponseEntity<RestRoomDistance>(restRoomDistance, HttpStatus.OK);
    }

    private RestRoomDistance searchRestRoom(LocalInfo localInfo){
        double distance;
        double localLat, localLon;

        RestTemplate restTemplate = new RestTemplate();
        RestRoomDistance restRoomDistance = null;
        try {
            ResponseEntity<RestRoomDistance> restRoomResponseEntity
                    = restTemplate.getForEntity("http://openAPI.seoul.go.kr:8088/664b6b4962646c61313234774c646550/json/SearchPublicToiletPOIService/1/1000/",RestRoomDistance.class);

            restRoomDistance = restRoomResponseEntity.getBody();
            System.out.println(restRoomDistance);

            List<RestRoomItem> rowList = restRoomDistance.getChannel().getRestRoomItems();

            for(int i = 0; i < rowList.size(); i++){
                localLat = Double.parseDouble(localInfo.getLatitude());
                localLon = Double.parseDouble(localInfo.getLongitude());
                distance = Math.acos(Math.sin(localLat)*Math.sin(rowList.get(i).getXWGS84()) + Math.cos(localLat)*Math.cos(rowList.get(i).getXWGS84())*Math.cos(localLon - rowList.get(i).getYWGS84()));
                rowList.get(i).setDISTANCE(String.valueOf(distance));
            }

            for (RestRoomItem restRoomItem : rowList) {
                System.out.println(restRoomItem.getFNAME() + " / " + restRoomItem.getXWGS84() + "," + restRoomItem.getYWGS84());
            }

        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + ": " + e.getStatusText());
        }
        return restRoomDistance;
    }

}
