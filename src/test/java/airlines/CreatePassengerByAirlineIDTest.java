package airlines;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import model.CreatePassengerByAirlineIDResponseTestData;
import model.CreatePassengerByAirlineIDTestData;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class CreatePassengerByAirlineIDTest extends AirlinesApi{

    @Test(description = "This test is to create passenger by Airline ID with trips 250")
    public void createPassengerByAirLineIdTrips250Test() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLinePassenger");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonPassengerByAirlineIDRequestPayload = (JSONObject) jsonInputRequest.get("CreatePassengerByAirLineIDWithTrips250TestData");
        Response response = createAirLines(endPoint,jsonPassengerByAirlineIDRequestPayload);

        CreatePassengerByAirlineIDTestData inputJsonData = prepareInputPojoForComparison(jsonPassengerByAirlineIDRequestPayload);
        CreatePassengerByAirlineIDResponseTestData createPassengerByAirlineIDResponseData = prepareOutputPojoForComparison(response);
        createInputOutputPassengerByAirLineIdWhenTrip250(inputJsonData,createPassengerByAirlineIDResponseData);
    }

    @Test(description = "This test is to create passenger by Airline ID with trips 300")
    public void createPassengerByAirLineIdTrips300Test() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLinePassenger");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonPassengerByAirlineIDRequestPayload = (JSONObject) jsonInputRequest.get("CreatePassengerByAirLineIDWithTrips300TestData");
        Response response = createAirLines(endPoint,jsonPassengerByAirlineIDRequestPayload);

        CreatePassengerByAirlineIDTestData inputJsonData = prepareInputPojoForComparison(jsonPassengerByAirlineIDRequestPayload);
        CreatePassengerByAirlineIDResponseTestData createPassengerByAirlineIDResponseData = prepareOutputPojoForComparison(response);
        createInputOutputPassengerByAirLineIdWhenTrip300(inputJsonData,createPassengerByAirlineIDResponseData);
    }

    @Test(description = "This test is to create passenger by Airline ID with trips 350")
    public void createPassengerByAirLineIdTrips350Test() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLinePassenger");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonPassengerByAirlineIDRequestPayload = (JSONObject) jsonInputRequest.get("CreatePassengerByAirLineIDWithTrips350TestData");
        Response response = createAirLines(endPoint,jsonPassengerByAirlineIDRequestPayload);

        CreatePassengerByAirlineIDTestData inputJsonData = prepareInputPojoForComparison(jsonPassengerByAirlineIDRequestPayload);
        CreatePassengerByAirlineIDResponseTestData createPassengerByAirlineIDResponseData = prepareOutputPojoForComparison(response);
        createInputOutputPassengerByAirLineIdWhenTrip350(inputJsonData,createPassengerByAirlineIDResponseData);
    }

    @Test(description = "This test is to create passenger by Airline ID with trips 400")
    public void createPassengerByAirLineIdTrips400Test() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLinePassenger");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonPassengerByAirlineIDRequestPayload = (JSONObject) jsonInputRequest.get("CreatePassengerByAirLineIDWithTrips400TestData");
        Response response = createAirLines(endPoint,jsonPassengerByAirlineIDRequestPayload);

        CreatePassengerByAirlineIDTestData inputJsonData = prepareInputPojoForComparison(jsonPassengerByAirlineIDRequestPayload);
        CreatePassengerByAirlineIDResponseTestData createPassengerByAirlineIDResponseData = prepareOutputPojoForComparison(response);
        createInputOutputPassengerByAirLineIdWhenTrip400(inputJsonData,createPassengerByAirlineIDResponseData);
    }

    @Test(description = "This test is to create passenger by Airline ID with trips 450")
    public void createPassengerByAirLineIdTrips450Test() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLinePassenger");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonPassengerByAirlineIDRequestPayload = (JSONObject) jsonInputRequest.get("CreatePassengerByAirLineIDWithTrips450TestData");
        Response response = createAirLines(endPoint,jsonPassengerByAirlineIDRequestPayload);

        CreatePassengerByAirlineIDTestData inputJsonData = prepareInputPojoForComparison(jsonPassengerByAirlineIDRequestPayload);
        CreatePassengerByAirlineIDResponseTestData createPassengerByAirlineIDResponseData = prepareOutputPojoForComparison(response);
        createInputOutputPassengerByAirLineIdWhenTrip450(inputJsonData,createPassengerByAirlineIDResponseData);
    }


    private CreatePassengerByAirlineIDTestData prepareInputPojoForComparison(JSONObject testInputJsonData) throws JsonProcessingException {
        String inputJsonToBeCompared = AirlinesBaseTest.readInputJsonTestData(testInputJsonData);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(inputJsonToBeCompared,CreatePassengerByAirlineIDTestData.class);
    }

    private CreatePassengerByAirlineIDResponseTestData prepareOutputPojoForComparison(Response response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.getBody().asString(),CreatePassengerByAirlineIDResponseTestData.class);
    }

    private void createInputOutputPassengerByAirLineIdWhenTrip250(CreatePassengerByAirlineIDTestData input, CreatePassengerByAirlineIDResponseTestData output) {
        Assert.assertEquals(input.getName(), output.getName(), "Passenger Name is not matching");
        Assert.assertEquals(input.getTrips(), output.getTrips(), "Trips details are not matching");
    }

    private void createInputOutputPassengerByAirLineIdWhenTrip300(CreatePassengerByAirlineIDTestData input, CreatePassengerByAirlineIDResponseTestData output) {
        Assert.assertEquals(input.getName(), output.getName(), "Passenger Name is not matching");
        Assert.assertEquals(input.getTrips(), output.getTrips(), "Trips details are not matching");
    }

    private void createInputOutputPassengerByAirLineIdWhenTrip350(CreatePassengerByAirlineIDTestData input, CreatePassengerByAirlineIDResponseTestData output) {
        Assert.assertEquals(input.getName(), output.getName(), "Passenger Name is not matching");
        Assert.assertEquals(input.getTrips(), output.getTrips(), "Trips details are not matching");
    }

    private void createInputOutputPassengerByAirLineIdWhenTrip400(CreatePassengerByAirlineIDTestData input, CreatePassengerByAirlineIDResponseTestData output) {
        Assert.assertEquals(input.getName(), output.getName(), "Passenger Name is not matching");
        Assert.assertEquals(input.getTrips(), output.getTrips(), "Trips details are not matching");
    }

    private void createInputOutputPassengerByAirLineIdWhenTrip450(CreatePassengerByAirlineIDTestData input, CreatePassengerByAirlineIDResponseTestData output) {
        Assert.assertEquals(input.getName(), output.getName(), "Passenger Name is not matching");
        Assert.assertEquals(input.getTrips(), output.getTrips(), "Trips details are not matching");
    }
}
