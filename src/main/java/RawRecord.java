import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.Map;

public class RawRecord implements Record {

  @JsonIgnore private transient String partition;

  @JsonProperty(TIME)
  private final Instant time;

  @JsonProperty(INSERT_TIME)
  private Instant insertTime;

  @JsonIgnore private final Map<String, Object> properties;

  public RawRecord(Instant time, Map<String, Object> properties) {
    this.time = time;
    this.properties = properties;
  }

  public RawRecord(Instant time, Instant insertTime, Map<String, Object> properties) {
    this.time = time;
    this.insertTime = insertTime;
    this.properties = properties;
  }

  @JsonAnyGetter
  public Map<String, Object> any() {
    return properties;
  }

  @JsonAnySetter
  public void add(String key, Object value) {
    properties.put(key, value);
  }

  @Override
  public int compareTo(Record record) {
    return time.compareTo(record.getTime());
  }

  @Override
  public Instant getTime() {
    return this.time;
  }

  @Override
  public Instant getInsertTime() {
    return this.insertTime;
  }

  @Override
  public String toString() {
    return "RawRecord{" +
            "partition='" + partition + '\'' +
            ", time=" + time +
            ", insertTime=" + insertTime +
            ", properties=" + properties +
            '}';
  }
}
