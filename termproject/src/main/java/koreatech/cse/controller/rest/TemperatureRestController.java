package koreatech.cse.controller.rest;

import koreatech.cse.domain.Temperature;
import koreatech.cse.domain.User;
import koreatech.cse.repository.TemperatureMapper;
import koreatech.cse.repository.UserMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Yimo on 2016-10-27.
 */


// 브라우저에 localhost:8080/therometer 쓰면 이쪽을 이동
//Controller는 가장먼저 갈곳에 써줌
//RestController는 rest형식으로 할 컨트롤러

@RestController
@RequestMapping("/thermometer")
public class TemperatureRestController {

    @Inject
    private TemperatureMapper temperatureMapper;

    //url temperature/값     , method= RequestMethod.GET 메소드를 겟으로 받는다.    ,  produces = "application/json" json 타입으로 출력
    //"application/xml" 로 쓰면 xml 타입으로 출력
    //get 메소드에대한 결과를 받아내기, 디비에 있는 레코드를 json으로 출력시켜줌

    @Transactional
    @RequestMapping(value="/temperature/{sensorId}", method= RequestMethod.GET, produces = "application/json")
    //하나의 서비스를 구현하는 함수 응답 서비스,
    //@PathVariable 은 url에 입력했던 sensorID가 옴
    public ResponseEntity<Temperature>  temperature(@PathVariable("sensorId") String sensorId)
    {

        //컨트롤 + B 누르면 그 메소드의 선언된 곳으로 갈 수 있음.
        //findonbysensorid 함수는   sensorid를 받아서 객체로 리턴하는 함수임
        Temperature temperature = temperatureMapper.findOneBySensorId(sensorId);

        // 리턴받은 객체가 없으면
        //http 의 상태 notfound로 설정
        if (temperature == null)
        {
            System.out.println("Temperature sensor with id (" + sensorId + ") is not found");
            //404 코드 리턴됨
            return new ResponseEntity<Temperature>(HttpStatus.NOT_FOUND);
        }

        //리턴받은 객체가 있으면 리턴
        //<Temperature> 객체의 타입 을 알려줌
        //temperature 객체를 넣어주면서 , httpstatus 상태코드 OK로

        return new ResponseEntity<Temperature>(temperature, HttpStatus.OK);
    }




    //xml 으로 출력
    @Transactional
    @RequestMapping(value="/xml/temperature/{sensorId}", method=RequestMethod.GET,
            produces="application/xml")
    public ResponseEntity<Temperature>  temperatureXml(@PathVariable("sensorId")  String sensorId)
    {
        Temperature temperature = temperatureMapper.findOneBySensorId(sensorId);
        if (temperature == null)
        {
            System.out.println("Temperature sensor with id " + sensorId + " is not found");
            return new ResponseEntity<Temperature>(HttpStatus.NOT_FOUND);
        }
            return new ResponseEntity<Temperature>(temperature, HttpStatus.OK);
    }


    //location 부분에 뭐를 입력하느냐에따라 결과가 다름
    @Transactional
    @RequestMapping(value="/temperature/location/{location}", method=RequestMethod.GET,
            produces="application/json")


    //★★★ 객체나, 리스트 같은 복잡한 객체 들을 자동으로 마샬링(XML,JSON 변환) 해줌 !! -> Porm.xml 에 xml and json 부분만 포함시키면 쉽게 가능
    //★ 복잡한형태의 객체를 json 으로 시리얼라이제이션 해주어야 출력이 쉬워짐

