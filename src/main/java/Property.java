import java.io.Serializable;
import java.util.Optional;

public class Property implements Serializable {

  // serializable for hazelcast cache
  private static final long serialVersionUID = 1426082694918501002L;

  private String name;
  private String type;
  private Integer length;

  private String qualityCode;
  // setting the default value to be 400KB
  private Integer size = 400000;
  // if this property is set to true then the current property
  // is a quality code type
  private Boolean isFlag = false;

  public Property(String name, String type, Boolean isFlag) {
    this.name = name;
    this.type = type;
    this.qualityCode = "n";
    this.isFlag = isFlag;
  }

  public Property(String name, String type, Integer length, String qualityCode, Integer size) {
    this.name = name;
    this.type = type;
    this.length = length;
    this.qualityCode = qualityCode;
    this.size = size;
  }

  public Property() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getLength() {
    return length;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public String getQualityCode() {
    return qualityCode;
  }

  public void setQualityCode(String qualityCode) {
    this.qualityCode = qualityCode;
  }

  public Boolean isQualityCodeAllowed() {
    return Optional.ofNullable(qualityCode).filter("y"::equalsIgnoreCase).isPresent();
  }


  @Override
  public String toString() {
    return "Property{"
        + "name='"
        + name
        + '\''
        + ", type='"
        + type
        + '\''
        + ", length="
        + length
        + ", qualityCode='"
        + qualityCode
        + '\''
        + ", size="
        + size
        + '}';
  }
}
