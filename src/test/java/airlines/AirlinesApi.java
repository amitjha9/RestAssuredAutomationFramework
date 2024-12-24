package airlines;

import io.restassured.response.Response;
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
        Map<String, Object> dataMap = JsonUtils.getJsonDataAsMap("airlines/" + env + "/airlinesApiData.json");
        return dataMap;
    }

    public Response createAirlines(Map<String, Object> createAirlinePayload) throws IOException {
        data = readApiEndPoint();
        String endPoint = (String) data.get("CreateAirLineEndPoint");
        return RestUtils.performPost(endPoint, createAirlinePayload, new HashMap<>());
    }

    public Response createPassengerByAirLineID(Map<String, Object> createPassengerByAirlineIdPayload) throws IOException {
        data = readApiEndPoint();
        String endPoint = (String) data.get("CreateAirLinePassenger");
        return RestUtils.performPost(endPoint,createPassengerByAirlineIdPayload,new HashMap<>());
    }
}
