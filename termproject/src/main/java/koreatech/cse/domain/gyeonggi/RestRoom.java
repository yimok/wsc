
package koreatech.cse.domain.gyeonggi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "Publtolt"
})
public class RestRoom {

    @JsonProperty("Publtolt")
    private List<Publtolt> publtolt = new ArrayList<Publtolt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The publtolt
     */
    @JsonProperty("Publtolt")
    public List<Publtolt> getPubltolt() {
        return publtolt;
    }

    /**
     * 
     * @param publtolt
     *     The Publtolt
     */
    @JsonProperty("Publtolt")
    public void setPubltolt(List<Publtolt> publtolt) {
        this.publtolt = publtolt;
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
