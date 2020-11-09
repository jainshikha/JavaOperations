import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class StringJava8 {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("dog", "over", "good");
    System.out.println(
        list.stream()
            .reduce(
                "",
                (x1, x2) -> {
                  if (x1.equals("dog")) return x1;
                  return x2;
                }));
  }
}
