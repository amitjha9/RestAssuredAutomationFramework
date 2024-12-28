package airlines;

import org.json.simple.JSONObject;
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
}
