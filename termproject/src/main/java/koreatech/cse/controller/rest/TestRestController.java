package koreatech.cse.controller.rest;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import koreatech.cse.domain.MyBook;
import koreatech.cse.domain.d3.Tree;
import koreatech.cse.domain.daum.DaumBook;
import koreatech.cse.domain.daum.Item;
import net.sf.json.JSONSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yimo on 2016-10-27.
 */


// 다음에서 받아온 api를 내가 만든것마냥
// URL로 쏴줌 서비스제공
@Controller
@RequestMapping("/book")
public class TestRestController {

    @RequestMapping("/hi")
    public String getDaumBookWithJustAPIKey(Model model,
                                            @RequestParam(name = "searchWord") String searchWord) { //jsp에서 입력한 searchword 를 받아와 url 끝에 들어감.


        //jsp에서 searchword 변수를 쓸수 있도록 넘겨줌
        model.addAttribute("searchWord", searchWord);


       List<Tree> treel = new ArrayList<Tree>();
        Tree tree = new Tree();

        tree.setName("hi");
        treel.add(tree);

        ObjectMapper mapper = new ObjectMapper();
        String toJson=null;
        try {

             toJson = mapper.writeValueAsString(tree);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


        ResponseEntity<Tree> temp = new ResponseEntity<Tree>(tree , HttpStatus.OK);

        String string ="hhhhhhh";
        //model.addAttribute("tree", toJson);

        model.addAttribute("tree", string);
        return  "output2";
    }
}


