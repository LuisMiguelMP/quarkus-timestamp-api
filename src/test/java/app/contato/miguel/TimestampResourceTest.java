package app.contato.miguel;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import javax.ws.rs.core.MediaType;



import java.sql.Timestamp;

@QuarkusTest
public class TimestampResourceTest {

    @Test
    public void testTimestampEndpoint() {
        
            TimestampResponse response = new TimestampResponse();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            response.setTimestamp(timestamp);
    
        given().contentType(MediaType.APPLICATION_JSON)
          .when().get("/timestamp")
          .then()
             .statusCode(200);
    }

}