
package koreatech.cse.domain.Station;

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
    "list_total_count",
    "RESULT",
    "row"
})
public class SearchLocationOfSTNByIDService {

    @JsonProperty("list_total_count")
    private Integer listTotalCount;
    @JsonProperty("RESULT")
    private RESULT rESULT;
    @JsonProperty("row")
    private List<SRow> row = new ArrayList<SRow>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The listTotalCount
     */
    @JsonProperty("list_total_count")
    public Integer getListTotalCount() {
        return listTotalCount;
    }

    /**
     * 
     * @param listTotalCount
     *     The list_total_count
     */
    @JsonProperty("list_total_count")
    public void setListTotalCount(Integer listTotalCount) {
        this.listTotalCount = listTotalCount;
    }

    /**
     * 
     * @return
     *     The rESULT
     */
    @JsonProperty("RESULT")
    public RESULT getRESULT() {
        return rESULT;
    }

    /**
     * 
     * @param rESULT
     *     The RESULT
     */
    @JsonProperty("RESULT")
    public void setRESULT(RESULT rESULT) {
        this.rESULT = rESULT;
    }

    /**
     * 
     * @return
     *     The row
     */
    @JsonProperty("row")
    public List<SRow> getSRow() {
        return row;
    }

    /**
     * 
     * @param row
     *     The row
     */
    @JsonProperty("row")
    public void setSRow(List<SRow> row) {
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
