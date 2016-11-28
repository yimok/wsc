
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
    "SearchPublicToiletPOIService"
})
public class RestRoom {

    @JsonProperty("SearchPublicToiletPOIService")
    private SearchPublicToiletPOIService searchPublicToiletPOIService;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The searchPublicToiletPOIService
     */
    @JsonProperty("SearchPublicToiletPOIService")
    public SearchPublicToiletPOIService getSearchPublicToiletPOIService() {
        return searchPublicToiletPOIService;
    }

    /**
     * 
     * @param searchPublicToiletPOIService
     *     The SearchPublicToiletPOIService
     */
    @JsonProperty("SearchPublicToiletPOIService")
    public void setSearchPublicToiletPOIService(SearchPublicToiletPOIService searchPublicToiletPOIService) {
        this.searchPublicToiletPOIService = searchPublicToiletPOIService;
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
        return "RestRoom{" +
                "searchPublicToiletPOIService=" + searchPublicToiletPOIService +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
