package Chain100Days;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.Matchers.containsString;
public class ApiStatusAndHeaderTest {

    @Test
    public void shouldValidateStatusCodeAndHeaders(){

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Response response =
                given()
                        .header("Accept", "application/json")
                .when()
                        .get("/users/1")
                .then()
                        .statusCode(200)
                        .header("Content-Type", containsString("application/json"))
                        .extract()
                        .response();

        String serverHeader = response.getHeader("Server");
        assertNotNull(serverHeader);
    }
}

// Validate status code and headers of an API response