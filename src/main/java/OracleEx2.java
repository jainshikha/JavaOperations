import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.stream.Collectors;

public class OracleEx2 {
  //    Exercise 1: Create a new list with all the strings from original list converted to lower
  // case and print them out.
  private static void exercise1() {
    List<String> list =
        Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
    list.stream().map(String::toLowerCase).forEach(System.out::print);
  }
  //    Exercise 2: Modify exercise 1 so that the new list only contains strings that have an odd
  // length.
  private static void exercise2() {
    List<String> list =
        Arrays.asList("The", "Quick", "BROWN", "Fox", "Jumped", "Over", "The", "LAZY", "DOG");
    list.stream()
        .filter(x -> x.length() % 2 == 0)
        .map(String::toLowerCase)
        .forEach(System.out::print);
  }
  //    Exercise 3: Join the second, third and forth strings of the list into a single string, where
  // each word is separated by a hyphen (-). Print the resulting string.
  private static void exercise3() {
    List<String> list =
        Arrays.asList("The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");

    String mrg = list.stream().skip(1).limit(3).collect(Collectors.joining("-"));
    System.out.println(mrg);
    List<Integer> numList = Arrays.asList(10, 43, 2, 3, 4, 5, 22, 5, 21, 6);

    Collections.sort(numList, Collections.reverseOrder());
    numList.stream().skip(1).limit(1).forEach(System.out::println);

  }
  //    Exercise 4: Count the number of lines in the file using the BufferedReader provided.
  private static void exercise4() throws IOException {
    try (BufferedReader reader =
        Files.newBufferedReader(Paths.get("SonnetI.txt","./"), StandardCharsets.UTF_8)) {
      long count = reader.lines().count();
      System.out.println(count);
    }
  }
  //    Exercise 5: Using the BufferedReader to access the file, create a list of words with no
  // duplicates contained in the file. Print the words. HINT: A regular expression, WORD_REGEXP, is
  // already defined for your use.
  private static void exercise5() throws IOException {
    try (BufferedReader reader =
        Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8)) {
      /* YOUR CODE HERE */
    }
  }
  //    Exercise 6: Using the BufferedReader to access the file create a list of words from`the
  // file, converted to lower-case and with duplicates removed, which is sorted by natural order.
  // Print the contents of the list.
  private static void exercise6() throws IOException {
    try (BufferedReader reader =
        Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8)) {
      /* YOUR CODE HERE */
    }
  }

  //    Exercise 7: Modify exercise6 so that the words are sorted by length. Print the contents of
  // the list.
  private static void exercise7() throws IOException {
    try (BufferedReader reader =
        Files.newBufferedReader(Paths.get("SonnetI.txt"), StandardCharsets.UTF_8)) {
      /* YOUR CODE HERE */
    }
  }

  public static void main(String[] args) throws IOException {
    //
    System.out.println("exercise1() result----------------");
    exercise1();
    System.out.println("exercise2() result----------------");
    exercise2();
    System.out.println("exercise3() result----------------");
    exercise3();
    System.out.println("exercise4() result----------------");
    exercise4();
  /*  exercise5();
    exercise6();
    exercise7();*/

  }
}
