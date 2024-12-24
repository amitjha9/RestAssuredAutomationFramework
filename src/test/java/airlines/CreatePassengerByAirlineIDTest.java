package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class CreatePassengerByAirlineIDTest extends AirlinesApi{

    @Test
    public void createPassengerByAirLineIdTest() throws IOException {
        Map<String,Object> requestPayload = Payloads.createPassengerByAirlineIdPayloadFromMap("John Dell","250","73dd5420-3bf9-48f3-a0b6-17cf7aa61b19");
        Response response =createPassengerByAirLineID(requestPayload);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
