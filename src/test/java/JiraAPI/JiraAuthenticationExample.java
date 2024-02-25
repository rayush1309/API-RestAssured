package JiraAPI;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JiraAuthenticationExample {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://ayushrajmr1301.atlassian.net";

        // Prepare the authentication payload
        String username = "ayushr";
        String password = "A7777"; // Add your actual password here

        // Perform the authentication request using basic auth
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .auth().basic(username, password)
                .get("/rest/auth/1/session");

        // Get the response body as a string
        String responseBody = response.getBody().asString();

        // Print the response status code and body
        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Body: " + responseBody);

    }
}
