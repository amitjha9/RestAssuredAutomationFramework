package airlines;


import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class GetAirlineByAirlineIDTest extends AirlinesApi{


    @Test(description = "This test is to get the Airline details by Airline ID")
    public void getAirlineByAirlineIDTest() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("GetAirlineByAirlineID");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetAirlineById = (JSONObject) jsonInputRequest.get("GetAirlineByAirlineIDTestData");
        endPoint = endPoint + jsonGetAirlineById.get("airlineId");
        Response response = getAirLines(endPoint);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
