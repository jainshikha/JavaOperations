import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

  public static void main(String[] args) {
    System.out.println(
        "test " + getFirstNonRepeatedChar("Go hang a salami, I m a lasagna hog!") + " test");
    /*System.out.println("  Please  enter  the  input  string  :");
    Scanner in = new Scanner(System.in); // read from System input
    String input = in.nextLine();
    Character firstNonRepeatedChar = logic(input);
    System.out.println("The  first  non  repeated  character  is  :    " + firstNonRepeatedChar);
    in.close();
    */
  }

/*
  private static Character logic(String input) {
    Character result =
        input
            .chars() // string stream
            .mapToObj(
                i ->
                    Character.toLowerCase(
                        Character.valueOf(
                            (char) i))) // convert to lowercase & then to Character object
            .collect(
                Collectors.groupingBy(
                    Function.identity(),
                    LinkedHashMap::new,
                    Collectors.counting())) // store in a map with the count
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1L)
            .map(entry -> entry.getKey())
            .findFirst()
            .get();

    return result;
  }
*/

  public static String getFirstNonRepeatedChar(String str) {
    Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
    for (char c : str.toLowerCase().toCharArray()) {
      counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
    }
    for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
      if (entry.getValue() == 1) {
        return String.valueOf(entry.getKey());
      }
    }
    return "";
  }
}
