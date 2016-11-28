
package koreatech.cse.domain.gyeonggi;

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
    "DATA_STD_DE",
    "SIGUN_NM",
    "SIGUN_CD",
    "PUBLFACLT_DIV_NM",
    "PBCTLT_PLC_NM",
    "MALE_FEMALE_TOILET_YN",
    "MALE_WTRCLS_CNT",
    "MALE_UIL_CNT",
    "MALE_DSPSN_WTRCLS_CNT",
    "MALE_DSPSN_UIL_CNT",
    "MALE_CHILDUSE_WTRCLS_CNT",
    "MALE_CHILDUSE_UIL_CNT",
    "FEMALE_WTRCLS_CNT",
    "FEMALE_DSPSN_WTRCLS_CNT",
    "FEMALE_CHILDUSE_WTRCLS_CNT",
    "MANAGE_INST_NM",
    "MANAGE_INST_TELNO",
    "OPEN_TM",
    "OPEN_TM_INFO",
    "INSTL_YY",
    "REFINE_LOTNO_ADDR",
    "REFINE_ROADNM_ADDR",
    "REFINE_ZIP_CD",
    "REFINE_WGS84_LOGT",
    "REFINE_WGS84_LAT"
})
public class Row {

    @JsonProperty("DATA_STD_DE")
    private String dATASTDDE;
    @JsonProperty("SIGUN_NM")
    private String sIGUNNM;
    @JsonProperty("SIGUN_CD")
    private String sIGUNCD;
    @JsonProperty("PUBLFACLT_DIV_NM")
    private String pUBLFACLTDIVNM;
    @JsonProperty("PBCTLT_PLC_NM")
    private String pBCTLTPLCNM;
    @JsonProperty("MALE_FEMALE_TOILET_YN")
    private String mALEFEMALETOILETYN;
    @JsonProperty("MALE_WTRCLS_CNT")
    private Integer mALEWTRCLSCNT;
    @JsonProperty("MALE_UIL_CNT")
    private Integer mALEUILCNT;
    @JsonProperty("MALE_DSPSN_WTRCLS_CNT")
    private Integer mALEDSPSNWTRCLSCNT;
    @JsonProperty("MALE_DSPSN_UIL_CNT")
    private Integer mALEDSPSNUILCNT;
    @JsonProperty("MALE_CHILDUSE_WTRCLS_CNT")
    private Integer mALECHILDUSEWTRCLSCNT;
    @JsonProperty("MALE_CHILDUSE_UIL_CNT")
    private Integer mALECHILDUSEUILCNT;
    @JsonProperty("FEMALE_WTRCLS_CNT")
    private Integer fEMALEWTRCLSCNT;
    @JsonProperty("FEMALE_DSPSN_WTRCLS_CNT")
    private Integer fEMALEDSPSNWTRCLSCNT;
    @JsonProperty("FEMALE_CHILDUSE_WTRCLS_CNT")
    private Integer fEMALECHILDUSEWTRCLSCNT;
    @JsonProperty("MANAGE_INST_NM")
    private String mANAGEINSTNM;
    @JsonProperty("MANAGE_INST_TELNO")
    private String mANAGEINSTTELNO;
    @JsonProperty("OPEN_TM")
    private Object oPENTM;
    @JsonProperty("OPEN_TM_INFO")
    private Object oPENTMINFO;
    @JsonProperty("INSTL_YY")
    private Object iNSTLYY;
    @JsonProperty("REFINE_LOTNO_ADDR")
    private String rEFINELOTNOADDR;
    @JsonProperty("REFINE_ROADNM_ADDR")
    private String rEFINEROADNMADDR;
    @JsonProperty("REFINE_ZIP_CD")
    private String rEFINEZIPCD;
    @JsonProperty("REFINE_WGS84_LOGT")
    private Double rEFINEWGS84LOGT;
    @JsonProperty("REFINE_WGS84_LAT")
    private Double rEFINEWGS84LAT;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The dATASTDDE
     */
    @JsonProperty("DATA_STD_DE")
    public String getDATASTDDE() {
        return dATASTDDE;
    }

    /**
     * 
     * @param dATASTDDE
     *     The DATA_STD_DE
     */
    @JsonProperty("DATA_STD_DE")
    public void setDATASTDDE(String dATASTDDE) {
        this.dATASTDDE = dATASTDDE;
    }

    /**
     * 
     * @return
     *     The sIGUNNM
     */
    @JsonProperty("SIGUN_NM")
    public String getSIGUNNM() {
        return sIGUNNM;
    }

