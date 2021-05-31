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

      String[] countries = {"1,2,3,7,5"};
      int[] n  = {71,5 , 8,1,2,3,7};
      Arrays.sort(n);

//sorts string array in alphabetical order or ascending order
      Arrays.sort(countries);
//prints the sorted string array in ascending order
      System.out.println(Arrays.toString(countries));
      String loginToken = "[w,dsd3,4svdf]";
      String[] aggregateFields = ( loginToken.substring( 1, loginToken.length() - 1 ).split(",") );
    System.out.println(aggregateFields[0]);
  }
}
