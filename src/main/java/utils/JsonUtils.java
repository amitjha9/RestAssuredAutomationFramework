package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class JsonUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static Map<String,Object> getJsonDataAsMap(String jsonFileName) throws IOException {
        String filePath = System.getProperty("user.dir") + "/src/test/resources/" +jsonFileName;
        return objectMapper.readValue(new File(filePath), new TypeReference<>() {});
    }

    public static JSONObject readJSONInputFileData(String fileName) {
        JSONObject jsonObject;
        String jsonFilePath = System.getProperty("user.dir") + "/src/test/resources/" + fileName;
        try {
            FileReader reader = new FileReader(jsonFilePath);
            JSONParser jsonParser = new JSONParser();
            jsonObject = (JSONObject) jsonParser.parse(reader);
        } catch (Exception e) {
            throw new RuntimeException("Not able to find file at path " + jsonFilePath);
        }
        return jsonObject;
    }
}
