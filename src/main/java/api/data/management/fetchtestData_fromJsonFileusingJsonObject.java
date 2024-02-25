package api.data.management;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fetchtestData_fromJsonFileusingJsonObject {
    public static void main(String[] args) {

    // Specify the path to your JSON file
    String filePath = "resources/testData.json";

    // Fetch test data from the JSON file
    JSONObject testData = readJsonFile(filePath);

    // Example: Fetching user credentials
    JSONObject userCredentials = testData.getJSONObject("userCredentials");
    String username = userCredentials.getString("username");
    String password = userCredentials.getString("password");

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

    // Example: Fetching API endpoints
    JSONObject apiEndpoints = testData.getJSONObject("apiEndpoints");
    String createOrderEndpoint = apiEndpoints.getString("createOrder");
    String getUserInfoEndpoint = apiEndpoints.getString("getUserInfo");

        System.out.println("Create Order Endpoint: " + createOrderEndpoint);
        System.out.println("Get User Info Endpoint: " + getUserInfoEndpoint);
}

    private static JSONObject readJsonFile(String filePath) {
        // Read the JSON file and return a JSONObject
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
            return new JSONObject(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
            return new JSONObject(); // Handle error appropriately
        }
    }
}
