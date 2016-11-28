
package koreatech.cse.domain.seoul;

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
    "POI_ID",
    "FNAME",
    "ANAME",
    "CNAME",
    "CENTER_X1",
    "CENTER_Y1",
    "X_WGS84",
    "Y_WGS84",
    "INSERTDATE",
    "UPDATEDATE"
})
public class Row {

    @JsonProperty("POI_ID")
    private String pOIID;
    @JsonProperty("FNAME")
    private String fNAME;
    @JsonProperty("ANAME")
    private String aNAME;
    @JsonProperty("CNAME")
    private String cNAME;
    @JsonProperty("CENTER_X1")
    private Double cENTERX1;
    @JsonProperty("CENTER_Y1")
    private Double cENTERY1;
    @JsonProperty("X_WGS84")
    private Double xWGS84;
    @JsonProperty("Y_WGS84")
    private Double yWGS84;
    @JsonProperty("INSERTDATE")
    private String iNSERTDATE;
    @JsonProperty("UPDATEDATE")
    private String uPDATEDATE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The pOIID
     */
    @JsonProperty("POI_ID")
    public String getPOIID() {
        return pOIID;
    }

    /**
     * 
     * @param pOIID
     *     The POI_ID
     */
    @JsonProperty("POI_ID")
    public void setPOIID(String pOIID) {
        this.pOIID = pOIID;
    }

    /**
     * 
     * @return
     *     The fNAME
     */
    @JsonProperty("FNAME")
    public String getFNAME() {
        return fNAME;
    }

    /**
     * 
     * @param fNAME
     *     The FNAME
     */
    @JsonProperty("FNAME")
    public void setFNAME(String fNAME) {
        this.fNAME = fNAME;
    }

    /**
     * 
     * @return
     *     The aNAME
     */
    @JsonProperty("ANAME")
    public String getANAME() {
        return aNAME;
    }

    /**
     * 
     * @param aNAME
     *     The ANAME
     */
    @JsonProperty("ANAME")
    public void setANAME(String aNAME) {
        this.aNAME = aNAME;
    }

    /**
     * 
     * @return
     *     The cNAME
     */
    @JsonProperty("CNAME")
    public String getCNAME() {
        return cNAME;
    }

    /**
     * 
     * @param cNAME
     *     The CNAME
     */
    @JsonProperty("CNAME")
    public void setCNAME(String cNAME) {
        this.cNAME = cNAME;
    }

    /**
     * 
     * @return
     *     The cENTERX1
     */
    @JsonProperty("CENTER_X1")
    public Double getCENTERX1() {
        return cENTERX1;
    }

    /**
     * 
     * @param cENTERX1
     *     The CENTER_X1
     */
    @JsonProperty("CENTER_X1")
    public void setCENTERX1(Double cENTERX1) {
        this.cENTERX1 = cENTERX1;
    }

    /**
     * 
     * @return
     *     The cENTERY1
     */
    @JsonProperty("CENTER_Y1")
    public Double getCENTERY1() {
        return cENTERY1;
    }

    /**
     * 
     * @param cENTERY1
     *     The CENTER_Y1
     */
    @JsonProperty("CENTER_Y1")
    public void setCENTERY1(Double cENTERY1) {
        this.cENTERY1 = cENTERY1;
    }

    /**
     * 
     * @return
     *     The xWGS84
     */
    @JsonProperty("X_WGS84")
    public Double getXWGS84() {
        return xWGS84;
    }

    /**
     * 
     * @param xWGS84
     *     The X_WGS84
     */
    @JsonProperty("X_WGS84")
    public void setXWGS84(Double xWGS84) {
        this.xWGS84 = xWGS84;
    }

    /**
     * 
     * @return
     *     The yWGS84
     */
    @JsonProperty("Y_WGS84")
    public Double getYWGS84() {
        return yWGS84;
    }

    /**
     * 
     * @param yWGS84
     *     The Y_WGS84
     */
    @JsonProperty("Y_WGS84")
    public void setYWGS84(Double yWGS84) {
        this.yWGS84 = yWGS84;
    }

    /**
     * 
     * @return
     *     The iNSERTDATE
     */
    @JsonProperty("INSERTDATE")
    public String getINSERTDATE() {
        return iNSERTDATE;
    }

    /**
     * 
     * @param iNSERTDATE
     *     The INSERTDATE
     */
    @JsonProperty("INSERTDATE")
    public void setINSERTDATE(String iNSERTDATE) {
        this.iNSERTDATE = iNSERTDATE;
    }

    /**
     * 
     * @return
     *     The uPDATEDATE
     */
    @JsonProperty("UPDATEDATE")
    public String getUPDATEDATE() {
        return uPDATEDATE;
    }

    /**
     * 
     * @param uPDATEDATE
     *     The UPDATEDATE
     */
    @JsonProperty("UPDATEDATE")
    public void setUPDATEDATE(String uPDATEDATE) {
        this.uPDATEDATE = uPDATEDATE;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        return "Row{" +
                "pOIID='" + pOIID + '\'' +
                ", fNAME='" + fNAME + '\'' +
                ", aNAME='" + aNAME + '\'' +
                ", cNAME='" + cNAME + '\'' +
                ", cENTERX1=" + cENTERX1 +
                ", cENTERY1=" + cENTERY1 +
                ", xWGS84=" + xWGS84 +
                ", yWGS84=" + yWGS84 +
                ", iNSERTDATE='" + iNSERTDATE + '\'' +
                ", uPDATEDATE='" + uPDATEDATE + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
