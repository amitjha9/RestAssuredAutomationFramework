package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

public class CreateAirlinesTest extends AirlinesApi{

    @Test
    public void createAirlineTest() throws IOException {
        Map<String, Object> requestPayload = Payloads.createAirlinePayloadFromMap("55668", "SpiceJet", "India", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png", "From India", "Delhi India", "www.srilankaaairways.com", "2002");
        Response response = createAirlines(requestPayload);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
