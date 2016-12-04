
package koreatech.cse.domain.seoulrestroom;

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
    "CODE",
    "MESSAGE"
})
public class RESULT {

    @JsonProperty("CODE")
    private String cODE;
    @JsonProperty("MESSAGE")
    private String mESSAGE;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The cODE
     */
    @JsonProperty("CODE")
    public String getCODE() {
        return cODE;
    }

    /**
     * 
     * @param cODE
     *     The CODE
     */
    @JsonProperty("CODE")
    public void setCODE(String cODE) {
        this.cODE = cODE;
    }

    /**
     * 
     * @return
     *     The mESSAGE
     */
    @JsonProperty("MESSAGE")
    public String getMESSAGE() {
        return mESSAGE;
    }

    /**
     * 
     * @param mESSAGE
     *     The MESSAGE
     */
    @JsonProperty("MESSAGE")
    public void setMESSAGE(String mESSAGE) {
        this.mESSAGE = mESSAGE;
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
