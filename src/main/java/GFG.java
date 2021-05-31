import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GFG {

  // main Driver
  public static void main(String[] args) {
    Map<String, Integer> map1 = new HashMap<>();
    map1.put("wer", 0);
    map1.put("wer1", 0);
    map1.put("wer2", 0);
    map1.put("wer", 1);

    // create a list
    List<String> lt = new ArrayList<>();

    // add the member of list
    lt.add("Geeks");
    lt.add("For");
    lt.add("new Geeks");
    Integer zero = 0;
    // create map with the help of
    // Collectors.toMap() method
    //    Map<String, Integer> map =
    //        lt.stream().collect(Collectors.toMap(Function.identity(), String::valueOf(zero)));
    Map<String, Integer> map = new HashMap<>();
    for (String ten : lt) {
      map.put(ten, 0);
    }
    // print map
    map1.forEach((x, y) -> System.out.println(x + "=" + y));
  }
}
