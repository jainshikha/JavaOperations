import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class PropertySetDef implements Serializable {

  // serializable for hazelcast cache
  private static final long serialVersionUID = -4177416706285978215L;

  private String id;
  private String name;
  private String category;
  private String scope;
  private List<Property> properties;

  public PropertySetDef(
      String id, String name, String category, String scope, List<Property> properties) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.scope = scope;
    this.properties = properties;
  }

  public PropertySetDef() {}

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

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }

  public Optional<Property> getProperty(String propertyName) {
    return properties
        .stream()
        .filter(property -> property.getName().equalsIgnoreCase(propertyName))
        .findFirst();
  }

  @Override
  public String toString() {
    return "PropertySetDef{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", category='"
        + category
        + '\''
        + ", scope='"
        + scope
        + '\''
        + ", properties="
        + properties
        + '}';
  }
}
