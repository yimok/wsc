
package koreatech.cse.domain.seoulpark;

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
    "P_IDX",
    "P_PARK",
    "P_LIST_CONTENT",
    "P_ADDR",
    "P_ZONE",
    "P_DIVISION",
    "P_IMG",
    "P_ADMINTEL",
    "LONGITUDE",
    "LATITUDE",
    "G_LONGITUDE",
    "G_LATITUDE"
})
public class PRow {

    @JsonProperty("P_IDX")
    private String pIDX;
    @JsonProperty("P_PARK")
    private String pPARK;
    @JsonProperty("P_LIST_CONTENT")
    private String pLISTCONTENT;
    @JsonProperty("P_ADDR")
    private String pADDR;
    @JsonProperty("P_ZONE")
    private String pZONE;
    @JsonProperty("P_DIVISION")
    private String pDIVISION;
    @JsonProperty("P_IMG")
    private String pIMG;
    @JsonProperty("P_ADMINTEL")
    private String pADMINTEL;
    @JsonProperty("LONGITUDE")
    private Double lONGITUDE;
    @JsonProperty("LATITUDE")
    private Double lATITUDE;
    @JsonProperty("G_LONGITUDE")
    private Double gLONGITUDE;
    @JsonProperty("G_LATITUDE")
    private Double gLATITUDE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The pIDX
     */
    @JsonProperty("P_IDX")
    public String getPIDX() {
        return pIDX;
    }

    /**
     * 
     * @param pIDX
     *     The P_IDX
     */
    @JsonProperty("P_IDX")
    public void setPIDX(String pIDX) {
        this.pIDX = pIDX;
    }

    /**
     * 
     * @return
     *     The pPARK
     */
    @JsonProperty("P_PARK")
    public String getPPARK() {
        return pPARK;
    }

    /**
     * 
     * @param pPARK
     *     The P_PARK
     */
    @JsonProperty("P_PARK")
    public void setPPARK(String pPARK) {
        this.pPARK = pPARK;
    }

    /**
     * 
     * @return
     *     The pLISTCONTENT
     */
    @JsonProperty("P_LIST_CONTENT")
    public String getPLISTCONTENT() {
        return pLISTCONTENT;
    }

    /**
     * 
     * @param pLISTCONTENT
     *     The P_LIST_CONTENT
     */
    @JsonProperty("P_LIST_CONTENT")
    public void setPLISTCONTENT(String pLISTCONTENT) {
        this.pLISTCONTENT = pLISTCONTENT;
    }

    /**
     * 
     * @return
     *     The pADDR
     */
    @JsonProperty("P_ADDR")
    public String getPADDR() {
        return pADDR;
    }

    /**
     * 
     * @param pADDR
     *     The P_ADDR
     */
    @JsonProperty("P_ADDR")
    public void setPADDR(String pADDR) {
        this.pADDR = pADDR;
    }

    /**
     * 
     * @return
     *     The pZONE
     */
    @JsonProperty("P_ZONE")
    public String getPZONE() {
        return pZONE;
    }

    /**
     * 
     * @param pZONE
     *     The P_ZONE
     */
    @JsonProperty("P_ZONE")
    public void setPZONE(String pZONE) {
        this.pZONE = pZONE;
    }

    /**
     * 
     * @return
     *     The pDIVISION
     */
    @JsonProperty("P_DIVISION")
    public String getPDIVISION() {
        return pDIVISION;
    }

    /**
     * 
     * @param pDIVISION
     *     The P_DIVISION
     */
    @JsonProperty("P_DIVISION")
    public void setPDIVISION(String pDIVISION) {
        this.pDIVISION = pDIVISION;
    }

    /**
     * 
     * @return
     *     The pIMG
     */
    @JsonProperty("P_IMG")
    public String getPIMG() {
        return pIMG;
    }

    /**
     * 
     * @param pIMG
     *     The P_IMG
     */
    @JsonProperty("P_IMG")
    public void setPIMG(String pIMG) {
        this.pIMG = pIMG;
    }

    /**
     * 
     * @return
     *     The pADMINTEL
     */
    @JsonProperty("P_ADMINTEL")
    public String getPADMINTEL() {
        return pADMINTEL;
    }

    /**
     * 
     * @param pADMINTEL
     *     The P_ADMINTEL
     */
    @JsonProperty("P_ADMINTEL")
    public void setPADMINTEL(String pADMINTEL) {
        this.pADMINTEL = pADMINTEL;
    }

    /**
     * 
     * @return
     *     The lONGITUDE
     */
    @JsonProperty("LONGITUDE")
    public Double getLONGITUDE() {
        return lONGITUDE;
    }

    /**
     * 
     * @param lONGITUDE
     *     The LONGITUDE
     */
    @JsonProperty("LONGITUDE")
    public void setLONGITUDE(Double lONGITUDE) {
        this.lONGITUDE = lONGITUDE;
    }

    /**
     * 
     * @return
     *     The lATITUDE
     */
    @JsonProperty("LATITUDE")
    public Double getLATITUDE() {
        return lATITUDE;
    }

    /**
     * 
     * @param lATITUDE
     *     The LATITUDE
     */
    @JsonProperty("LATITUDE")
    public void setLATITUDE(Double lATITUDE) {
        this.lATITUDE = lATITUDE;
    }

    /**
     * 
     * @return
     *     The gLONGITUDE
     */
    @JsonProperty("G_LONGITUDE")
    public Double getGLONGITUDE() {
        return gLONGITUDE;
    }

    /**
     * 
     * @param gLONGITUDE
     *     The G_LONGITUDE
     */
    @JsonProperty("G_LONGITUDE")
    public void setGLONGITUDE(Double gLONGITUDE) {
        this.gLONGITUDE = gLONGITUDE;
    }

    /**
     * 
     * @return
     *     The gLATITUDE
     */
    @JsonProperty("G_LATITUDE")
    public Double getGLATITUDE() {
        return gLATITUDE;
    }

    /**
     * 
     * @param gLATITUDE
     *     The G_LATITUDE
     */
    @JsonProperty("G_LATITUDE")
    public void setGLATITUDE(Double gLATITUDE) {
        this.gLATITUDE = gLATITUDE;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public PRow() {
    }
}
