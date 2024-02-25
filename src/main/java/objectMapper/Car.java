package objectMapper;

public class Car {
    private String color;
    private String type;


    private  String model;

    public Car(String color, String type, String model) {
        this.color = color;
        this.type = type;
        this.model=model;
    }
    // standard getters setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




}
