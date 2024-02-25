package api.data.management;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    public static void main(String[] args) {
        try {
            // Read JSON file content into a string
            String jsonContent = new String(Files.readAllBytes(Paths.get("resources/data.json")));

            // Parse the string into a JSONArray using JSONParser
            JSONParser parser = new JSONParser();
            JSONArray jsonArray = (JSONArray) parser.parse(jsonContent);

            // Fetch data from each JSON object
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                long id = (long) jsonObject.get("id"); // Use long for id as it might be a large number
                String name = (String) jsonObject.get("name");
                long age = (long) jsonObject.get("age"); // Use long for age as it might be a large number

                // Do something with the fetched data
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
