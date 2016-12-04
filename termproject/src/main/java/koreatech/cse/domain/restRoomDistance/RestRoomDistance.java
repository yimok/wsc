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
        "channel"
})
public class RestRoomDistance {

    @JsonProperty("channel")
    private Channel channel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The channel
     */
    @JsonProperty("channel")
    public Channel getChannel() {
        return channel;
    }

    /**
     *
     * @param channel
     *     The channel
     */
    @JsonProperty("channel")
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public RestRoomDistance withChannel(Channel channel) {
        this.channel = channel;
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

    public RestRoomDistance withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return "RestRoomDistance{" +
                "channel=" + channel +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
