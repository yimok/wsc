package koreatech.cse.domain;

import java.util.HashMap;

/**
 * Created by Yimo on 2016-12-04.
 */
public class NearestPark {

    private String Curlocation;
    private double curx;
    private double cury;
    HashMap<String, Double> Park = new HashMap<String, Double>();


    public NearestPark() {
    }

    public String getCurlocation() {
        return Curlocation;
    }

    public void setCurlocation(String curlocation) {
        Curlocation = curlocation;
    }

    public double getCurx() {
        return curx;
    }

    public void setCurx(double curx) {
        this.curx = curx;
    }

    public double getCury() {
        return cury;
    }

    public void setCury(double cury) {
        this.cury = cury;
    }

    public HashMap<String, Double> getPark() {
        return Park;
    }

    public void setPark(HashMap<String, Double> park) {
        Park = park;
    }
}
