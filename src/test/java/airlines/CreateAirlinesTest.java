package airlines;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import model.CreateAirlineTestData;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class CreateAirlinesTest extends AirlinesApi{

    @Test(description = "This Test is for SriLankan Airlines")
    public void createSriLankanAirlineTest() throws IOException {

        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLineEndPoint");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonAirlineRequestPayload = (JSONObject) jsonInputRequest.get("CreateLankaAirlineTestData");
        Response response = createAirLines(endPoint,jsonAirlineRequestPayload);

        //Schema Validation Start from here once we get api response
        CreateAirlineTestData inputJsonData = prepareInputPojoForComparison(jsonAirlineRequestPayload);
        CreateAirlineTestData createAirLineResponseData = prepareOutputPojoForComparison(response);
        compareInputOutputWhenAirlineTypeSrilankan(inputJsonData,createAirLineResponseData);
    }

    @Test(description = "This Test is for Indian Airlines")
    public void createIndianAirlinesTest() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLineEndPoint");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonAirlineRequestPayload = (JSONObject) jsonInputRequest.get("CreateIndianAirlineTestData");
        Response response = createAirLines(endPoint,jsonAirlineRequestPayload);

        //Schema Validation Start from here once we get api response
        CreateAirlineTestData inputJsonData = prepareInputPojoForComparison(jsonAirlineRequestPayload);
        CreateAirlineTestData createAirLineResponseData = prepareOutputPojoForComparison(response);
        compareInputOutputWhenAirlineTypeIndian(inputJsonData,createAirLineResponseData);
    }

    @Test(description = "This Test is for Pakistani Airlines")
    public void createPakistaniAirlinesTest() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLineEndPoint");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonAirlineRequestPayload = (JSONObject) jsonInputRequest.get("CreatePakistanAirlineTestData");
        Response response = createAirLines(endPoint,jsonAirlineRequestPayload);

        //Schema Validation Start from here once we get api response
        CreateAirlineTestData inputJsonData = prepareInputPojoForComparison(jsonAirlineRequestPayload);
        CreateAirlineTestData createAirLineResponseData = prepareOutputPojoForComparison(response);
        compareInputOutputWhenAirlineTypePakistan(inputJsonData,createAirLineResponseData);
    }

    @Test(description = "This Test is for Australian Airlines")
    public void createAustralianAirlinesTest() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("CreateAirLineEndPoint");

        JSONObject jsonInputRequest = AirlinesBaseTest.getJsonInputRequestBody(this.getClass().getSimpleName());
        JSONObject jsonAirlineRequestPayload = (JSONObject) jsonInputRequest.get("CreateAustralianAirlineTestData");
        Response response = createAirLines(endPoint,jsonAirlineRequestPayload);

        //Schema Validation Start from here once we get api response
        CreateAirlineTestData inputJsonData = prepareInputPojoForComparison(jsonAirlineRequestPayload);
        CreateAirlineTestData createAirLineResponseData = prepareOutputPojoForComparison(response);
        compareInputOutputWhenAirlineTypeAustralian(inputJsonData,createAirLineResponseData);
    }

    private CreateAirlineTestData prepareInputPojoForComparison(JSONObject testInputJsonData) throws JsonProcessingException {
        String inputJsonToBeCompared = AirlinesBaseTest.readInputJsonTestData(testInputJsonData);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(inputJsonToBeCompared,CreateAirlineTestData.class);
    }

    private CreateAirlineTestData prepareOutputPojoForComparison(Response response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response.getBody().asString(),CreateAirlineTestData.class);
    }


    private void compareInputOutputWhenAirlineTypeSrilankan(CreateAirlineTestData inputData, CreateAirlineTestData outputData) {
        Assert.assertEquals(inputData.getName(), outputData.getName(),"Airline name is not matching");
        Assert.assertEquals(inputData.getCountry(), outputData.getCountry(),"Airline Country is not matching");
        Assert.assertEquals(inputData.getLogo(), outputData.getLogo(),"Airline Logo is not matching");
        Assert.assertEquals(inputData.getSlogan(), outputData.getSlogan(),"Airline Slogon is not matching");
        Assert.assertEquals(inputData.getHead_quaters(), outputData.getHead_quaters(),"Airline head quaters is not matching");
        Assert.assertEquals(inputData.getWebsite(), outputData.getWebsite(),"Airline website is not matching");
        Assert.assertEquals(inputData.getEstablished(), outputData.getEstablished(),"Airline established is not matching");
    }

    private void compareInputOutputWhenAirlineTypeIndian(CreateAirlineTestData inputData, CreateAirlineTestData outputData) {
        Assert.assertEquals(inputData.getName(), outputData.getName(),"Airline name is not matching");
        Assert.assertEquals(inputData.getCountry(), outputData.getCountry(),"Airline Country is not matching");
        Assert.assertEquals(inputData.getLogo(), outputData.getLogo(),"Airline Logo is not matching");
        Assert.assertEquals(inputData.getSlogan(), outputData.getSlogan(),"Airline Slogon is not matching");
        Assert.assertEquals(inputData.getHead_quaters(), outputData.getHead_quaters(),"Airline head quaters is not matching");
        Assert.assertEquals(inputData.getWebsite(), outputData.getWebsite(),"Airline website is not matching");
        Assert.assertEquals(inputData.getEstablished(), outputData.getEstablished(),"Airline established is not matching");
    }

    private void compareInputOutputWhenAirlineTypePakistan(CreateAirlineTestData inputData, CreateAirlineTestData outputData) {
        Assert.assertEquals(inputData.getName(), outputData.getName(),"Airline name is not matching");
        Assert.assertEquals(inputData.getCountry(), outputData.getCountry(),"Airline Country is not matching");
        Assert.assertEquals(inputData.getLogo(), outputData.getLogo(),"Airline Logo is not matching");
        Assert.assertEquals(inputData.getSlogan(), outputData.getSlogan(),"Airline Slogon is not matching");
        Assert.assertEquals(inputData.getHead_quaters(), outputData.getHead_quaters(),"Airline head quaters is not matching");
        Assert.assertEquals(inputData.getWebsite(), outputData.getWebsite(),"Airline website is not matching");
        Assert.assertEquals(inputData.getEstablished(), outputData.getEstablished(),"Airline established is not matching");
    }

    private void compareInputOutputWhenAirlineTypeAustralian(CreateAirlineTestData inputData, CreateAirlineTestData outputData) {
        Assert.assertEquals(inputData.getName(), outputData.getName(),"Airline name is not matching");
        Assert.assertEquals(inputData.getCountry(), outputData.getCountry(),"Airline Country is not matching");
        Assert.assertEquals(inputData.getLogo(), outputData.getLogo(),"Airline Logo is not matching");
        Assert.assertEquals(inputData.getSlogan(), outputData.getSlogan(),"Airline Slogon is not matching");
        Assert.assertEquals(inputData.getHead_quaters(), outputData.getHead_quaters(),"Airline head quaters is not matching");
        Assert.assertEquals(inputData.getWebsite(), outputData.getWebsite(),"Airline website is not matching");
        Assert.assertEquals(inputData.getEstablished(), outputData.getEstablished(),"Airline established is not matching");
    }
}
