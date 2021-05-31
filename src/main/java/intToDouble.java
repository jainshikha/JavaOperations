import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class intToDouble {
  public static void main(String[] args) {
    int i = 590776171;
    Double d = new Double(i); // first way
    System.out.println(d);
    Instant date = Instant.parse("2021-04-03T00:00:00.001Z").truncatedTo(ChronoUnit.HOURS);
    System.out.println(date.isBefore(Instant.now()));
    System.out.println(3>3);
    System.out.println(3>=3);

  }
}
