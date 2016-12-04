
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
    "SearchLocationOfSTNByIDService"
})
public class Station {

    @JsonProperty("SearchLocationOfSTNByIDService")
    private SearchLocationOfSTNByIDService searchLocationOfSTNByIDService;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The searchLocationOfSTNByIDService
     */
    @JsonProperty("SearchLocationOfSTNByIDService")
    public SearchLocationOfSTNByIDService getSearchLocationOfSTNByIDService() {
        return searchLocationOfSTNByIDService;
    }

    /**
     * 
     * @param searchLocationOfSTNByIDService
     *     The SearchLocationOfSTNByIDService
     */
    @JsonProperty("SearchLocationOfSTNByIDService")
    public void setSearchLocationOfSTNByIDService(SearchLocationOfSTNByIDService searchLocationOfSTNByIDService) {
        this.searchLocationOfSTNByIDService = searchLocationOfSTNByIDService;
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
