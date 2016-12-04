package koreatech.cse.controller.rest;

import koreatech.cse.domain.gyeonggi.RestRoomG;
import koreatech.cse.domain.gyeonggi.Row;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/gyeonggi")
public class GRestRoomController {
    private static String gyeonggi_restroom_url = "http://openapi.gg.go.kr/Publtolt";

    private static String gyeonggi_rest_api_key = "a5d578e7061b4047b39c4fa09142024a";


    //일반 api 키가져오는거
    @RequestMapping("/restroom")
    public String getRestRoomWithJustAPIKey(Model model,
                              @RequestParam(name = "searchWord") String searchWord) { //jsp에서 입력한 searchword 를 받아와 url 끝에 들어감.
        RestTemplate restTemplate = new RestTemplate();
        RestRoomG restRoom = null;
        try {
            System.out.println("ok 1");
           // System.out.println(searchWord);



            ResponseEntity<RestRoomG> restRoomResponseEntity
                    = restTemplate.getForEntity("http://openapi.gg.go.kr/CityPark?KEY=a5d578e7061b4047b39c4fa09142024a&pSize=10&Type=xml&pIndex=2/",RestRoomG.class);



            System.out.println("ok 1.5");

            restRoom = restRoomResponseEntity.getBody();

            System.out.println("ok 2");
            System.out.println(restRoom);


            Row[] row = restRoom.getPubltolt().getRow();


            System.out.println(row.toString());
            System.out.println("ok 3");
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
