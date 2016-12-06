package koreatech.cse.domain.myapi.station;

import java.util.HashMap;

/**
 * Created by Yimo on 2016-12-03.
 */
public class MyNearestStation {

    private String Pname;
    HashMap<String, Double> station = new HashMap<String, Double>();


    //private HashMap<String , Double> station;


    public HashMap<String, Double> getStation() {
        return station;
    }

    public void setStation(HashMap<String, Double> station) {
        this.station = station;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }



    public MyNearestStation() {

    }


}
