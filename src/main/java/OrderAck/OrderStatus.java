package OrderAck;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderStatus {

    @JsonProperty("itemQuantity")
    private String itemQuantity;

    @JsonProperty("statusText")
    private String statusText;

    @JsonProperty("statusCode")
    private String statusCode;

    // ... (Other fields)

    // Getters and setters
}
