package app.contato.miguel;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Timestamp;


@Path("/timestamp")
@ApplicationScoped

public class TimestampResource {

    private TimestampResponse generateResponse() {
        TimestampResponse response = new TimestampResponse();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        response.setTimestamp(timestamp);
        return response;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public TimestampResponse getTimestampWithJson() {

        return generateResponse();
    }
}