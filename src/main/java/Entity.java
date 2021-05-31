/*
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entity implements Serializable {

  // serializable for hazelcast cache
  private static final long serialVersionUID = 1711154499396313192L;

  private String id;
  private String type;
  private String name;
  private String timezone;
  private String tenant;
  private String _subtenant;
  private String _highFrequency;
  private SharedEntityInfo _sharing;

  public Entity(String id, String type, String name, String timezone, String tenant) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.timezone = timezone;
    this.tenant = tenant;
  }

  public Entity(
      String id,
      String type,
      String name,
      String timezone,
      String tenant,
      SharedEntityInfo _sharing) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.timezone = timezone;
    this.tenant = tenant;
    this._sharing = _sharing;
  }

  public Entity(
      String id,
      String type,
      String name,
      String timezone,
      String tenant,
      SharedEntityInfo _sharing,
      String _subtenant) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.timezone = timezone;
    this.tenant = tenant;
    this._sharing = _sharing;
    this._subtenant = _subtenant;
  }

  public Entity() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public String getTenant() {
    return tenant;
  }

  public void setTenant(String tenant) {
    this.tenant = tenant;
  }

  public String get_subtenant() {
    return _subtenant;
  }

  public void set_subtenant(String _subtenant) {
    this._subtenant = _subtenant;
  }

  public String get_highFrequency() {
    return _highFrequency;
  }

  public void set_highFrequency(String _highFrequency) {
    this._highFrequency = _highFrequency;
  }

  public SharedEntityInfo get_sharing() {
    return _sharing;
  }

  public void set_sharing(SharedEntityInfo _sharing) {
    this._sharing = _sharing;
  }

  @Override
  public String toString() {

    return "Entity{"
        + "id='"
        + id
        + '\''
        + ", type='"
        + type
        + '\''
        + ", name='"
        + name
        + '\''
        + ", timezone='"
        + timezone
        + '\''
        + ", tenant='"
        + tenant
        + '\''
        + ", _subtenant='"
        + _subtenant
        + '\''
        + ", _sharing='"
        + _sharing
        + '\''
        + '}';
  }
}
*/
