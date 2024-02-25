package jsonToJavaObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ConvertJsonToJavaObject {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        // Use the correct path to the JSON file in the resources directory
        File jsonFile = new File("resources/json_car.json");

        // Check if the file exists before attempting to read
        if (!jsonFile.exists()) {
            throw new IOException("File not found: " + jsonFile.getAbsolutePath());
        }

        // Deserialize JSON into Car object
        Car car = objectMapper.readValue(jsonFile, Car.class);
        System.out.println(car.toString());
    }
}
