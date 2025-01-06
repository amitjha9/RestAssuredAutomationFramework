package airlines;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class GetPassengerByPassengerIDTest extends AirlinesApi {

    @Test(description = "This test is to get the detail of indian passenger by using their id")
    public void getIndianPassengerByPassengerIDTest() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("GetPassengerByPassengerID");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetAirlineById = (JSONObject) jsonInputRequest.get("GetIndianPassengerByPassengerIDTestData");
        endPoint = endPoint + jsonGetAirlineById.get("PassengerID");
        Response response = getAirLines(endPoint);
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test(description = "This test is to get the detail of australian passenger by using their id")
    public void getAustralianPassengerByPassengerIDTest() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("GetPassengerByPassengerID");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetAirlineById = (JSONObject) jsonInputRequest.get("GetAustralianPassengerByPassengerIDTestData");
        endPoint = endPoint + jsonGetAirlineById.get("PassengerID");
        Response response = getAirLines(endPoint);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
