import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExamples {
  private static final String DELIMITER = ",";

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
   /* JSONParser jsonParser = new JSONParser();

    try (FileReader reader = new FileReader("sampleJson.json"))
    {
    JSONObject jsonObject = new JSONObject((Map) reader);
      System.out.println("87871");
   *//*   JSONArray jsonArray = (JSONArray) jsonObject.get("a");
      System.out.println("");
      System.out.println("Contact details: ");
      //Iterating the contents of the array
      Iterator<String> iterator = jsonArray.iterator();
      while(iterator.hasNext()) {
        System.out.println(iterator.next());
      }*//*

      JSONArray menu = (JSONArray) jsonObject.get("a");
      Map<String,String> map = new HashMap<String,String>();
      Iterator iter = menu.keys();
      while(iter.hasNext()){
        String key = (String)iter.next();
        String value = menu.getString(key);
        map.put(key,value);
      }

   */ // JSON parser object to parse read file
    JSONParser jsonParser = new JSONParser();

    try (FileReader reader = new FileReader("sampleJson.json")) {
      // Read JSON file
    Object obj = jsonParser.parse(reader);

      ObjectMapper oMapper = new ObjectMapper();
      Map<String, Map<String,Object>> map = oMapper.convertValue(obj, Map.class);
      System.out.println("entry set  "+map.get("a").entrySet());
      System.out.println("key set "+ map.get("a").keySet());
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("exception is : " + e.getMessage() + e.getCause());
    }
  }
}
