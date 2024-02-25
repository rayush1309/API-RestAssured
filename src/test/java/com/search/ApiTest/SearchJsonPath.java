package com.search.ApiTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
/*
public class SearchJsonPath {
    static final String APIkey = "75e3u4sgb2khg673cbv2gjup";

    @BeforeClass
    public static void init() {
        RestAssured.baseURI = "http://walmartlabs.com";
        RestAssured.basePath = "/v1";
    }

    // Extract Num Items
    @Test
    public void test001() {
        given().queryParam("query", "ipod")
                .queryParam("apiKey", APIkey)
                .contentType(ContentType.JSON) // Specify JSON as the expected response format
                .when()
                .get("/search")
                .then()
                .log().all()
                .body().extract().response().asString();
                //.statusCode(200);
    }
}
*/