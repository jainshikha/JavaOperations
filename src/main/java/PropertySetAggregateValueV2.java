import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Optional;

/** Created by penuk00p on 1/22/2018. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE, include = JsonTypeInfo.As.PROPERTY, property = "name")
public class PropertySetAggregateValueV2 {
 // private static final Logger logger = LoggerFactory.getLogger(com.siemens.mindsphere.iot.data.PropertySetAggregateValueV2.class);

  private Long firstTime = null;
  private BigDecimal firstValue = null;

  private Long lastTime = null;
  private BigDecimal lastValue = null;

  private Long minTime = null;
  private BigDecimal minValue = null;

  private Long maxTime = null;
  private BigDecimal maxValue = null;

  private BigDecimal sum = null;
  private Double squares = null;

  private long countGood = 0;
  private long countBad = 0;
  private long countUncertain = 0;

  /**
   * Adds a value to the aggregate. Returns true if the observed value was processed. If the value
   * was not processed, e.g. if the value was not numeric, the return value is false.
   *
   * @param timeValue
   * @param value
   * @param uncertainThreshold
   * @param goodThreshold @return
   */
  public boolean add(
      long timeValue,
      Object value,
      String qualityCode,
      Optional<Long> uncertainThreshold,
      Optional<Long> goodThreshold,
      Instant booleanDate,
      ZoneId zoneId) {
    try {
      BigDecimal number = new BigDecimal(getValueString(value, booleanDate, timeValue, zoneId));
      boolean acceptedQ = true;
      boolean uncertainCount = false;

      if (qualityCode == null || qualityCode.equals("null")) {
        acceptedQ = true; // // MDS-48367 qc value not specified...always accept it as GOOD
        uncertainCount = false;
      } else {
        long qc = Long.parseLong(qualityCode);
        // MDS-80715, a chunk of the negative spectrum is now "bad"
        qc = qc <= -2130000000 ? Long.MAX_VALUE : qc;
        acceptedQ =
            (!uncertainThreshold.isPresent()
                || !goodThreshold.isPresent()
                || qc <= uncertainThreshold.get());
        uncertainCount =
            (uncertainThreshold.isPresent()
                && goodThreshold.isPresent()
                && qc <= uncertainThreshold.get()
                && qc > goodThreshold.get());
      }

      if (acceptedQ) {

        checkFirstTime(number, timeValue);
        checkMinValue(number, timeValue);
        checkMaxValue(number, timeValue);
        // update lastTime, lastValue
        lastValue = number;
        lastTime = timeValue;
        updateSum(number, uncertainCount);
      } else {
        countBad += 1L;
      }

      return true;
    } catch (NumberFormatException notNumberOrBool) {
      return false;
    } catch (Exception e) {
      System.out.println("Exception in PropertySetAggregateValueV2.add, Message {}"+ e.getMessage()+ e);
      return false;
    }
  }

  private void checkFirstTime(BigDecimal number, long timeValue) {
    // firstTime check and update lastTime, lastValue
    if (firstTime == null) {
      firstValue = number;
      firstTime = timeValue;
    }
  }

  private void checkMinValue(BigDecimal number, long timeValue) {
    // minValue check
    if ((minValue == null || number.compareTo(minValue) < 0)
        || (number.compareTo(minValue) == 0 && timeValue < minTime)) {
      minTime = timeValue;
      minValue = number;
    }
  }

  private void checkMaxValue(BigDecimal number, long timeValue) {
    // maxValue check
    if ((maxValue == null || number.compareTo(maxValue) > 0)
        || (number.compareTo(maxValue) == 0 && timeValue < maxTime)) {
      maxTime = timeValue;
      maxValue = number;
    }
  }

  private void updateSum(BigDecimal number, boolean uncertainCount) {
    if (sum == null) {
      sum = number;
    } else {
      sum = sum.add(number);
    }
    if (uncertainCount) {
      countUncertain += 1L;
    } else {
      countGood += 1L;
    }

    // update sum of squares
    double value = number.doubleValue();

    boolean isValueNaN = Double.isNaN(value) || Double.isInfinite(value);
    boolean isSquareNaN =
        (null != squares)
            && (Double.isNaN(squares.doubleValue()) || Double.isInfinite(squares.doubleValue()));

    if (isValueNaN || isSquareNaN) {
      squares = Double.NaN;

    } else if (squares == null) {
      squares = value * value;

    } else {
      squares = squares + (value * value);
    }
  }

  public void add(PropertySetAggregateValueV2 propertySetAggregateValue) {

    if ((firstTime == null || (firstTime != null && firstTime.longValue() == 0))
        && propertySetAggregateValue.getFirstTime() != null
        && propertySetAggregateValue.getFirstTime() != 0) {

      firstTime = propertySetAggregateValue.getFirstTime();
      firstValue = propertySetAggregateValue.getFirstValue();
      lastTime = propertySetAggregateValue.getFirstTime();
      lastValue = propertySetAggregateValue.getFirstValue();

    } else if (firstTime != null
        && propertySetAggregateValue.getFirstTime() != null
        && propertySetAggregateValue.getFirstTime() != 0
        && propertySetAggregateValue.getFirstTime() < firstTime) {

      firstTime = propertySetAggregateValue.getFirstTime();
      firstValue = propertySetAggregateValue.getFirstValue();
    }

    if (lastTime != null
        && propertySetAggregateValue.getLastTime() != null
        && propertySetAggregateValue.getLastTime() > lastTime) {

      lastTime = propertySetAggregateValue.getLastTime();
      lastValue = propertySetAggregateValue.getLastValue();
    }

    if (minValue == null
        || (propertySetAggregateValue.getMinValue() != null
            && (propertySetAggregateValue.getMinValue().compareTo(minValue) < 0
                || (propertySetAggregateValue.getMinValue().compareTo(minValue) == 0
                    && propertySetAggregateValue.getMinTime().compareTo(minTime) < 0)))) {

      minTime = propertySetAggregateValue.getMinTime();
      minValue = propertySetAggregateValue.getMinValue();
    }

    if (maxValue == null
        || (propertySetAggregateValue.getMaxValue() != null
            && (propertySetAggregateValue.getMaxValue().compareTo(maxValue) > 0
                || (propertySetAggregateValue.getMaxValue().compareTo(maxValue) == 0
                    && propertySetAggregateValue.getMaxTime().compareTo(maxTime) < 0)))) {

      maxTime = propertySetAggregateValue.getMaxTime();
      maxValue = propertySetAggregateValue.getMaxValue();
    }

    if (sum == null) {
      sum = propertySetAggregateValue.getSum();

    } else if (sum != null && propertySetAggregateValue.getSum() != null) {
      sum = sum.add(propertySetAggregateValue.getSum());
    }

    if (squares == null) {
      squares = propertySetAggregateValue.getSquares();

    } else if (squares != null
        && !Double.isNaN(squares.doubleValue())
        && !Double.isInfinite(squares.doubleValue())
        && propertySetAggregateValue.getSquares() != null
        && !Double.isNaN(propertySetAggregateValue.getSquares().doubleValue())
        && !Double.isInfinite(propertySetAggregateValue.getSquares().doubleValue())) {
      squares = squares + propertySetAggregateValue.getSquares();

    } else {
      squares = Double.NaN;
    }

    countGood += propertySetAggregateValue.getCountGood();
    countUncertain += propertySetAggregateValue.getCountUncertain();
    countBad += propertySetAggregateValue.getCountBad();
  }

  @JsonProperty("f")
  public Long getFirstTime() {
    return firstTime;
  }

  public void setFirstTime(Long firstTime) {
    this.firstTime = firstTime;
  }

  @JsonProperty("v")
  public BigDecimal getFirstValue() {
    return firstValue;
  }

  public void setFirstValue(BigDecimal firstValue) {
    this.firstValue = firstValue;
  }

  @JsonProperty("V")
  public BigDecimal getLastValue() {
    return lastValue;
  }

  public void setLastValue(BigDecimal lastValue) {
    this.lastValue = lastValue;
  }

  @JsonProperty("l")
  public Long getLastTime() {
    return lastTime;
  }

  public void setLastTime(Long lastTime) {
    this.lastTime = lastTime;
  }

  @JsonProperty("n")
  public BigDecimal getMinValue() {
    return minValue;
  }

  public void setMinValue(BigDecimal minValue) {
    this.minValue = minValue;
  }

  @JsonProperty("m")
  public Long getMinTime() {
    return minTime;
  }

  public void setMinTime(Long minTime) {
    this.minTime = minTime;
  }

  @JsonProperty("N")
  public BigDecimal getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
  }

  @JsonProperty("M")
  public Long getMaxTime() {
    return maxTime;
  }

  public void setMaxTime(Long maxTime) {
    this.maxTime = maxTime;
  }

  @JsonProperty("s")
  public BigDecimal getSum() {
    return sum;
  }

  public void setSum(BigDecimal sum) {
    this.sum = sum;
  }

  @JsonProperty("S")
  public Double getSquares() {
    return squares;
  }

  public void setSquares(Double squares) {
    this.squares = squares;
  }

  @JsonProperty("g")
  public long getCountGood() {
    return countGood;
  }

  public void setCountGood(long countGood) {
    this.countGood = countGood;
  }

  @JsonProperty("b")
  public long getCountBad() {
    return countBad;
  }

  public void setCountBad(long countBad) {
    this.countBad = countBad;
  }

  @JsonProperty("u")
  public long getCountUncertain() {
    return countUncertain;
  }

  public void setCountUncertain(long u) {
    this.countUncertain = u;
  }

  /**
   * Checks if the entry has a date after the boolean aggregation cutoff date, then converts the
   * value to 1/0 for true/false if the value object is a boolean; otherwise it simply returns the
   * string value of the value object
   *
   * @param value - object to be converted to a string
   * @param booleanDate - cutoff date for boolean aggregations
   * @param entryTime - read date of the current entry in milliseconds from Epoch
   * @return - String value of the value object, converted to 1/0 if the value is a boolean and the
   *     entry date is after the cutoff
   */
  private String getValueString(Object value, Instant booleanDate, long entryTime, ZoneId zoneId) {
    if (value instanceof Boolean
        && booleanDate
                .plusSeconds(booleanDate.atZone(zoneId).getOffset().getTotalSeconds())
                .toEpochMilli()
            < entryTime) {
      return (Boolean) value ? "1" : "0";
    } else {
      return String.valueOf(value);
    }
  }
}
