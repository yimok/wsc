package koreatech.cse.domain;

/**
 * Created by Yimo on 2016-12-03.
 */
public class NearestStation {

    private String Pname;
    private String[] station = new String[3];
    private int[] distance = new int[3];


    public String getPname() {
        return Pname;
    }

    public void setPname(String pname) {
        Pname = pname;
    }

    public String[] getStation() {
        return station;
    }

    public void setStation(String[] station) {
        this.station = station;
    }

    public int[] getDistance() {
        return distance;
    }

    public void setDistance(int[] distance) {
        this.distance = distance;
    }

    public NearestStation() {

    }


}
