package koreatech.cse.domain.restRoomDistance;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HYERIM on 2016-12-04.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "list_total_count",
        "RESULT",
        "RESTROOMITEM"
})
public class Channel {

    @JsonProperty("list_total_count")
    private Integer listTotalCount;
    @JsonProperty("RESULT")
    private RESULT rESULT;
    @JsonProperty("RESTROOMITEM")
    private List<RestRoomItem> restRoomItems = new ArrayList<RestRoomItem>();
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
     *     The Item
     */
    @JsonProperty("RESTROOMITEM")
    public List<RestRoomItem> getRestRoomItems() {
        return restRoomItems;
    }

    /**
     *
     * @param item
     *     The item
     */
    @JsonProperty("RESTROOMITEM")
    public void setRestRoomItems(List<RestRoomItem> restRoomItems) {
        this.restRoomItems = restRoomItems;
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
        return "channel{" +
                "listTotalCount=" + listTotalCount +
                ", rESULT=" + rESULT +
                ", RESTROOMITEM=" + restRoomItems +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
