package airlines;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import model.UpdatePassengerByPassengerIDResponseTestData;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class UpdatePassengerByPassengerIDTest extends AirlinesApi{


    @Test(description = "This test is to update passenger by passenger ID where passenger trip details is equal to 2800")
    public void updatePassengerByIDWithTrip2800Test() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("PatchUpdatePassengerByID");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetPassengerById = (JSONObject) jsonInputRequest.get("IndianPassengerTestData");
        endPoint = endPoint + jsonGetPassengerById.get("PassengerID");

        JSONObject jsonInputPatchRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetPassengerRequestPayload = (JSONObject) jsonInputPatchRequest.get("UpdatePassengerWithTrip2800ByIDTestData");

        Response response = updateAirLinesByPatch(endPoint,jsonGetPassengerRequestPayload);
        UpdatePassengerByPassengerIDResponseTestData responseTestData = prepareOutputPojoForComparison(response);
        compareUpdatePassengerByIDWithTrip2800Test(response,responseTestData);
    }

    @Test(description = "This test is to update passenger by passenger ID where passenger trip details is equal to 2900")
    public void updatePassengerByIDWithTrip2900Test() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("PatchUpdatePassengerByID");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetPassengerById = (JSONObject) jsonInputRequest.get("AustralianPassengerTestData");
        endPoint = endPoint + jsonGetPassengerById.get("PassengerID");

        JSONObject jsonInputPatchRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonGetPassengerRequestPayload = (JSONObject) jsonInputPatchRequest.get("UpdatePassengerWithTrip2900ByIDTestData");

        Response response = updateAirLinesByPatch(endPoint,jsonGetPassengerRequestPayload);
        UpdatePassengerByPassengerIDResponseTestData responseTestData = prepareOutputPojoForComparison(response);
        compareUpdatePassengerByIDWithTrip2900Test(response,responseTestData);
    }

    private UpdatePassengerByPassengerIDResponseTestData prepareOutputPojoForComparison(Response response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.getBody().asString(),UpdatePassengerByPassengerIDResponseTestData.class);
    }

    private void compareUpdatePassengerByIDWithTrip2800Test(Response response, UpdatePassengerByPassengerIDResponseTestData responseTestData) {
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(responseTestData.getMessage(), "Passenger data updated successfully.");
    }

    private void compareUpdatePassengerByIDWithTrip2900Test(Response response, UpdatePassengerByPassengerIDResponseTestData responseTestData) {
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertEquals(responseTestData.getMessage(), "Passenger data updated successfully.");
    }
}
