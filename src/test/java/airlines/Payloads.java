package airlines;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static String createAirlinePayloadFromString(String id, String name, String country, String logo, String slogon, String headQuaters, String website, String established) {

        String payload = "{\n" +
                "    \"id\":"+id+",\n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"country\": \""+country+"\",\n" +
                "    \"logo\": \""+logo+"\",\n" +
                "    \"slogan\": \""+slogon+"\",\n" +
                "    \"head_quaters\": \""+headQuaters+"\",\n" +
                "    \"website\": \""+website+"\",\n" +
                "    \"established\": \""+established+"\"\n" +
                "}";

        return payload;
    }

    public static Map<String, Object> createAirlinePayloadFromMap(String id, String name, String country, String logo, String slogon, String headQuaters, String website, String established)
    {
        Map<String,Object> payload = new HashMap<>();
        payload.put("id",id);
        payload.put("name",name);
        payload.put("country",country);
        payload.put("logo",logo);
        payload.put("slogan",slogon);
        payload.put("head_quaters",headQuaters);
        payload.put("website",website);
        payload.put("established",established);
        return payload;
    }

    public static Map<String, Object> createPassengerByAirlineIdPayloadFromMap(String name, String trip, String airlineID) {
        Map<String, Object> payload = new HashMap<>();
        payload.put("name", name);
        payload.put("trips", trip);
        payload.put("airline", airlineID);
        return payload;
    }
}
