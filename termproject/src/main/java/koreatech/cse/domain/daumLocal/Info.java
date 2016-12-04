
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
    "samename",
    "count",
    "page",
    "totalCount"
})
public class Info {

    @JsonProperty("samename")
    private Samename samename;
    @JsonProperty("count")
    private String count;
    @JsonProperty("page")
    private String page;
    @JsonProperty("totalCount")
    private String totalCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The samename
     */
    @JsonProperty("samename")
    public Samename getSamename() {
        return samename;
    }

    /**
     * 
     * @param samename
     *     The samename
     */
    @JsonProperty("samename")
    public void setSamename(Samename samename) {
        this.samename = samename;
    }

    public Info withSamename(Samename samename) {
        this.samename = samename;
        return this;
    }

    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public String getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(String count) {
        this.count = count;
    }

    public Info withCount(String count) {
        this.count = count;
        return this;
    }

    /**
     * 
     * @return
     *     The page
     */
    @JsonProperty("page")
    public String getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    @JsonProperty("page")
    public void setPage(String page) {
        this.page = page;
    }

    public Info withPage(String page) {
        this.page = page;
        return this;
    }

    /**
     * 
     * @return
     *     The totalCount
     */
    @JsonProperty("totalCount")
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * 
     * @param totalCount
     *     The totalCount
     */
    @JsonProperty("totalCount")
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public Info withTotalCount(String totalCount) {
        this.totalCount = totalCount;
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

    public Info withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
