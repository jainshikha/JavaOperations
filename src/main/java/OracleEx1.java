import java.util.*;

public class OracleEx1 {
  public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
    exercise4();
    exercise5();
  }

  //  Exercise 1: Create a string that consists of the first letter of each word in the list of
  // Strings provided.
  // HINT: Use a StringBuilder to construct the  result.
  public static void exercise1() {
    List<String> list =
        Arrays.asList("shikha", "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    StringBuilder stringBuilder = new StringBuilder();
    list.forEach(x -> stringBuilder.append(x.charAt(0)));
    System.out.println(stringBuilder.toString());
  }

  // Exercise 2: Remove the words that have odd length s from the list.
  // HINT: Use one of the new methods from JDK 8.
  public static void exercise2() {
    List<String> list =
        new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
    list.removeIf(x -> x.length() % 2 != 0);
    list.forEach(System.out::println);
    // diff

    list.removeIf(s -> (s.length() & 1) == 1);
    list.forEach(System.out::println);
  }

  // Exercise 3: Replace every word in the list with its upper case equivalent.
  // HINT: Again, use one of the new methods from JDK 8.
  public static void exercise3() {
    List<String> list =
        new ArrayList<>(Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
    list.replaceAll(String::toUpperCase);
    list.forEach(System.out::println);
  }

  // Exercise 4: Convert every key-value pair of the map into a string and  append them all into a
  // single string, in iteration order.
  // HINT: Again, use a  StringBuilder to construct the result String. Use one of the new JDK 8
  // methods for Map.
  public static void exercise4() {
    Map<String, Integer> map = new TreeMap<>();
    map.put("c", 3);
    map.put("b", 2);
    map.put("a", 1);
    StringBuilder sb = new StringBuilder();
    map.forEach((k, v) -> sb.append(String.format("%s%s", k, v)));
    System.out.println(sb.toString());
  }

  // Exercise 5: Create a new Thread that prints the numbers from the list.
  // HINT: This is a straightforward Lambda expression.
  public static void exercise5() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    new Thread(() -> list.forEach(System.out::println)).start();
  }
}
