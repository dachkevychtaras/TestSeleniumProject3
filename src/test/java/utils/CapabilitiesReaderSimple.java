package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileReader;
import java.util.HashMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesReaderSimple {

  private static JSONArray parseJSON(String jsonLocation) throws Exception {
    JSONParser jsonParser = new JSONParser();
    return (JSONArray) jsonParser.parse(new FileReader(jsonLocation));
  }

  private static JSONObject getCapability(String capabilityName, String jsonLocation)
      throws Exception {
    JSONArray capabilitiesArray = parseJSON(jsonLocation);
    for (Object jsonObj : capabilitiesArray) {
      JSONObject capability = (JSONObject) jsonObj;
      if (capability.get("name").toString().equalsIgnoreCase(capabilityName)) {
        return (JSONObject) capability.get("caps");
      }
    }
    return null;
  }

  private static HashMap<String, Object> convertCapsToHashMap(String capabilityName,
      String jsonLocation) throws Exception {
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.readValue(getCapability(capabilityName, jsonLocation).toString(),
        HashMap.class);
  }

  public static DesiredCapabilities getDesiredCapabilities(String capabilityName,
      String capsContentRootLocation) throws Exception {
    String jsonLocation = System.getProperty("user.dir") + "/" + capsContentRootLocation;
    HashMap<String, Object> caps = convertCapsToHashMap(capabilityName, jsonLocation);
    return new DesiredCapabilities(caps);
  }
}