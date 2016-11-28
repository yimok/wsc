
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
    "head",
    "row"
})
public class Publtolt {

    @JsonProperty("head")
    private List<Head> head = new ArrayList<Head>();
    @JsonProperty("row")
    private List<Row> row = new ArrayList<Row>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The head
     */
    @JsonProperty("head")
    public List<Head> getHead() {
        return head;
    }

    /**
     * 
     * @param head
     *     The head
     */
    @JsonProperty("head")
    public void setHead(List<Head> head) {
        this.head = head;
    }

    /**
     * 
     * @return
     *     The row
     */
    @JsonProperty("row")
    public List<Row> getRow() {
        return row;
    }

    /**
     * 
     * @param row
     *     The row
     */
    @JsonProperty("row")
    public void setRow(List<Row> row) {
        this.row = row;
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
