import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

    // Base URL of your API
    String baseUrl = "http://216.10.245.166";

    @Test(dataProvider = "queryParameters")
    public void testGetProducts(String name, String pincode) {
        // Make a GET request with query parameters
        Response response = RestAssured.given()
                .baseUri(baseUrl)
                .param("name", name)
                .param("pincode", pincode)
                .get("/getProducts");

        // Extract and print the response
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        // You can also perform assertions on the response, status code, etc.
        response.then().statusCode(200);
    }

    @DataProvider(name = "queryParameters")
    public Object[][] queryParameters() {
        // Define different sets of parameters
        return new Object[][]{
                {"test1", "111"},
                {"test2", "222"},
                {"test3", "333"}
                // Add more sets as needed
        };
    }
}