    /**
     * 
     * @param sIGUNNM
     *     The SIGUN_NM
     */
    @JsonProperty("SIGUN_NM")
    public void setSIGUNNM(String sIGUNNM) {
        this.sIGUNNM = sIGUNNM;
    }

    /**
     * 
     * @return
     *     The sIGUNCD
     */
    @JsonProperty("SIGUN_CD")
    public String getSIGUNCD() {
        return sIGUNCD;
    }

    /**
     * 
     * @param sIGUNCD
     *     The SIGUN_CD
     */
    @JsonProperty("SIGUN_CD")
    public void setSIGUNCD(String sIGUNCD) {
        this.sIGUNCD = sIGUNCD;
    }

    /**
     * 
     * @return
     *     The pUBLFACLTDIVNM
     */
    @JsonProperty("PUBLFACLT_DIV_NM")
    public String getPUBLFACLTDIVNM() {
        return pUBLFACLTDIVNM;
    }

    /**
     * 
     * @param pUBLFACLTDIVNM
     *     The PUBLFACLT_DIV_NM
     */
    @JsonProperty("PUBLFACLT_DIV_NM")
    public void setPUBLFACLTDIVNM(String pUBLFACLTDIVNM) {
        this.pUBLFACLTDIVNM = pUBLFACLTDIVNM;
    }

    /**
     * 
     * @return
     *     The pBCTLTPLCNM
     */
    @JsonProperty("PBCTLT_PLC_NM")
    public String getPBCTLTPLCNM() {
        return pBCTLTPLCNM;
    }

    /**
     * 
     * @param pBCTLTPLCNM
     *     The PBCTLT_PLC_NM
     */
    @JsonProperty("PBCTLT_PLC_NM")
    public void setPBCTLTPLCNM(String pBCTLTPLCNM) {
        this.pBCTLTPLCNM = pBCTLTPLCNM;
    }

    /**
     * 
     * @return
     *     The mALEFEMALETOILETYN
     */
    @JsonProperty("MALE_FEMALE_TOILET_YN")
    public String getMALEFEMALETOILETYN() {
        return mALEFEMALETOILETYN;
    }

    /**
     * 
     * @param mALEFEMALETOILETYN
     *     The MALE_FEMALE_TOILET_YN
     */
    @JsonProperty("MALE_FEMALE_TOILET_YN")
    public void setMALEFEMALETOILETYN(String mALEFEMALETOILETYN) {
        this.mALEFEMALETOILETYN = mALEFEMALETOILETYN;
    }

    /**
     * 
     * @return
     *     The mALEWTRCLSCNT
     */
    @JsonProperty("MALE_WTRCLS_CNT")
    public Integer getMALEWTRCLSCNT() {
        return mALEWTRCLSCNT;
    }

    /**
     * 
     * @param mALEWTRCLSCNT
     *     The MALE_WTRCLS_CNT
     */
    @JsonProperty("MALE_WTRCLS_CNT")
    public void setMALEWTRCLSCNT(Integer mALEWTRCLSCNT) {
        this.mALEWTRCLSCNT = mALEWTRCLSCNT;
    }

    /**
     * 
     * @return
     *     The mALEUILCNT
     */
    @JsonProperty("MALE_UIL_CNT")
    public Integer getMALEUILCNT() {
        return mALEUILCNT;
    }

    /**
     * 
     * @param mALEUILCNT
     *     The MALE_UIL_CNT
     */
    @JsonProperty("MALE_UIL_CNT")
    public void setMALEUILCNT(Integer mALEUILCNT) {
        this.mALEUILCNT = mALEUILCNT;
    }

    /**
     * 
     * @return
     *     The mALEDSPSNWTRCLSCNT
     */
    @JsonProperty("MALE_DSPSN_WTRCLS_CNT")
    public Integer getMALEDSPSNWTRCLSCNT() {
        return mALEDSPSNWTRCLSCNT;
    }

    /**
     * 
     * @param mALEDSPSNWTRCLSCNT
     *     The MALE_DSPSN_WTRCLS_CNT
     */
    @JsonProperty("MALE_DSPSN_WTRCLS_CNT")
    public void setMALEDSPSNWTRCLSCNT(Integer mALEDSPSNWTRCLSCNT) {
        this.mALEDSPSNWTRCLSCNT = mALEDSPSNWTRCLSCNT;
    }

    /**
     * 
     * @return
     *     The mALEDSPSNUILCNT
     */
    @JsonProperty("MALE_DSPSN_UIL_CNT")
    public Integer getMALEDSPSNUILCNT() {
        return mALEDSPSNUILCNT;
    }

