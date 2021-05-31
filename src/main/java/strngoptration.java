import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class strngoptration {
  public static void main(String[] args) {
    //
    Instant time = Instant.ofEpochMilli(1609408806180l).truncatedTo(ChronoUnit.HOURS);
    System.out.println(time);
    System.out.println(time.toEpochMilli());
    Map<String, Object> values = new HashMap<>();
    Instant instant = Instant.parse("2020-12-31T10:00:06.180Z");
    System.out.println((Instant.parse("2020-12-31T10:00:06.180Z")));
    values.put("time", (Instant.parse("2020-12-31T10:00:06.180Z").toEpochMilli()));
    values.remove("pk");
    System.out.println(values);
  }

  public static Object convertTo(Object src, Class<?> cls) {
    if (cls == null || cls.isAssignableFrom(src.getClass())) {
      return src;
    }

    if (cls == String.class) {
      return toString(src);
    }

    if (src instanceof Boolean && cls == Boolean.TYPE) {
      return src;
    }
    return src;
  }

  public static String toString(Object value) {
    if (value == null) {
      return "null";
    }

    if (value instanceof LocalDateTime) {
      return ((LocalDateTime) value).format(DateTimeFormatter.ISO_DATE_TIME) + "Z";
    }

    if (value instanceof Date) {
      return Instant.ofEpochMilli(((Date) value).getTime()).toString();
    }

    return value.toString();
  }
}
