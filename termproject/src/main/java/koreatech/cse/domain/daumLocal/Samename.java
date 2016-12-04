
package koreatech.cse.domain.daumLocal;

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
    "keyword",
    "selected_region"
})
public class Samename {

    @JsonProperty("keyword")
    private String keyword;
    @JsonProperty("selected_region")
    private String selectedRegion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The keyword
     */
    @JsonProperty("keyword")
    public String getKeyword() {
        return keyword;
    }

    /**
     * 
     * @param keyword
     *     The keyword
     */
    @JsonProperty("keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Samename withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 
     * @return
     *     The selectedRegion
     */
    @JsonProperty("selected_region")
    public String getSelectedRegion() {
        return selectedRegion;
    }

    /**
     * 
     * @param selectedRegion
     *     The selected_region
     */
    @JsonProperty("selected_region")
    public void setSelectedRegion(String selectedRegion) {
        this.selectedRegion = selectedRegion;
    }

    public Samename withSelectedRegion(String selectedRegion) {
        this.selectedRegion = selectedRegion;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Samename withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
