
package koreatech.cse.domain.Station;

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
    "STATION_CD",
    "STATION_NM",
    "LINE_NUM",
    "FR_CODE",
    "CYBER_ST_CODE",
    "XPOINT",
    "YPOINT",
    "XPOINT_WGS",
    "YPOINT_WGS"
})
public class SRow {

    @JsonProperty("STATION_CD")
    private String sTATIONCD;
    @JsonProperty("STATION_NM")
    private String sTATIONNM;
    @JsonProperty("LINE_NUM")
    private String lINENUM;
    @JsonProperty("FR_CODE")
    private String fRCODE;
    @JsonProperty("CYBER_ST_CODE")
    private String cYBERSTCODE;
    @JsonProperty("XPOINT")
    private String xPOINT;
    @JsonProperty("YPOINT")
    private String yPOINT;
    @JsonProperty("XPOINT_WGS")
    private String xPOINTWGS;
    @JsonProperty("YPOINT_WGS")
    private String yPOINTWGS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The sTATIONCD
     */
    @JsonProperty("STATION_CD")
    public String getSTATIONCD() {
        return sTATIONCD;
    }

    /**
     * 
     * @param sTATIONCD
     *     The STATION_CD
     */
    @JsonProperty("STATION_CD")
    public void setSTATIONCD(String sTATIONCD) {
        this.sTATIONCD = sTATIONCD;
    }

    /**
     * 
     * @return
     *     The sTATIONNM
     */
    @JsonProperty("STATION_NM")
    public String getSTATIONNM() {
        return sTATIONNM;
    }

    /**
     * 
     * @param sTATIONNM
     *     The STATION_NM
     */
    @JsonProperty("STATION_NM")
    public void setSTATIONNM(String sTATIONNM) {
        this.sTATIONNM = sTATIONNM;
    }

    /**
     * 
     * @return
     *     The lINENUM
     */
    @JsonProperty("LINE_NUM")
    public String getLINENUM() {
        return lINENUM;
    }

    /**
     * 
     * @param lINENUM
     *     The LINE_NUM
     */
    @JsonProperty("LINE_NUM")
    public void setLINENUM(String lINENUM) {
        this.lINENUM = lINENUM;
    }

    /**
     * 
     * @return
     *     The fRCODE
     */
    @JsonProperty("FR_CODE")
    public String getFRCODE() {
        return fRCODE;
    }

    /**
     * 
     * @param fRCODE
     *     The FR_CODE
     */
    @JsonProperty("FR_CODE")
    public void setFRCODE(String fRCODE) {
        this.fRCODE = fRCODE;
    }

    /**
     * 
     * @return
     *     The cYBERSTCODE
     */
    @JsonProperty("CYBER_ST_CODE")
    public String getCYBERSTCODE() {
        return cYBERSTCODE;
    }

    /**
     * 
     * @param cYBERSTCODE
     *     The CYBER_ST_CODE
     */
    @JsonProperty("CYBER_ST_CODE")
    public void setCYBERSTCODE(String cYBERSTCODE) {
        this.cYBERSTCODE = cYBERSTCODE;
    }

    /**
     * 
     * @return
     *     The xPOINT
     */
    @JsonProperty("XPOINT")
    public String getXPOINT() {
        return xPOINT;
    }

    /**
     * 
     * @param xPOINT
     *     The XPOINT
     */
    @JsonProperty("XPOINT")
    public void setXPOINT(String xPOINT) {
        this.xPOINT = xPOINT;
    }

    /**
     * 
     * @return
     *     The yPOINT
     */
    @JsonProperty("YPOINT")
    public String getYPOINT() {
        return yPOINT;
    }

    /**
     * 
     * @param yPOINT
     *     The YPOINT
     */
    @JsonProperty("YPOINT")
    public void setYPOINT(String yPOINT) {
        this.yPOINT = yPOINT;
    }

    /**
     * 
     * @return
     *     The xPOINTWGS
     */
    @JsonProperty("XPOINT_WGS")
    public String getXPOINTWGS() {
        return xPOINTWGS;
    }

    /**
     * 
     * @param xPOINTWGS
     *     The XPOINT_WGS
     */
    @JsonProperty("XPOINT_WGS")
    public void setXPOINTWGS(String xPOINTWGS) {
        this.xPOINTWGS = xPOINTWGS;
    }

    /**
     * 
     * @return
     *     The yPOINTWGS
     */
    @JsonProperty("YPOINT_WGS")
    public String getYPOINTWGS() {
        return yPOINTWGS;
    }

    /**
     * 
     * @param yPOINTWGS
     *     The YPOINT_WGS
     */
    @JsonProperty("YPOINT_WGS")
    public void setYPOINTWGS(String yPOINTWGS) {
        this.yPOINTWGS = yPOINTWGS;
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
