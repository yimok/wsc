package koreatech.cse.domain.restRoomDistance;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HYERIM on 2016-12-04.
 */
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
