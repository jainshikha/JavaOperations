import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class EntityType implements Serializable {

  // serializable for hazelcast cache
  private static final long serialVersionUID = 1432210024416447235L;

  private String id;
  private String name;
  private List<PropertySet> propertySets = Collections.emptyList();

  public EntityType() {}

  public EntityType(String id, String name, List<PropertySet> propertySets) {
    this.id = id;
    this.name = name;
    this.propertySets = propertySets;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<PropertySet> getPropertySets() {
    return propertySets;
  }

  public void setPropertySets(List<PropertySet> propertySets) {
    this.propertySets = propertySets;
  }

  public static class PropertySet implements Serializable {

    private static final long serialVersionUID = 4900654725688047032L;

    private String name;
    private String propertySetType;

    public PropertySet() {}

    public PropertySet(String name, String propertySetType) {
      this.name = name;
      this.propertySetType = propertySetType;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getPropertySetType() {
      return propertySetType;
    }

    public void setPropertySetType(String propertySetType) {
      this.propertySetType = propertySetType;
    }

    @Override
    public String toString() {
      return "PropertySet{"
          + "name='"
          + name
          + '\''
          + ", propertySetType='"
          + propertySetType
          + '\''
          + '}';
    }
  }

  @Override
  public String toString() {
    return "EntityType{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", propertySets="
        + propertySets
        + '}';
  }
}
