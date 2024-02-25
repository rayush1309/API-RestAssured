package OrderAck;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PartsOrderHeader {

    @JsonProperty("partsOrderReceivedDateTime")
    private String partsOrderReceivedDateTime;

    @JsonProperty("orderTypeCode")
    private String orderTypeCode;

    @JsonProperty("orderStateType")
    private String orderStateType;

    // ... (Other fields)

    @JsonProperty("status")
    private List<OrderStatus> status;

    // Getters and setters
}
