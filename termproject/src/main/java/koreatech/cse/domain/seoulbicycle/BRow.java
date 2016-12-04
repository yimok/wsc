
package koreatech.cse.domain.seoulbicycle;

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
    "MAIN_KEY",
    "MNG_NO",
    "NAME_KOR",
    "LATITUDE",
    "LONGITUDE",
    "ADD_KOR",
    "ADD_KOR_ROAD",
    "H_KOR_CITY",
    "H_KOR_GU",
    "H_KOR_DONG",
    "NOTE"
})
public class BRow {

    @JsonProperty("MAIN_KEY")
    private String mAINKEY;
    @JsonProperty("MNG_NO")
    private String mNGNO;
    @JsonProperty("NAME_KOR")
    private String nAMEKOR;
    @JsonProperty("LATITUDE")
    private String lATITUDE;
    @JsonProperty("LONGITUDE")
    private String lONGITUDE;
    @JsonProperty("ADD_KOR")
    private String aDDKOR;
    @JsonProperty("ADD_KOR_ROAD")
    private String aDDKORROAD;
    @JsonProperty("H_KOR_CITY")
    private String hKORCITY;
    @JsonProperty("H_KOR_GU")
    private String hKORGU;
    @JsonProperty("H_KOR_DONG")
    private String hKORDONG;
    @JsonProperty("NOTE")
    private String nOTE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The mAINKEY
     */
    @JsonProperty("MAIN_KEY")
    public String getMAINKEY() {
        return mAINKEY;
    }

    /**
     * 
     * @param mAINKEY
     *     The MAIN_KEY
     */
    @JsonProperty("MAIN_KEY")
    public void setMAINKEY(String mAINKEY) {
        this.mAINKEY = mAINKEY;
    }

    /**
     * 
     * @return
     *     The mNGNO
     */
    @JsonProperty("MNG_NO")
    public String getMNGNO() {
        return mNGNO;
    }

    /**
     * 
     * @param mNGNO
     *     The MNG_NO
     */
    @JsonProperty("MNG_NO")
    public void setMNGNO(String mNGNO) {
        this.mNGNO = mNGNO;
    }

    /**
     * 
     * @return
     *     The nAMEKOR
     */
    @JsonProperty("NAME_KOR")
    public String getNAMEKOR() {
        return nAMEKOR;
    }

    /**
     * 
     * @param nAMEKOR
     *     The NAME_KOR
     */
    @JsonProperty("NAME_KOR")
    public void setNAMEKOR(String nAMEKOR) {
        this.nAMEKOR = nAMEKOR;
    }

    /**
     * 
     * @return
     *     The lATITUDE
     */
    @JsonProperty("LATITUDE")
    public String getLATITUDE() {
        return lATITUDE;
    }

    /**
     * 
     * @param lATITUDE
     *     The LATITUDE
     */
    @JsonProperty("LATITUDE")
    public void setLATITUDE(String lATITUDE) {
        this.lATITUDE = lATITUDE;
    }

    /**
     * 
     * @return
     *     The lONGITUDE
     */
    @JsonProperty("LONGITUDE")
    public String getLONGITUDE() {
        return lONGITUDE;
    }

    /**
     * 
     * @param lONGITUDE
     *     The LONGITUDE
     */
    @JsonProperty("LONGITUDE")
    public void setLONGITUDE(String lONGITUDE) {
        this.lONGITUDE = lONGITUDE;
    }

    /**
     * 
     * @return
     *     The aDDKOR
     */
    @JsonProperty("ADD_KOR")
    public String getADDKOR() {
        return aDDKOR;
    }

    /**
     * 
     * @param aDDKOR
     *     The ADD_KOR
     */
    @JsonProperty("ADD_KOR")
    public void setADDKOR(String aDDKOR) {
        this.aDDKOR = aDDKOR;
    }

    /**
     * 
     * @return
     *     The aDDKORROAD
     */
    @JsonProperty("ADD_KOR_ROAD")
    public String getADDKORROAD() {
        return aDDKORROAD;
    }

    /**
     * 
     * @param aDDKORROAD
     *     The ADD_KOR_ROAD
     */
    @JsonProperty("ADD_KOR_ROAD")
    public void setADDKORROAD(String aDDKORROAD) {
        this.aDDKORROAD = aDDKORROAD;
    }

    /**
     * 
     * @return
     *     The hKORCITY
     */
    @JsonProperty("H_KOR_CITY")
    public String getHKORCITY() {
        return hKORCITY;
    }

    /**
     * 
     * @param hKORCITY
     *     The H_KOR_CITY
     */
    @JsonProperty("H_KOR_CITY")
    public void setHKORCITY(String hKORCITY) {
        this.hKORCITY = hKORCITY;
    }

    /**
     * 
     * @return
     *     The hKORGU
     */
    @JsonProperty("H_KOR_GU")
    public String getHKORGU() {
        return hKORGU;
    }

    /**
     * 
     * @param hKORGU
     *     The H_KOR_GU
     */
    @JsonProperty("H_KOR_GU")
    public void setHKORGU(String hKORGU) {
        this.hKORGU = hKORGU;
    }

    /**
     * 
     * @return
     *     The hKORDONG
     */
    @JsonProperty("H_KOR_DONG")
    public String getHKORDONG() {
        return hKORDONG;
    }

    /**
     * 
     * @param hKORDONG
     *     The H_KOR_DONG
     */
    @JsonProperty("H_KOR_DONG")
    public void setHKORDONG(String hKORDONG) {
        this.hKORDONG = hKORDONG;
    }

    /**
     * 
     * @return
     *     The nOTE
     */
    @JsonProperty("NOTE")
    public String getNOTE() {
        return nOTE;
    }

    /**
     * 
     * @param nOTE
     *     The NOTE
     */
    @JsonProperty("NOTE")
    public void setNOTE(String nOTE) {
        this.nOTE = nOTE;
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
