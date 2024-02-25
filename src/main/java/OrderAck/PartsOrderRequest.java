package OrderAck;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PartsOrderRequest {

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("partsOrder")
    private List<PartsOrder> partsOrder;

    // Getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<PartsOrder> getPartsOrder() {
        return partsOrder;
    }

    public void setPartsOrder(List<PartsOrder> partsOrder) {
        this.partsOrder = partsOrder;
    }
}
