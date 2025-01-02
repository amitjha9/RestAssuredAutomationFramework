package airlines;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import utils.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class AirlinesBaseTest {

    public Map<String, Object> data ;
    public static String envName;

    public static String getEnvName() {
        String env = System.getProperty("env");
        if (env == null) {
            env = "QA";
        }
        return env;
    }

    public static Map<String, Object> getAirlineApiEndPoint() throws IOException {
        envName = getEnvName();
        return JsonUtils.getJsonDataAsMap("airlines/" + envName + "/airlinesApiData.json");
    }

    public static JSONObject getJsonInputRequestBody(String className) {
        return JsonUtils.readJSONInputFileData("airlines/" + envName + "/" + className + ".json");
    }

    public static String readInputJsonTestData(JSONObject testInputJsonData) {
        return testInputJsonData.toString();
    }
}
