package airlines;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class DeletePassengerByPassengerIDTest extends AirlinesApi{


    @Test(description = "This test is to delete indian passenger using passenger ID")
    public void deleteAirLineIndianPassengerByIdTest() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("DeletePassengerByID");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetPassengerById = (JSONObject) jsonInputRequest.get("DeleteIndianPassengerByPassengerIDTestData");
        endPoint = endPoint + jsonGetPassengerById.get("PassengerID");

        Response response = deleteAirLine(endPoint);
        Assert.assertEquals(response.getStatusCode(),200);
    }


    @Test(description = "This test is to delete australian passenger using passenger ID")
    public void deleteAirLineAustralianPassengerByIdTest() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("DeletePassengerByID");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetPassengerById = (JSONObject) jsonInputRequest.get("DeleteAustralianPassengerByPassengerIDTestData");
        endPoint = endPoint + jsonGetPassengerById.get("PassengerID");

        Response response = deleteAirLine(endPoint);
        Assert.assertEquals(response.getStatusCode(),200);

        //Just Assert
    }
}
