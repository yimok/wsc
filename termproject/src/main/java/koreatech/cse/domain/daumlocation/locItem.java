
package koreatech.cse.domain.daumlocation;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mountain",
    "mainAddress",
    "point_wx",
    "point_wy",
    "isNewAddress",
    "buildingAddress",
    "title",
    "placeName",
    "zipcode",
    "newAddress",
    "localName_2",
    "localName_3",
    "localName_1",
    "lat",
    "point_x",
    "lng",
    "zone_no",
    "subAddress",
    "id",
    "point_y"
})
public class locItem {

    @JsonProperty("mountain")
    private String mountain;
    @JsonProperty("mainAddress")
    private String mainAddress;
    @JsonProperty("point_wx")
    private String pointWx;
    @JsonProperty("point_wy")
    private String pointWy;
    @JsonProperty("isNewAddress")
    private String isNewAddress;
    @JsonProperty("buildingAddress")
    private String buildingAddress;
    @JsonProperty("title")
    private String title;
    @JsonProperty("placeName")
    private String placeName;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("newAddress")
    private String newAddress;
    @JsonProperty("localName_2")
    private String localName2;
    @JsonProperty("localName_3")
    private String localName3;
    @JsonProperty("localName_1")
    private String localName1;
    @JsonProperty("lat")
    private Double lat;
    @JsonProperty("point_x")
    private Double pointX;
    @JsonProperty("lng")
    private Double lng;
    @JsonProperty("zone_no")
    private String zoneNo;
    @JsonProperty("subAddress")
    private String subAddress;
    @JsonProperty("id")
    private String id;
    @JsonProperty("point_y")
    private Double pointY;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mountain
     */
    @JsonProperty("mountain")
    public String getMountain() {
        return mountain;
    }

    /**
     * 
     * @param mountain
     *     The mountain
     */
    @JsonProperty("mountain")
    public void setMountain(String mountain) {
        this.mountain = mountain;
    }

    /**
     * 
     * @return
     *     The mainAddress
     */
    @JsonProperty("mainAddress")
    public String getMainAddress() {
        return mainAddress;
    }

    /**
     * 
     * @param mainAddress
     *     The mainAddress
     */
    @JsonProperty("mainAddress")
    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
    }

    /**
     * 
     * @return
     *     The pointWx
     */
    @JsonProperty("point_wx")
    public String getPointWx() {
        return pointWx;
    }

    /**
     * 
     * @param pointWx
     *     The point_wx
     */
    @JsonProperty("point_wx")
    public void setPointWx(String pointWx) {
        this.pointWx = pointWx;
    }

    /**
     * 
     * @return
     *     The pointWy
     */
    @JsonProperty("point_wy")
    public String getPointWy() {
        return pointWy;
    }

    /**
     * 
     * @param pointWy
     *     The point_wy
     */
    @JsonProperty("point_wy")
    public void setPointWy(String pointWy) {
        this.pointWy = pointWy;
    }

    /**
     * 
     * @return
     *     The isNewAddress
     */
    @JsonProperty("isNewAddress")
    public String getIsNewAddress() {
        return isNewAddress;
    }

    /**
     * 
     * @param isNewAddress
     *     The isNewAddress
     */
    @JsonProperty("isNewAddress")
    public void setIsNewAddress(String isNewAddress) {
        this.isNewAddress = isNewAddress;
    }

    /**
     * 
     * @return
     *     The buildingAddress
     */
    @JsonProperty("buildingAddress")
    public String getBuildingAddress() {
        return buildingAddress;
    }

    /**
     * 
     * @param buildingAddress
     *     The buildingAddress
     */
    @JsonProperty("buildingAddress")
    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The placeName
     */
    @JsonProperty("placeName")
    public String getPlaceName() {
        return placeName;
    }

    /**
     * 
     * @param placeName
     *     The placeName
     */
    @JsonProperty("placeName")
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    /**
     * 
     * @return
     *     The zipcode
     */
    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    /**
     * 
     * @param zipcode
     *     The zipcode
     */
    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * 
     * @return
     *     The newAddress
     */
    @JsonProperty("newAddress")
    public String getNewAddress() {
        return newAddress;
    }

    /**
     * 
     * @param newAddress
     *     The newAddress
     */
    @JsonProperty("newAddress")
    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    /**
     * 
     * @return
     *     The localName2
     */
    @JsonProperty("localName_2")
    public String getLocalName2() {
        return localName2;
    }

    /**
     * 
     * @param localName2
     *     The localName_2
     */
    @JsonProperty("localName_2")
    public void setLocalName2(String localName2) {
        this.localName2 = localName2;
    }

    /**
     * 
     * @return
     *     The localName3
     */
    @JsonProperty("localName_3")
    public String getLocalName3() {
        return localName3;
    }

    /**
     * 
     * @param localName3
     *     The localName_3
     */
    @JsonProperty("localName_3")
    public void setLocalName3(String localName3) {
        this.localName3 = localName3;
    }

    /**
     * 
     * @return
     *     The localName1
     */
    @JsonProperty("localName_1")
    public String getLocalName1() {
        return localName1;
    }

    /**
     * 
     * @param localName1
     *     The localName_1
     */
    @JsonProperty("localName_1")
    public void setLocalName1(String localName1) {
        this.localName1 = localName1;
    }

    /**
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public Double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The pointX
     */
    @JsonProperty("point_x")
    public Double getPointX() {
        return pointX;
    }

    /**
     * 
     * @param pointX
     *     The point_x
     */
    @JsonProperty("point_x")
    public void setPointX(Double pointX) {
        this.pointX = pointX;
    }

    /**
     * 
     * @return
     *     The lng
     */
    @JsonProperty("lng")
    public Double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    @JsonProperty("lng")
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The zoneNo
     */
    @JsonProperty("zone_no")
    public String getZoneNo() {
        return zoneNo;
    }

    /**
     * 
     * @param zoneNo
     *     The zone_no
     */
    @JsonProperty("zone_no")
    public void setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo;
    }

    /**
     * 
     * @return
     *     The subAddress
     */
    @JsonProperty("subAddress")
    public String getSubAddress() {
        return subAddress;
    }

    /**
     * 
     * @param subAddress
     *     The subAddress
     */
    @JsonProperty("subAddress")
    public void setSubAddress(String subAddress) {
        this.subAddress = subAddress;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The pointY
     */
    @JsonProperty("point_y")
    public Double getPointY() {
        return pointY;
    }

    /**
     * 
     * @param pointY
     *     The point_y
     */
    @JsonProperty("point_y")
    public void setPointY(Double pointY) {
        this.pointY = pointY;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