    //리스트 형식으로 리턴하기때문에 [ ]  괄호가 붙는다.
    //단순히 객체로 리턴한다면 { }
    public ResponseEntity<List<Temperature>>  temperatureByLocation(@PathVariable("location") String location)
    {         List<Temperature> temperatureList = temperatureMapper.findByLocation(location);
        if (temperatureList.size() == 0)
        {             System.out.println("Temperature sensors with location of " + location + " are not found");
            return new ResponseEntity<List<Temperature>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Temperature>>(temperatureList, HttpStatus.OK);
    }



    //xml 형식으로 출력
    @Transactional
    @RequestMapping(value="/xml/temperature/location/{location}", method=RequestMethod.GET,
            produces="application/xml")

    public ResponseEntity<List<Temperature>>  temperatureByLocationXml( @PathVariable("location") String location) {
        List<Temperature> temperatureList = temperatureMapper.findByLocation(location);
        if (temperatureList.size() == 0) {
            System.out.println("Temperature sensors with location of " + location + " are not found");
            return new ResponseEntity<List<Temperature>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Temperature>>(temperatureList, HttpStatus.OK);

    }

    @Transactional
    @RequestMapping(value="/test/{sensorId}/{sensorId2}", method= RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<User>  test(@PathVariable("sensorId") String sensorId,
                                             @PathVariable("sensorId2") String sensorId2)


    {
        User a = new User();
        int b;
        Temperature temperature = temperatureMapper.findOneBySensorId(sensorId);
        Temperature temperature2 = temperatureMapper.findOneBySensorId(sensorId2);

        //if (temperature == null)

        b =   (int)temperature.getTemperature() + (int)temperature2.getTemperature();
        a.setAge(b);

        System.out.println(1 + 2);
        //String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
      return new ResponseEntity<User>(a, HttpStatus.OK);
      //  return new ResponseEntity<Temperature>(temperature, HttpStatus.OK);
    }


    //브라우저에서는 post못함 , 즉 GET 밖에 못함
    //크롬 어플리케이션으로 볼수 있음
    @Transactional
    @RequestMapping(value = "/temperature/", method = RequestMethod.POST)



    //★★중요한 기능!!
    //POST하면 클라이언트가 준 즉 serialization 된 json 내용이 와서 다시 디시리얼라이제이션해서 temperature 객체에 들어감
    public ResponseEntity<Void> createTemperature(@RequestBody Temperature temperature,
                                                 UriComponentsBuilder ucBuilder)


    {

        //temp id가 있는지 확인
        if (temperatureMapper.findOneBySensorId(temperature.getSensorId()) != null)
        {
            System.out.println("A temperature sensor with id (" +
                    temperature.getSensorId()  + ") already exists");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);  //이미 존재한다면 보내는 객체 없음 , 409 코드 보냄냄
        }

        temperatureMapper.insert(temperature);
        HttpHeaders headers = new HttpHeaders();
        //ucbuilder는 url을 빌더하는 역할
        //만약 클라가 temp10 내용을 post 하면 서버가 temp의 내용을 불러서 헤더에 넣고 리턴해줌
        //content는 없고 URL만 있음
        headers.setLocation(
                ucBuilder.path("thermometer/temperature/{sensorId}").buildAndExpand(temperature.getSensorId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }


    // put 역시 브라우저에서 못함 앱으로 해야함, 기존 값을 수정할 때  사용
    @Transactional
    @RequestMapping(value = "/temperature/{sensorId}", method = RequestMethod.PUT)
    public ResponseEntity<Void>

    updateTemperature(@PathVariable("sensorId") String sensorId, // 패스에 입력된 센서 id 가져와라.
                      @RequestBody Temperature temperature)  //Desirialrization : request하는 바디의 내용을 자동으로 temperature 객체화 시켜서 가져와라.
    {
        Temperature storedTemperature = temperatureMapper.findOneBySensorId(sensorId);
        //존재 안하면 if구문 실행
        if (storedTemperature == null)
        {
            System.out.println("No temperature sensor with id (" + sensorId + " not found");
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }

        //클라가 준 정보들을 가져와서 다시 셋팅함.
        storedTemperature.setTemperature(temperature.getTemperature());
        storedTemperature.setLocation(temperature.getLocation());
        storedTemperature.setDatetime(temperature.getDatetime());
        temperatureMapper.update(storedTemperature);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    //지울 url 패스만 입력하면 됨.
    @Transactional
    @RequestMapping(value = "/temperature/{sensorId}", method = RequestMethod.DELETE)
    public ResponseEntity<Void>  deleteTemperature(@PathVariable("sensorId") String sensorId)
    {
        Temperature storedTemperature = temperatureMapper.findOneBySensorId(sensorId);
        if (storedTemperature == null) {
            System.out.println("No temperature sensor with id (" + sensorId + " not found");
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        temperatureMapper.delete(storedTemperature.getId());
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }


}
