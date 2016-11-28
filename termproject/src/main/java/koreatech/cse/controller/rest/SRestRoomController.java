package koreatech.cse.controller.rest;

import koreatech.cse.domain.seoul.Row;
import koreatech.cse.domain.seoul.RestRoom;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/seoul")
public class SRestRoomController {
    private static String gyeonggi_restroom_url = "http://openAPI.seoul.go.kr:8088";

    private static String gyeonggi_rest_api_key = "664b6b4962646c61313234774c646550";



    //일반 api 키가져오는거
    @RequestMapping("/restroom")
    public String getRestRoomWithJustAPIKey(Model model,
                                            @RequestParam(name = "searchWord") String searchWord) { //jsp에서 입력한 searchword 를 받아와 url 끝에 들어감.
        RestTemplate restTemplate = new RestTemplate();
        RestRoom restRoom = null;
        try {
            System.out.println("ok 1");
            System.out.println(searchWord);
            //jsp에서 searchword 받아와 url 끝에 들어옴
            /*ResponseEntity<RestRoom> restRoomResponseEntity
                    = restTemplate.getForEntity(gyeonggi_restroom_url + "?pSize=" + searchWord + "&Type=json" + "&KEY=" + gyeonggi_rest_api_key, RestRoom.class);
            */

            ResponseEntity<RestRoom> restRoomResponseEntity
                    = restTemplate.getForEntity("http://openAPI.seoul.go.kr:8088/664b6b4962646c61313234774c646550/json/SearchPublicToiletPOIService/1/1000/",RestRoom.class);



            System.out.println("ok 1.5");

            restRoom = restRoomResponseEntity.getBody();

            System.out.println("ok 2");
            System.out.println(restRoom);

            System.out.println("ok 3");



            List<Row> rowList = restRoom.getSearchPublicToiletPOIService().getRow();


            for (Row row : rowList) {
                System.out.println(row.getFNAME() + " ... " + row.getXWGS84() + "," + row.getYWGS84());

            }


        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + ": " + e.getStatusText());
        }


        System.out.println("ok 4");
        //jsp에서 searchword 변수를 쓸수 있도록 넘겨줌
        model.addAttribute("searchWord", searchWord);
        model.addAttribute("restRoom", restRoom);
        return "daumBook";
    }
}
