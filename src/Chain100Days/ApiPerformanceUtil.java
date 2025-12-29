package Chain100Days;

import io.restassured.response.Response;

import static org.junit.Assert.assertTrue;

public class ApiPerformanceUtil {

    public static void assertResponseTime(Response response, long maxMillis){

        long responseTime = response.getTime();
        System.out.println("Response time: " + responseTime + " ms");

        assertTrue("Response time exceeded limit!", responseTime <= maxMillis);
    }
}

// Write a Java method to test response time of an API