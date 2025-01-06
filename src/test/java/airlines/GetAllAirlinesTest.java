package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class GetAllAirlinesTest extends AirlinesApi{

    @Test(description = "This test is use to get the list of all the airlines")
    public void getAllAirlinesTest() throws IOException {
        Map<String, Object> getData = AirlinesBaseTest.getAirlineApiEndPoint();
        String endPoint = (String) getData.get("GetAllAirlines");
        Response response = getAirLines(endPoint);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
