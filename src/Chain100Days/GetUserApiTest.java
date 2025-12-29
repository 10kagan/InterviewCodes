package Chain100Days;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GetUserApiTest {

    @Test
    public void shouldGetUserById(){

        RestAssured.baseURI ="https://jsonplaceholder.typicode.com";

        Response response =
                given()
                        .header("Accept","application/json")
                .when()
                        .get("/users/1")
                .then()
                        .statusCode(200)
                        .extract()
                        .response();

        int id = response.jsonPath().getInt("id");
        String name = response.jsonPath().getString("name");

        assertEquals(1, id);
        assertNotNull(name);

    }
}

// Write a test for a REST GET endpoint using RestAssured