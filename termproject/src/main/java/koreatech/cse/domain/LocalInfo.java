package koreatech.cse.domain;

/**
 * Created by HYERIM on 2016-12-04.
 */
public class LocalInfo {
    private String title; //장소명
    private String id; //장소 ID
    private String address; //지번주소

    private String longitude; //경도
    private String latitude; //위도
    private String addressBCode; //장소 법정동코드

    private String distance; //중심좌표까지의 거리(m단위)
    private String direction; //중심좌표로부터의 방향(동,서, 남, 북, 남동, 북동, 남서, 북서)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getAddressBCode() {
        return addressBCode;
    }

    public void setAddressBCode(String addressBCode) {
        this.addressBCode = addressBCode;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String printLocalInfo(){
        return  "이름 : " + title +
                "\n주소 :" + address + '\'' +
                ", ( 경도, 위도) = ( " + longitude + ", " + latitude + ")\n\n"
                ;
    }
}