    /**
     * 
     * @param mALEDSPSNUILCNT
     *     The MALE_DSPSN_UIL_CNT
     */
    @JsonProperty("MALE_DSPSN_UIL_CNT")
    public void setMALEDSPSNUILCNT(Integer mALEDSPSNUILCNT) {
        this.mALEDSPSNUILCNT = mALEDSPSNUILCNT;
    }

    /**
     * 
     * @return
     *     The mALECHILDUSEWTRCLSCNT
     */
    @JsonProperty("MALE_CHILDUSE_WTRCLS_CNT")
    public Integer getMALECHILDUSEWTRCLSCNT() {
        return mALECHILDUSEWTRCLSCNT;
    }

    /**
     * 
     * @param mALECHILDUSEWTRCLSCNT
     *     The MALE_CHILDUSE_WTRCLS_CNT
     */
    @JsonProperty("MALE_CHILDUSE_WTRCLS_CNT")
    public void setMALECHILDUSEWTRCLSCNT(Integer mALECHILDUSEWTRCLSCNT) {
        this.mALECHILDUSEWTRCLSCNT = mALECHILDUSEWTRCLSCNT;
    }

    /**
     * 
     * @return
     *     The mALECHILDUSEUILCNT
     */
    @JsonProperty("MALE_CHILDUSE_UIL_CNT")
    public Integer getMALECHILDUSEUILCNT() {
        return mALECHILDUSEUILCNT;
    }

    /**
     * 
     * @param mALECHILDUSEUILCNT
     *     The MALE_CHILDUSE_UIL_CNT
     */
    @JsonProperty("MALE_CHILDUSE_UIL_CNT")
    public void setMALECHILDUSEUILCNT(Integer mALECHILDUSEUILCNT) {
        this.mALECHILDUSEUILCNT = mALECHILDUSEUILCNT;
    }

    /**
     * 
     * @return
     *     The fEMALEWTRCLSCNT
     */
    @JsonProperty("FEMALE_WTRCLS_CNT")
    public Integer getFEMALEWTRCLSCNT() {
        return fEMALEWTRCLSCNT;
    }

    /**
     * 
     * @param fEMALEWTRCLSCNT
     *     The FEMALE_WTRCLS_CNT
     */
    @JsonProperty("FEMALE_WTRCLS_CNT")
    public void setFEMALEWTRCLSCNT(Integer fEMALEWTRCLSCNT) {
        this.fEMALEWTRCLSCNT = fEMALEWTRCLSCNT;
    }

    /**
     * 
     * @return
     *     The fEMALEDSPSNWTRCLSCNT
     */
    @JsonProperty("FEMALE_DSPSN_WTRCLS_CNT")
    public Integer getFEMALEDSPSNWTRCLSCNT() {
        return fEMALEDSPSNWTRCLSCNT;
    }

    /**
     * 
     * @param fEMALEDSPSNWTRCLSCNT
     *     The FEMALE_DSPSN_WTRCLS_CNT
     */
    @JsonProperty("FEMALE_DSPSN_WTRCLS_CNT")
    public void setFEMALEDSPSNWTRCLSCNT(Integer fEMALEDSPSNWTRCLSCNT) {
        this.fEMALEDSPSNWTRCLSCNT = fEMALEDSPSNWTRCLSCNT;
    }

    /**
     * 
     * @return
     *     The fEMALECHILDUSEWTRCLSCNT
     */
    @JsonProperty("FEMALE_CHILDUSE_WTRCLS_CNT")
    public Integer getFEMALECHILDUSEWTRCLSCNT() {
        return fEMALECHILDUSEWTRCLSCNT;
    }

    /**
     * 
     * @param fEMALECHILDUSEWTRCLSCNT
     *     The FEMALE_CHILDUSE_WTRCLS_CNT
     */
    @JsonProperty("FEMALE_CHILDUSE_WTRCLS_CNT")
    public void setFEMALECHILDUSEWTRCLSCNT(Integer fEMALECHILDUSEWTRCLSCNT) {
        this.fEMALECHILDUSEWTRCLSCNT = fEMALECHILDUSEWTRCLSCNT;
    }

    /**
     * 
     * @return
     *     The mANAGEINSTNM
     */
    @JsonProperty("MANAGE_INST_NM")
    public String getMANAGEINSTNM() {
        return mANAGEINSTNM;
    }

    /**
     * 
     * @param mANAGEINSTNM
     *     The MANAGE_INST_NM
     */
    @JsonProperty("MANAGE_INST_NM")
    public void setMANAGEINSTNM(String mANAGEINSTNM) {
        this.mANAGEINSTNM = mANAGEINSTNM;
    }

    /**
     * 
     * @return
     *     The mANAGEINSTTELNO
     */
    @JsonProperty("MANAGE_INST_TELNO")
    public String getMANAGEINSTTELNO() {
        return mANAGEINSTTELNO;
    }

