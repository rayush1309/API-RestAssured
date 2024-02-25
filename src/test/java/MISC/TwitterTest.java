package MISC;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class TwitterTest {

    String consumerKey = "YOUR_CLIENTKEY";
    String consumerSecret = "YOUR_CLIENT_SECRET";
    String accessTokenSecret = "YOUR_ACCESSKEY";
    String secretToken = "YOUR_ACCESSSECRET";

    @BeforeClass
    public static void init(){
        RestAssured.baseURI="https://api.twitter.com";
        RestAssured.basePath="/1.1/statuses";
    }

    @Ignore
    @Test
    public void createTweet(){
        given()
                .auth()
                .oauth(consumerKey, consumerSecret, accessTokenSecret, secretToken)
                .queryParam("status", "This is my first tweet from Rest Assured")
                .log()
                .all()
                .when()
                .post("/update.json")
                .then()
                .log()
                .all();
    }

    @Test
    public void getTweets(){
        given()
                .auth()
                .oauth(consumerKey, consumerSecret, accessTokenSecret, secretToken)
                .queryParam("screen_name", "YOUR SCREEN NAME")
                .log()
                .all()
                .when()
                .get("/user_timeline")
                .then()
                .log()
                .all();
    }
}
