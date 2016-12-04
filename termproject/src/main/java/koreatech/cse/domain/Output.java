package koreatech.cse.domain;

/**
 * Created by Yimo on 2016-12-03.
 */
public class Output {

    private String Pname;
    private Double xWGS84;
    private Double yWGS84;
    private int Rcount;
    private int Bcount;

    public int getBcount() {
        return Bcount;
    }

    public void setBcount(int bcount) {
        Bcount = bcount;
    }

    public String getPname() {
        return Pname;
    }

    public Double getyWGS84() {
        return yWGS84;
    }

    public void setyWGS84(Double yWGS84) {
        this.yWGS84 = yWGS84;
    }

    public Double getxWGS84() {
        return xWGS84;
    }

    public Output() {

    }

    public void setxWGS84(Double xWGS84) {
        this.xWGS84 = xWGS84;
    }

    public int getRcount() {
        return Rcount;
    }

    public void setRcount(int rcount) {
        Rcount = rcount;
    }

    public void setPname(String pname) {
        Pname = pname;

    }
}
