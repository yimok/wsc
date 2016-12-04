
package koreatech.cse.domain.daumlocation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalCount",
    "link",
    "result",
    "generator",
    "pageCount",
    "lastBuildDate",
    "item",
    "title",
    "description"
})
public class Channel {

    @JsonProperty("totalCount")
    private String totalCount;
    @JsonProperty("link")
    private String link;
    @JsonProperty("result")
    private String result;
    @JsonProperty("generator")
    private String generator;
    @JsonProperty("pageCount")
    private String pageCount;
    @JsonProperty("lastBuildDate")
    private String lastBuildDate;
    @JsonProperty("item")
    private List<locItem> item = null;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     * 
     * @return
     *     The link
     */
    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The result
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * 
     * @param result
     *     The result
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 
     * @return
     *     The generator
     */
    @JsonProperty("generator")
    public String getGenerator() {
        return generator;
    }

    /**
     * 
     * @param generator
     *     The generator
     */
    @JsonProperty("generator")
    public void setGenerator(String generator) {
        this.generator = generator;
    }

    /**
     * 
     * @return
     *     The pageCount
     */
    @JsonProperty("pageCount")
    public String getPageCount() {
        return pageCount;
    }

    /**
     * 
     * @param pageCount
     *     The pageCount
     */
    @JsonProperty("pageCount")
    public void setPageCount(String pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 
     * @return
     *     The lastBuildDate
     */
    @JsonProperty("lastBuildDate")
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     * 
     * @param lastBuildDate
     *     The lastBuildDate
     */
    @JsonProperty("lastBuildDate")
    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    /**
     * 
     * @return
     *     The item
     */
    @JsonProperty("item")
    public List<locItem> getItem() {
        return item;
    }

    /**
     * 
     * @param item
     *     The item
     */
    @JsonProperty("item")
    public void setItem(List<locItem> item) {
        this.item = item;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
