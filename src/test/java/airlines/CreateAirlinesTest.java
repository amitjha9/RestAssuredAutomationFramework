package airlines;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class CreateAirlinesTest extends AirlinesApi{

    @Test
    public void createAirlineTest() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLineEndPoint");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonAirlineRequestPayload = (JSONObject) jsonInputRequest.get("CreateLankaAirlineTestData");
        Response response = createAirLines(endPoint,jsonAirlineRequestPayload);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
