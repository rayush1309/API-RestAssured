package dataDrivenTest;
import java.sql.*;

import static javax.swing.text.DefaultStyledDocument.ElementSpec.ContentType;
import static org.assertj.core.api.BDDAssumptions.given;
import static org.hamcrest.Matchers.equalTo;


public class ddtest {
    public static void main(String[] args) {
        /*
        try {
            // Step 1: Set up the Database Connection
            Connection connection = DriverManager.getConnection("jdbc:your_database_url", "username", "password");

            // Step 2: Write SQL Query
            String sqlQuery = "SELECT partNumber FROM master WHERE brand = 'Gm' AND qty > 10";

            // Step 3: Execute the SQL Query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Step 4: Integrate with Selenium and Rest Assured
            while (resultSet.next()) {
                String partNumber = resultSet.getString("partNumber");

                // Step 5: Automate Rest Assured Post Request
                given()
                        .contentType(ContentType)
                        .body("{ \"partNumber\": \"" + partNumber + "\", \"brand\": \"Gm\", \"qty\": 15 }")
                        .when()
                        .post("your/api/endpoint")
                        .then()
                        .statusCode(200)
                        .body("status", equalTo("success"));
            }

            // Step 6: Close the database connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


         */

    }
}
