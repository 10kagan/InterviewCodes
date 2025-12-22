package Chain100Days;

import com.jayway.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class UserApiTest {

    @BeforeClass
    public static void setup(){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void shouldGetUserById(){

        given()
                .log().all()
        .when()
                .get("/users/1")
        .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("username", notNullValue());

    }

    @Test
    public void shouldSearchUserWithQueryParam(){
        given()
                .queryParam("username", "Bret")
        .when()
                .get("/users")
        .then()
                .statusCode(200)
                .body("username", hasItem("Bret"));
    }
}

// Test a REST API call using RestAssured