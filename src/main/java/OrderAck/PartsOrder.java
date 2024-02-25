package OrderAck;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PartsOrder {

    @JsonProperty("partsOrderHeader")
    private PartsOrderHeader partsOrderHeader;

    @JsonProperty("partsOrderLine")
    private List<PartsOrderLine> partsOrderLine;

    // Getters and setters

    public PartsOrderHeader getPartsOrderHeader() {
        return partsOrderHeader;
    }

    public void setPartsOrderHeader(PartsOrderHeader partsOrderHeader) {
        this.partsOrderHeader = partsOrderHeader;
    }

    public List<PartsOrderLine> getPartsOrderLine() {
        return partsOrderLine;
    }

    public void setPartsOrderLine(List<PartsOrderLine> partsOrderLine) {
        this.partsOrderLine = partsOrderLine;
    }
}
