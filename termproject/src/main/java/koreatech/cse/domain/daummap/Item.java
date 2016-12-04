
package koreatech.cse.domain.daummap;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "phone",
    "newAddress",
    "imageUrl",
    "direction",
    "zipcode",
    "placeUrl",
    "id",
    "title",
    "distance",
    "category",
    "address",
    "longitude",
    "latitude",
    "addressBCode"
})
public class Item {

    @JsonProperty("phone")
    private String phone;
    @JsonProperty("newAddress")
    private String newAddress;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("placeUrl")
    private String placeUrl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("distance")
    private String distance;
    @JsonProperty("category")
    private String category;
    @JsonProperty("address")
    private String address;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("addressBCode")
    private String addressBCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
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
     *     The imageUrl
     */
    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The imageUrl
     */
    @JsonProperty("imageUrl")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The direction
     */
    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    /**
     * 
     * @param direction
     *     The direction
     */
    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
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
     *     The placeUrl
     */
    @JsonProperty("placeUrl")
    public String getPlaceUrl() {
        return placeUrl;
    }

    /**
     * 
     * @param placeUrl
     *     The placeUrl
     */
    @JsonProperty("placeUrl")
    public void setPlaceUrl(String placeUrl) {
        this.placeUrl = placeUrl;
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
     *     The distance
     */
    @JsonProperty("distance")
    public String getDistance() {
        return distance;
    }

    /**
     * 
     * @param distance
     *     The distance
     */
    @JsonProperty("distance")
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /**
     * 
     * @return
     *     The category
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The addressBCode
     */
    @JsonProperty("addressBCode")
    public String getAddressBCode() {
        return addressBCode;
    }

    /**
     * 
     * @param addressBCode
     *     The addressBCode
     */
    @JsonProperty("addressBCode")
    public void setAddressBCode(String addressBCode) {
        this.addressBCode = addressBCode;
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
