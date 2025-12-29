package Chain100Days;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class JsonPathExample {

    public static void main(String[] args) {

        Response response =
                given()
                        .when()
                        .get("https://jsonplaceholder.typicode.com/users/1");

        String name = response.jsonPath().getString("name");
        String city = response.jsonPath().getString("address.city");
        int id = response.jsonPath().getInt("id");

        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("ID: " + id);
    }
}

// Extract a field from JSON response using JsonPath