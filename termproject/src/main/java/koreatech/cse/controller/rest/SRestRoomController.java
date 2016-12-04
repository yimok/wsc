package koreatech.cse.controller.rest;

import koreatech.cse.domain.*;
import koreatech.cse.domain.daumlocation.CurrentLocation;
import koreatech.cse.domain.daumlocation.locItem;
import koreatech.cse.domain.daummap.Item;
import koreatech.cse.domain.daummap.TrainStation;
import koreatech.cse.domain.seoulbicycle.BRow;
import koreatech.cse.domain.seoulbicycle.SeoulBicycle;
import koreatech.cse.domain.seoulpark.SeoulPark;
import koreatech.cse.domain.seoulpark.PRow;
import koreatech.cse.domain.seoulrestroom.Row;
import koreatech.cse.domain.seoulrestroom.RestRoom;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Controller
@RequestMapping("/seoul")
public class SRestRoomController {


    //일반 api 키가져오는거
    @RequestMapping(value = "/park/info" , method= RequestMethod.GET, produces="application/json" )
    public ResponseEntity<ArrayList<Output>> getRestRoomWithJustAPIKey(Model model){
                                           // @RequestParam(name = "searchWord") String searchWord) { //jsp에서 입력한 searchword 를 받아와 url 끝에 들어감.
        RestTemplate restTemplate = new RestTemplate();
        RestTemplate restTemplate2 = new RestTemplate();
        RestTemplate restTemplate3 = new RestTemplate();
        RestRoom restRoom = null;
        SeoulPark Park = null;
        SeoulBicycle Bicycle = null;

        ArrayList<Output> list = new ArrayList<Output>();

        try {


            //서울공원
            ResponseEntity<SeoulPark> parkResponseEntity
                    = restTemplate2.getForEntity("http://openapi.seoul.go.kr:8088/664b6b4962646c61313234774c646550/json/SearchParkInfoService/1/97/",SeoulPark.class);
            Park = parkResponseEntity.getBody();

            List<PRow> rowList2 = Park.getSearchParkInfoService().getPRow();




            ArrayList<BigPark> BPlist = new ArrayList<BigPark>();
            BigPark Bigp1 = new BigPark();
            Bigp1.setPname("용산공원");Bigp1.setRadius(1328);
            BPlist.add(Bigp1);
            BigPark Bigp2 = new BigPark();
            Bigp2.setPname("월드컵공원");Bigp2.setRadius(2426);
            BPlist.add(Bigp2);
            BigPark Bigp3 = new BigPark();
            Bigp3.setPname("올림픽공원");Bigp3.setRadius(1180);
            BPlist.add(Bigp3);
            BigPark Bigp4 = new BigPark();
            Bigp4.setPname("어린이대공원");Bigp4.setRadius(859);
            BPlist.add(Bigp4);
            BigPark Bigp5 = new BigPark();
            Bigp5.setPname("서울숲");Bigp5.setRadius(996);
            BPlist.add(Bigp5);
            BigPark Bigp6 = new BigPark();
            Bigp6.setPname("남산");Bigp6.setRadius(1522);
            BPlist.add(Bigp6);
            BigPark Bigp7 = new BigPark();
            Bigp7.setPname("국립현충원");Bigp7.setRadius(1322);
            BPlist.add(Bigp7);
            BigPark Bigp8 = new BigPark();
            Bigp8.setPname("북서울꿈의숲");Bigp8.setRadius(863);
            BPlist.add(Bigp8);
            BigPark Bigp9 = new BigPark();
            Bigp8.setPname("여의도공원");Bigp9.setRadius(1001);
            BPlist.add(Bigp9);


            ResponseEntity<SeoulBicycle> bicycleResponseEntity
                    = restTemplate3.getForEntity("http://openapi.seoul.go.kr:8088/664b6b4962646c61313234774c646550/json/SebcBicycleRetalKor/1/147/",SeoulBicycle.class);
            Bicycle = bicycleResponseEntity.getBody();

            List<BRow> rowList3 = Bicycle.getSebcBicycleRetalKor().getBRow();




            //서울 장실
            ResponseEntity<RestRoom> restRoomResponseEntity
                    = restTemplate.getForEntity("http://openAPI.seoul.go.kr:8088/664b6b4962646c61313234774c646550/json/SearchPublicToiletPOIService/1/1000/", RestRoom.class);
            restRoom = restRoomResponseEntity.getBody();
            int maxcount = restRoom.getSearchPublicToiletPOIService().getListTotalCount();
            List<Row> rowList = restRoom.getSearchPublicToiletPOIService().getRow();


            int count = 1 ;
            int start = 0;
            int end = 0;

            while(count < 5 )
            {

                start = count * 1000 + 1;

                count++;
                if(count < 5)
                {
                    end = count * 1000;
                }
                else if(count == 5)
                {
                   end = maxcount;
                }


                ResponseEntity<RestRoom> restRoomResponseEntity2
                        = restTemplate.getForEntity("http://openAPI.seoul.go.kr:8088/664b6b4962646c61313234774c646550/json/SearchPublicToiletPOIService/" + start +
                                "/" + end + "/", RestRoom.class);


                System.out.println("ok 1.5");

                restRoom = restRoomResponseEntity2.getBody();


                List<Row> rowParts = restRoom.getSearchPublicToiletPOIService().getRow();
                rowList.addAll(rowParts);
                System.out.println("count" + count  );

            }



            for (PRow Prow : rowList2) {
               // System.out.println( Prow.getPPARK()   + Prow.getLATITUDE() +  Prow.getLONGITUDE() ) ;

                int Rcount = 0;
                int Bcount = 0;
                Output out = new Output();



                for (Row Rrow : rowList) {


                    double distanceMeterR = distance(Prow.getLATITUDE() , Prow.getLONGITUDE()   ,Rrow.getYWGS84() , Rrow.getXWGS84() ,  "meter");


                    if(Prow.getPPARK().equals(BPlist.get(0).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(0).getRadius())
                        {
                            Rcount++;
                        }

                    }
                    else if(Prow.getPPARK().equals(BPlist.get(1).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(1).getRadius())
                        {
                            Rcount++;
                        }

                    }
                    else if(Prow.getPPARK().equals(BPlist.get(2).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(2).getRadius())
                        {
                            Rcount++;
                        }

                    }
                    else if(Prow.getPPARK().equals(BPlist.get(3).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(3).getRadius())
                        {
                            Rcount++;
                        }

                    }
                    else if(Prow.getPPARK().equals(BPlist.get(4).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(4).getRadius())
                        {
                            Rcount++;
                        }

                    }
                    else if(Prow.getPPARK().equals(BPlist.get(5).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(5).getRadius())
                        {
                            Rcount++;
                        }

                    }
                    else if(Prow.getPPARK().equals(BPlist.get(6).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(6).getRadius())
                        {
                            Rcount++;
                        }

                    }
                    else if(Prow.getPPARK().equals(BPlist.get(7).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(7).getRadius())
                        {
                            Rcount++;
                        }

                    }
                    else if(Prow.getPPARK().equals(BPlist.get(8).getPname()))
                    {
                        if(distanceMeterR < BPlist.get(8).getRadius())
                        {
                            Rcount++;
                        }

                    }

                    else
                    {

                        if(distanceMeterR < 500)
                        {
                            Rcount++;
                        }
                    }

                }

                for (BRow Brow : rowList3) {


                    if(!Brow.getLATITUDE().equals("")){
                    double distanceMeterB = distance(Prow.getLATITUDE() , Prow.getLONGITUDE()   ,Double.parseDouble(Brow.getLATITUDE()) , Double.parseDouble(Brow.getLONGITUDE()),  "meter");






                            if(Prow.getPPARK().equals(BPlist.get(0).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(0).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else if(Prow.getPPARK().equals(BPlist.get(1).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(1).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else if(Prow.getPPARK().equals(BPlist.get(2).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(2).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else if(Prow.getPPARK().equals(BPlist.get(3).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(3).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else if(Prow.getPPARK().equals(BPlist.get(4).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(4).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else if(Prow.getPPARK().equals(BPlist.get(5).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(5).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else if(Prow.getPPARK().equals(BPlist.get(6).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(6).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else if(Prow.getPPARK().equals(BPlist.get(7).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(7).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else if(Prow.getPPARK().equals(BPlist.get(8).getPname()))
                            {
                                if(distanceMeterB < BPlist.get(8).getRadius())
                                {
                                    Bcount++;
                                }

                            }
                            else
                            {

                                if(distanceMeterB < 500)
                                {
                                    Bcount++;
                                }
                            }


                    }


                }


                out.setPname(Prow.getPPARK());
                out.setRcount(Rcount);
                out.setxWGS84(Prow.getLONGITUDE());
                out.setyWGS84(Prow.getLATITUDE());
                out.setBcount(Bcount);
                list.add(out);
                Rcount = 0;
                Bcount = 0;



            }

            System.out.println("--------park info--------");
            for (Output row3 : list) {
                System.out.println(row3.getPname() + " ... " + row3.getxWGS84() + "," + row3.getyWGS84()+"," + row3.getRcount() + "," + row3.getBcount());

            }


            double distanceMeter = distance(33.4517414902911, 126.5691825710239 , 33.45176429772117, 126.57055917117545, "meter");
            double distanceMeter2 = distance(33.4517414902911, 126.5691825710239 , 33.451769726358705, 126.57212945781733, "meter");
            System.out.println(distanceMeter2);
            System.out.println(distanceMeter);

        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + ": " + e.getStatusText());
        }






        /*
        System.out.println("ok 4");
        //jsp에서 searchword 변수를 쓸수 있도록 넘겨줌
        model.addAttribute("searchWord", searchWord);
        model.addAttribute("restRoom",  restRoom.getSearchPublicToiletPOIService().getRow());
        System.out.println("restRoom = " + restRoom);
        return "daumBook";
        */



        return new  ResponseEntity<ArrayList<Output>>(list , HttpStatus.OK);
    }


    //일반 api 키가져오는거
    @RequestMapping(value = "/park/neareststation", method= RequestMethod.GET, produces="application/json")
    public  ResponseEntity< List<NearestStation>> getParkWithJustAPIKey(Model model){

                                           // @RequestParam(name = "searchWord") String searchWord) { //jsp에서 입력한 searchword 를 받아와 url 끝에 들어감.

        RestTemplate PrestTemplate = new RestTemplate();
        RestTemplate TrestTemplate = new RestTemplate();
        RestTemplate T2restTemplate = new RestTemplate();

        List<StationList> slist = new ArrayList<StationList>();
        SeoulPark Park = null;
        TrainStation Station = null;
        TrainStation Station2 = null;
        List<NearestStation> nlist = new ArrayList<NearestStation>();

        List<PRow> ProwList = new ArrayList<PRow>();

        try{
            //서울공원
            ResponseEntity<SeoulPark> parkResponseEntity
                    = PrestTemplate.getForEntity("http://openapi.seoul.go.kr:8088/664b6b4962646c61313234774c646550/json/SearchParkInfoService/1/97/",SeoulPark.class);
            Park = parkResponseEntity.getBody();

            ProwList = Park.getSearchParkInfoService().getPRow();

         //   System.out.println("check 1");
            for(int i = 1; i < 10 ;i++)
            {

               // System.out.println("check 2");
                for(int j =1 ; j < 4 ; j++)
                {

                    if(i == 2)
                    {


                        //다음 지도 검색 api
                        ResponseEntity<TrainStation> trainStationResponseEntity
                                = TrestTemplate.getForEntity("https://apis.daum.net/local/v1/search/keyword.json?apikey=c94b2c7844b3c81ff3c0784ed0c89114&" +
                                "location=37.5347931041467,126.877036107442&radius=12000&query=" + i +"호선 지하철역&page=" + j ,TrainStation.class);
                        Station = trainStationResponseEntity.getBody();
                        List<Item> temp = Station.getChannel().getItem();


                        ResponseEntity<TrainStation> trainStation2ResponseEntity
                                = T2restTemplate.getForEntity("https://apis.daum.net/local/v1/search/keyword.json?apikey=c94b2c7844b3c81ff3c0784ed0c89114&" +
                                "location=37.573951,127.090733&radius=12000&query=" + i +"호선 지하철역&page=" + j ,TrainStation.class);
                        Station2 = trainStationResponseEntity.getBody();
                        List<Item> temp2 = Station2.getChannel().getItem();


                        for (Item row : temp) {

                            StationList stationtemp = new StationList();
                            stationtemp.setSname(row.getTitle());
                            stationtemp.setxWGS84(row.getLatitude());
                            stationtemp.setyWGS84(row.getLongitude());

                            slist.add(stationtemp);

                        }

                        for (Item row : temp2) {

                            StationList stationtemp = new StationList();
                            stationtemp.setSname(row.getTitle());
                            stationtemp.setxWGS84(row.getLatitude());
                            stationtemp.setyWGS84(row.getLongitude());

                            slist.add(stationtemp);

                        }
                    }
                    else
                    {

                     //   System.out.println("check 3");
                    ResponseEntity<TrainStation> trainStationResponseEntity
                            = TrestTemplate.getForEntity("https://apis.daum.net/local/v1/search/keyword.json?apikey=c94b2c7844b3c81ff3c0784ed0c89114&" +
                            "location=37.553950352464,126.989931277455&radius=20000&query=" + i +"호선 지하철역&page=" + j ,TrainStation.class);
                    Station = trainStationResponseEntity.getBody();
                    List<Item> temp = Station.getChannel().getItem();

                       // System.out.println("check 4");
                    for (Item row : temp) {

                        StationList stationtemp = new StationList();
                        stationtemp.setSname(row.getTitle());
                        stationtemp.setxWGS84(row.getLatitude());
                        stationtemp.setyWGS84(row.getLongitude());
                      //  System.out.println("check 5");
                        slist.add(stationtemp);
                      //  System.out.println("check 6");
                    }

                      //  System.out.println("check 7");

                    }

                }

            }





        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + ": " + e.getStatusText());
        }




        for (StationList row : slist) {

            System.out.println(row.getSname()+ "..."+row.getxWGS84()+ "," + row.getyWGS84());

        }


        for(PRow prow : ProwList)
        {


            NearestStation temp = new NearestStation();
            temp.setPname(prow.getPPARK());
            HashMap<String, Double> temp2 = new HashMap<String, Double>();

            HashMap<String,Double> map = new HashMap<String,Double>();
            ValueComparator bvc =  new ValueComparator(map);
            TreeMap<String,Double> sorted_map = new TreeMap<String,Double>(bvc);


            for (StationList srow : slist) {

                double distanceMeter = distance(prow.getLATITUDE() , prow.getLONGITUDE() ,
                        Double.parseDouble(srow.getxWGS84()) , Double.parseDouble(srow.getyWGS84()) , "meter");


                map.put(srow.getSname(), distanceMeter);

             }

            sorted_map.putAll(map);

            int count = 0;
            for (Map.Entry<String,Double> entry : sorted_map.entrySet()) {
                //정렬한 리스트에서 순번을 배열번호로 변경하여 원본 리스트에서 추출

                if(count == 3) break;

                    temp2.put(entry.getKey(), map.get(entry.getKey()));


                  //  System.out.println(entry.getKey()+" : "+map.get(entry.getKey()));

                count ++;

            }

            temp.setStation(temp2);




            nlist.add(temp);


        }

        for(NearestStation row :nlist )
        {
           System.out.println( row.getPname() + ","+ row.getStation() );
        }


        return new ResponseEntity<List<NearestStation>>(nlist , HttpStatus.OK);
       // return "daumBook";
       // return JSONResponseUtil.getJSONResponse(result);
    }






    @RequestMapping(value = "/park/nearest", method= RequestMethod.GET, produces="application/json")
    public  ResponseEntity< NearestPark> getParkWithJustAPIKey(Model model,
                                                                        @RequestParam(name = "address") String address,
                                                                        @RequestParam(name = "parkc") String parkc) { //jsp에서 입력한 searchword 를 받아와 url 끝에 들어감.

        RestTemplate PrestTemplate = new RestTemplate();
        RestTemplate CurrentLocTemplate = new RestTemplate();
        SeoulPark Park = null;
        CurrentLocation Loaction = null;

        //해쉬맵 - Key:공원명 , value:거리
        HashMap<String,Double> map = new HashMap<String,Double>();
        ValueComparator bvc =  new ValueComparator(map);
        TreeMap<String,Double> sorted_map = new TreeMap<String,Double>(bvc);
        HashMap<String, Double> temp = new HashMap<String, Double>();

        List<locItem> curlocList = new ArrayList<locItem>();

        NearestPark myPark = new NearestPark();

        try {
            //서울공원
            ResponseEntity<SeoulPark> parkResponseEntity
                    = PrestTemplate.getForEntity("http://openapi.seoul.go.kr:8088/664b6b4962646c61313234774c646550/json/SearchParkInfoService/1/97/", SeoulPark.class);
            Park = parkResponseEntity.getBody();
            List<PRow> ProwList = Park.getSearchParkInfoService().getPRow();


            //시작위치 좌표가져오기
            ResponseEntity<CurrentLocation> currentLocResponseEntity
                    = CurrentLocTemplate.getForEntity("https://apis.daum.net/local/geo/addr2coord?apikey=c94b2c7844b3c81ff3c0784ed0c89114&q=" + address +"&output=json", CurrentLocation.class);
            Loaction = currentLocResponseEntity.getBody();


            curlocList = Loaction.getChannel().getItem();


            for(PRow row : ProwList)
            {
                double distanceMeter = distance(row.getLATITUDE() , row.getLONGITUDE() ,
                        curlocList.get(0).getLat() , curlocList.get(0).getLng() , "meter");

                      map.put(row.getPPARK(), distanceMeter);

            }

            sorted_map.putAll(map);

            int count = 0;
            for (Map.Entry<String,Double> entry : sorted_map.entrySet()) {
                //정렬한 리스트에서 순번을 배열번호로 변경하여 원본 리스트에서 추출

                if(count == Integer.parseInt(parkc)) break;
                temp.put(entry.getKey(), map.get(entry.getKey()));
             //   System.out.println(entry.getKey()+" : "+map.get(entry.getKey()));

                count ++;

            }




        } catch (HttpClientErrorException e) {
            System.out.println(e.getStatusCode() + ": " + e.getStatusText());
        }



        myPark.setCurlocation(curlocList.get(0).getTitle());
        myPark.setCurx(curlocList.get(0).getLat());
        myPark.setCury(curlocList.get(0).getLng());
        myPark.setPark(temp);


        return new ResponseEntity<NearestPark>(myPark , HttpStatus.OK);
    }







    private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {

        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));

        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;

        if (unit == "kilometer") {
            dist = dist * 1.609344;
        } else if(unit == "meter"){
            dist = dist * 1609.344;
        }

        return (dist);
    }
    // This function converts decimal degrees to radians
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    // This function converts radians to decimal degrees
    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }


}



class ValueComparator implements Comparator<String> {

    Map<String, Double> base;

    public ValueComparator(Map<String, Double> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(String a, String b) {
        if (base.get(a) <= base.get(b)) { //반대로 하면 오름차순 <=
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}





