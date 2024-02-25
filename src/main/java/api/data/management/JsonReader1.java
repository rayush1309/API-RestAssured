package api.data.management;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader1 {
    public static void main(String[] args) {
        try {
            // Read JSON file content into a string
            String jsonContent = new String(Files.readAllBytes(Paths.get("resources/data1.json")));

            // Parse the string into a JSONArray using JSONParser
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(jsonContent);

            // Fetch data from each JSON object
            for (Object obj : jsonArray) {
                System.out.println("Value: " + obj);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
