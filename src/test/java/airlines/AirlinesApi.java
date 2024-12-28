package airlines;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AirlinesApi {

    public Map<String, Object> data ;

    public Map<String, Object> readApiEndPoint() throws IOException {
        String env = System.getProperty("env");
        if (env == null) {
            env = "QA";
        }
        return JsonUtils.getJsonDataAsMap("airlines/" + env + "/airlinesApiData.json");
    }

    public Response createAirLines(String endPoint, JSONObject requestPayload) {
        return RestUtils.performPost(endPoint, requestPayload, new HashMap<>());
    }

    public Response getAirLineByAirlineID(String airLineId) throws IOException {
       data = readApiEndPoint();
       String endPoint = (String) data.get("CreateAirLineEndPoint");
       String finalEndPoint = endPoint + "/" +airLineId;
       return RestUtils.performGet(finalEndPoint,new HashMap<>(),new HashMap<>());
    }
}
