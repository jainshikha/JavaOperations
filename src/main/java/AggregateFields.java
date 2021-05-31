import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

public enum AggregateFields {
  FirstTime(0, AggregateValueOperations.SETFIRSTTIME, AggregateValueOperations.GETFIRSTTIME),
  FirstValue(1, AggregateValueOperations.SETFIRSTVALUE, AggregateValueOperations.GETFIRSTVALUE),
  LastTime(2, AggregateValueOperations.SETLASTTIME, AggregateValueOperations.GETLASTTIME),
  LastValue(3, AggregateValueOperations.SETLASTVALUE, AggregateValueOperations.GETLASTVALUE),
  MinTime(4, AggregateValueOperations.SETMINTIME, AggregateValueOperations.GETMINTIME),
  MinValue(5, AggregateValueOperations.SETMINVALUE, AggregateValueOperations.GETMINVALUE),
  MaxTime(6, AggregateValueOperations.SETMAXTIME, AggregateValueOperations.GETMAXTIME),
  MaxValue(7, AggregateValueOperations.SETMAXVALUE, AggregateValueOperations.GETMAXVALUE),
  Sum(8, AggregateValueOperations.SETSUM, AggregateValueOperations.GETSUM),
  Squares(9, AggregateValueOperations.SETSQUARES, AggregateValueOperations.GETSQUARES),
  CountGood(10, AggregateValueOperations.SETGOOD, AggregateValueOperations.GETGOOD),
  CountBad(11, AggregateValueOperations.SETBAD, AggregateValueOperations.GETBAD),
  CountUncertain(12, AggregateValueOperations.SETUNCERTAIN, AggregateValueOperations.GETUNCERTAIN);

  private int index;

  private static final Map<Integer, AggregateFields> LOOKUP = new HashMap<>();

  static {
    Arrays.stream(AggregateFields.values())
        .forEach(aggregateField -> LOOKUP.put(aggregateField.getIndex(), aggregateField));
  }

  private BiConsumer<String, PropertySetAggregateValueV2> setterFunction;

  private Function<PropertySetAggregateValueV2, String> getterFunction;

  private AggregateFields(
      int index,
      BiConsumer<String, PropertySetAggregateValueV2> setterFunction,
      Function<PropertySetAggregateValueV2, String> getterFunction) {
    this.index = index;
    this.setterFunction = setterFunction;
    this.getterFunction = getterFunction;
  }

  public int getIndex() {
    return this.index;
  }

  public static AggregateFields getField(int index) {
    return LOOKUP.get(index);
  }

  public BiConsumer<String, PropertySetAggregateValueV2> getSetterFunction() {
    return setterFunction;
  }

  public Function<PropertySetAggregateValueV2, String> getGetterFunction() {
    return getterFunction;
  }
}
