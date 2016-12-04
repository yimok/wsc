package koreatech.cse.domain;

/**
 * Created by Yimo on 2016-12-03.
 */
public class StationList {

    private String Sname;
    private String xWGS84;
    private String yWGS84;


    public StationList() {
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }


    public String getxWGS84() {
        return xWGS84;
    }

    public void setxWGS84(String xWGS84) {
        this.xWGS84 = xWGS84;
    }

    public String getyWGS84() {
        return yWGS84;
    }

    public void setyWGS84(String yWGS84) {
        this.yWGS84 = yWGS84;
    }
}
