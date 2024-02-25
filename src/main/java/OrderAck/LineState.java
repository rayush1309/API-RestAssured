package OrderAck;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LineState {

    @JsonProperty("stateDateTime")
    private String stateDateTime;

    @JsonProperty("lineStateType")
    private String lineStateType;

    // Getters and setters
}
