import java.math.BigDecimal;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class AggregateValueOperations {

  private AggregateValueOperations() {
    // Def
  }

  // Aggregate setter functions
  public static BiConsumer<String, PropertySetAggregateValueV2> SETFIRSTTIME =
      (firstTimeString, aggregateValue) ->
          aggregateValue.setFirstTime(Long.parseLong(firstTimeString));
  public static BiConsumer<String, PropertySetAggregateValueV2> SETFIRSTVALUE =
      (firstTimeValue, aggregateValue) ->
          aggregateValue.setFirstValue(new BigDecimal(firstTimeValue));

  public static BiConsumer<String, PropertySetAggregateValueV2> SETLASTTIME =
      (lastTime, aggregateValue) -> aggregateValue.setLastTime(Long.parseLong(lastTime));
  public static BiConsumer<String, PropertySetAggregateValueV2> SETLASTVALUE =
      (lastValue, aggregateValue) -> aggregateValue.setLastValue(new BigDecimal(lastValue));

  public static BiConsumer<String, PropertySetAggregateValueV2> SETMINTIME =
      (minTime, aggregateValue) -> aggregateValue.setMinTime(Long.parseLong(minTime));
  public static BiConsumer<String, PropertySetAggregateValueV2> SETMINVALUE =
      (minValue, aggregateValue) -> aggregateValue.setMinValue(new BigDecimal(minValue));

  public static BiConsumer<String, PropertySetAggregateValueV2> SETMAXTIME =
      (maxTime, aggregateValue) -> aggregateValue.setMaxTime(Long.parseLong(maxTime));
  public static BiConsumer<String, PropertySetAggregateValueV2> SETMAXVALUE =
      (maxValue, aggregateValue) -> aggregateValue.setMaxValue(new BigDecimal(maxValue));

  public static BiConsumer<String, PropertySetAggregateValueV2> SETSUM =
      (sum, aggregateValue) -> aggregateValue.setSum(new BigDecimal(sum));

  public static BiConsumer<String, PropertySetAggregateValueV2> SETSQUARES =
      (squares, aggregateValue) -> aggregateValue.setSquares(Double.parseDouble(squares));

  public static BiConsumer<String, PropertySetAggregateValueV2> SETGOOD =
      (countGood, aggregateValue) -> aggregateValue.setCountGood(Long.parseLong(countGood));
  public static BiConsumer<String, PropertySetAggregateValueV2> SETBAD =
      (countBad, aggregateValue) -> aggregateValue.setCountBad(Long.parseLong(countBad));
  public static BiConsumer<String, PropertySetAggregateValueV2> SETUNCERTAIN =
      (countUncertain, aggregateValue) ->
          aggregateValue.setCountUncertain(Long.parseLong(countUncertain));

  // Aggregate getter functions
  public static Function<PropertySetAggregateValueV2, String> GETFIRSTTIME =
      aggregateValue -> aggregateValue.getFirstTime().toString();
  public static Function<PropertySetAggregateValueV2, String> GETFIRSTVALUE =
      aggregateValue -> aggregateValue.getFirstValue().toString();

  public static Function<PropertySetAggregateValueV2, String> GETLASTTIME =
      aggregateValue -> aggregateValue.getLastTime().toString();
  public static Function<PropertySetAggregateValueV2, String> GETLASTVALUE =
      aggregateValue -> aggregateValue.getLastValue().toString();

  public static Function<PropertySetAggregateValueV2, String> GETMINTIME =
      aggregateValue -> aggregateValue.getMinTime().toString();
  public static Function<PropertySetAggregateValueV2, String> GETMINVALUE =
      aggregateValue -> aggregateValue.getMinValue().toString();

  public static Function<PropertySetAggregateValueV2, String> GETMAXTIME =
      aggregateValue -> aggregateValue.getMaxTime().toString();
  public static Function<PropertySetAggregateValueV2, String> GETMAXVALUE =
      aggregateValue -> aggregateValue.getMaxValue().toString();

  public static Function<PropertySetAggregateValueV2, String> GETSUM =
      aggregateValue -> aggregateValue.getSum().toString();

  public static Function<PropertySetAggregateValueV2, String> GETSQUARES =
      aggregateValue -> aggregateValue.getSquares().toString();

  public static Function<PropertySetAggregateValueV2, String> GETGOOD =
      aggregateValue -> String.valueOf(aggregateValue.getCountGood());
  public static Function<PropertySetAggregateValueV2, String> GETBAD =
      aggregateValue -> String.valueOf(aggregateValue.getCountBad());
  public static Function<PropertySetAggregateValueV2, String> GETUNCERTAIN =
      aggregateValue -> String.valueOf(aggregateValue.getCountUncertain());
}
