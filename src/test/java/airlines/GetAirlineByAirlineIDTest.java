package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetAirlineByAirlineIDTest extends AirlinesApi{


    @Test
    public void getAirlineByAirlineIDTest() throws IOException {
        String airLineID = "87dacc97-3c9a-4dfe-8719-062153eabca9";
        Response response = getAirLineByAirlineID(airLineID);
        Assert.assertEquals(response.getStatusCode(), 200);
    }

}