    /**
     * 
     * @param mANAGEINSTTELNO
     *     The MANAGE_INST_TELNO
     */
    @JsonProperty("MANAGE_INST_TELNO")
    public void setMANAGEINSTTELNO(String mANAGEINSTTELNO) {
        this.mANAGEINSTTELNO = mANAGEINSTTELNO;
    }

    /**
     * 
     * @return
     *     The oPENTM
     */
    @JsonProperty("OPEN_TM")
    public Object getOPENTM() {
        return oPENTM;
    }

    /**
     * 
     * @param oPENTM
     *     The OPEN_TM
     */
    @JsonProperty("OPEN_TM")
    public void setOPENTM(Object oPENTM) {
        this.oPENTM = oPENTM;
    }

    /**
     * 
     * @return
     *     The oPENTMINFO
     */
    @JsonProperty("OPEN_TM_INFO")
    public Object getOPENTMINFO() {
        return oPENTMINFO;
    }

    /**
     * 
     * @param oPENTMINFO
     *     The OPEN_TM_INFO
     */
    @JsonProperty("OPEN_TM_INFO")
    public void setOPENTMINFO(Object oPENTMINFO) {
        this.oPENTMINFO = oPENTMINFO;
    }

    /**
     * 
     * @return
     *     The iNSTLYY
     */
    @JsonProperty("INSTL_YY")
    public Object getINSTLYY() {
        return iNSTLYY;
    }

    /**
     * 
     * @param iNSTLYY
     *     The INSTL_YY
     */
    @JsonProperty("INSTL_YY")
    public void setINSTLYY(Object iNSTLYY) {
        this.iNSTLYY = iNSTLYY;
    }

    /**
     * 
     * @return
     *     The rEFINELOTNOADDR
     */
    @JsonProperty("REFINE_LOTNO_ADDR")
    public String getREFINELOTNOADDR() {
        return rEFINELOTNOADDR;
    }

    /**
     * 
     * @param rEFINELOTNOADDR
     *     The REFINE_LOTNO_ADDR
     */
    @JsonProperty("REFINE_LOTNO_ADDR")
    public void setREFINELOTNOADDR(String rEFINELOTNOADDR) {
        this.rEFINELOTNOADDR = rEFINELOTNOADDR;
    }

    /**
     * 
     * @return
     *     The rEFINEROADNMADDR
     */
    @JsonProperty("REFINE_ROADNM_ADDR")
    public String getREFINEROADNMADDR() {
        return rEFINEROADNMADDR;
    }

    /**
     * 
     * @param rEFINEROADNMADDR
     *     The REFINE_ROADNM_ADDR
     */
    @JsonProperty("REFINE_ROADNM_ADDR")
    public void setREFINEROADNMADDR(String rEFINEROADNMADDR) {
        this.rEFINEROADNMADDR = rEFINEROADNMADDR;
    }

    /**
     * 
     * @return
     *     The rEFINEZIPCD
     */
    @JsonProperty("REFINE_ZIP_CD")
    public String getREFINEZIPCD() {
        return rEFINEZIPCD;
    }

    /**
     * 
     * @param rEFINEZIPCD
     *     The REFINE_ZIP_CD
     */
    @JsonProperty("REFINE_ZIP_CD")
    public void setREFINEZIPCD(String rEFINEZIPCD) {
        this.rEFINEZIPCD = rEFINEZIPCD;
    }

    /**
     * 
     * @return
     *     The rEFINEWGS84LOGT
     */
    @JsonProperty("REFINE_WGS84_LOGT")
    public Double getREFINEWGS84LOGT() {
        return rEFINEWGS84LOGT;
    }

    /**
     * 
     * @param rEFINEWGS84LOGT
     *     The REFINE_WGS84_LOGT
     */
    @JsonProperty("REFINE_WGS84_LOGT")
    public void setREFINEWGS84LOGT(Double rEFINEWGS84LOGT) {
        this.rEFINEWGS84LOGT = rEFINEWGS84LOGT;
    }

    /**
     * 
     * @return
     *     The rEFINEWGS84LAT
     */
    @JsonProperty("REFINE_WGS84_LAT")
    public Double getREFINEWGS84LAT() {
        return rEFINEWGS84LAT;
    }

    /**
     * 
     * @param rEFINEWGS84LAT
     *     The REFINE_WGS84_LAT
     */
    @JsonProperty("REFINE_WGS84_LAT")
    public void setREFINEWGS84LAT(Double rEFINEWGS84LAT) {
        this.rEFINEWGS84LAT = rEFINEWGS84LAT;
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
