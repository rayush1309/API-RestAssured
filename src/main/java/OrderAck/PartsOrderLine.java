package OrderAck;
import com.fasterxml.jackson.annotation.JsonProperty;
public class PartsOrderLine {

    @JsonProperty("supplierItemId")
    private String supplierItemId;

    @JsonProperty("itemId")
    private String itemId;

    @JsonProperty("itemQuantity")
    private int itemQuantity;

    // ... (Other fields)

    @JsonProperty("lineState")
    private LineState lineState;

   // @JsonProperty("partsOrderLine")
    //private List<PartsOrderLine> partsOrderLine;

    // Getters and setters
}
