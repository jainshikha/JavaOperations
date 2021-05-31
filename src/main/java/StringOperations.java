import java.util.*;
import java.util.stream.Stream;

public class StringOperations {
  public static void main(String[] args) {
    // create character list and initialize
    List<String> str = new ArrayList<>();
    str.add("ten1");
    str.add("ten2");
    str.add("ten3");
    str.add("ten4");
    StringBuilder stringBuilder = new StringBuilder();
    // convert in string
    // using collect and joining() method
    // String string = str.stream().map(String::valueOf).collect(Collectors.joining(" or
    // PartitionKey eq '"));
    for (String s : str)
      // print string
      stringBuilder.append("PartitionKey eq '" + s + "' or ");
    // System.out.println("----- "+stringBuilder);

    Map<String, Long> tenantUsageMap = new HashMap<>();
    tenantUsageMap.put("ten11", (long) 8);
    tenantUsageMap.put("ten12", (long) 7);
    tenantUsageMap.put("ten13", (long) 9);
    tenantUsageMap.put("ten14", (long) 81);

    for (Map.Entry<String, Long> entry : tenantUsageMap.entrySet()) {
      System.out.println("Hash map key : " + entry.getKey());
      System.out.println("Hash map value : " + entry.getValue());
    }
    // checking size for initial hashmap.
    int initSize = (int) Math.ceil(100 / 0.75);
    System.out.println("initial hashmap size " + initSize);

    // List operation
    List<Map<List<Integer>, List<String>>> opl = new ArrayList<>();
    Map<List<Integer>, List<String>> opmm = new HashMap<>();
    opl.add(null);
    opl.add(opmm);
    opl.add(new HashMap<List<Integer>, List<String>>());

    opl.forEach(e -> System.out.println(e + " "));

    // stream operation
    System.out.println("***************");
    System.out.println(
        Stream.of("green", "yellow", "blue")
            .max((s1, s2) -> s1.compareTo(s2))
            .filter(s -> s.endsWith("n"))
            .orElse("yellow"));
    List<String> listDummy = Arrays.asList("Coding", "is", "fun");
  }
}
