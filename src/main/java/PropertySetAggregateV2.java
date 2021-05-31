import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.Instant;
import java.time.ZoneId;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@JsonTypeInfo(use = JsonTypeInfo.Id.NONE, include = JsonTypeInfo.As.PROPERTY, property = "type")
public class PropertySetAggregateV2 {
  private Optional<Long> uncertainThreshold;
  private Optional<Long> goodThreshold;
  private Map<String, PropertySetAggregateValueV2> aggregates = new LinkedHashMap<>();
  private int version = 2;

  public PropertySetAggregateV2(Optional<Long> uncertainThreshold, Optional<Long> goodThreshold) {
    this.uncertainThreshold = uncertainThreshold;
    this.goodThreshold = goodThreshold;
  }

  public PropertySetAggregateV2() {}

  private boolean ignored(String propertyName) {
    return (propertyName.endsWith("_qc"));
  }

  public boolean add(
      String propertyName,
      Instant timeValue,
      Object value,
      String qualityCode,
      Instant booleanDate,
      ZoneId zoneId) {
    if (!ignored(propertyName)) {
      PropertySetAggregateValueV2 propertySetAggregateValue =
          aggregates.computeIfAbsent(propertyName, s -> new PropertySetAggregateValueV2());
      if (!propertySetAggregateValue.add(
          timeValue.toEpochMilli(),
          value,
          qualityCode,
          uncertainThreshold,
          goodThreshold,
          booleanDate,
          zoneId)) {
        aggregates.remove(propertyName);
        return (false);
      }
      return (true);
    }
    return (false);
  }

  public void add(String propertyName, PropertySetAggregateValueV2 propertySetAggregateValue) {
    if (!ignored(propertyName)) {
      PropertySetAggregateValueV2 currentPropertySetAggregateValue = aggregates.get(propertyName);
      if (currentPropertySetAggregateValue == null) {
        aggregates.put(propertyName, propertySetAggregateValue);
      } else {
        currentPropertySetAggregateValue.add(propertySetAggregateValue);
      }
    }
  }

  @JsonProperty("a")
  public Map<String, PropertySetAggregateValueV2> getAggregates() {
    return aggregates;
  }

  @JsonProperty("r")
  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }
}
