package koreatech.cse.controller.rest;

import koreatech.cse.domain.MyBook;
import koreatech.cse.domain.Temperature;
import koreatech.cse.domain.User;
import koreatech.cse.domain.daum.DaumBook;
import koreatech.cse.domain.daum.Item;
import koreatech.cse.repository.TemperatureMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Yimo on 2016-10-27.
 */


// 다음에서 받아온 api를 내가 만든것마냥
// URL로 쏴줌 서비스제공
@RestController
@RequestMapping("/book")
public class BookRestController {

    public static final String DAUM_REST_SERVICE_URI = "https://apis.daum.net/search";



    @RequestMapping(value="/{query}", method=RequestMethod.GET,
            produces="application/json")


    private ResponseEntity<MyBook> getDaumBook(@PathVariable("query") String query) {
        RestTemplate restTemplate = new RestTemplate();

        DaumBook daumBook = null;
        try {
            //try catch 안은 단순히 다음에서 가져오는 코드

            ResponseEntity<DaumBook> daumBookResponseEntitiy = restTemplate.getForEntity(DAUM_REST_SERVICE_URI +
                    "/book?apikey=26750afb73628175ccfd453dbd9fef08&q=" + query + "&output=json", DaumBook.class);


            daumBook = daumBookResponseEntitiy.getBody();

            //System.out.println(daumBook);

            //Item 은 list 형식이므로 list 객체로 받아서 아래와같이 for문 가능
            // 타이틀만 따옴

            List<Item> itemList = daumBook.getChannel().getItem();
            for (Item item : itemList) {
                System.out.println(item.getTitle() + " ... " + item.getIsbn());

            }

            System.out.println(daumBook.getChannel().getItem()); // getItem은 리스트형태로 받아옴


        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + " : " + e.getStatusText());
        }

        if (daumBook == null) {
        System.out.println("error");
            return new ResponseEntity<MyBook>(HttpStatus.NOT_FOUND);

        }

        MyBook myBook = new MyBook();
        myBook.setIsbn(daumBook.getChannel().getItem().get(0).getTitle());
        myBook.setTitle(daumBook.getChannel().getItem().get(0).getIsbn());

        System.out.println(myBook.getTitle() + "," + myBook.getIsbn());
        return new ResponseEntity<MyBook>(myBook, HttpStatus.OK);
    }
}


