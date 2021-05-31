
import java.time.Instant;

public interface Record extends Comparable<Record> {

  public static final String TIME = "_time";

  public static final String INSERT_TIME = "_itime";

  Instant getTime();

  Instant getInsertTime();
}
