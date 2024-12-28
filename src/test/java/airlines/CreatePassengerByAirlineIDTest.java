package airlines;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class CreatePassengerByAirlineIDTest extends AirlinesApi{

    @Test
    public void createPassengerByAirLineIdTest() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLineEndPoint");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonPassengerByAirlineIDRequestPayload = (JSONObject) jsonInputRequest.get("CreatePassengerByAirLineIDTest");

        Response response = createAirLines(endPoint,jsonPassengerByAirlineIDRequestPayload);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
