/*
import java.io.Serializable;
import java.util.Objects;

public class Tenant implements Serializable {

  // serializable for hazelcast cache
  private static final long serialVersionUID = -3996307889814841003L;

  private String id;
  private String name;
  private String externalId;
  private String identityId;
  private String typePrefix;
  private String storagePrefix;
  private TenantConfiguration configuration;
  private TenantResources resources;

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

  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getIdentityId() {
    return identityId;
  }

  public void setIdentityId(String identityId) {
    this.identityId = identityId;
  }

  public String getTypePrefix() {
    return typePrefix;
  }

  public void setTypePrefix(String typePrefix) {
    this.typePrefix = typePrefix;
  }

  public String getStoragePrefix() {
    return storagePrefix;
  }

  public void setStoragePrefix(String storagePrefix) {
    this.storagePrefix = storagePrefix;
  }

  public TenantConfiguration getConfiguration() {
    return configuration;
  }

  public void setConfiguration(TenantConfiguration configuration) {
    this.configuration = configuration;
  }

  public TenantResources getResources() {
    return resources;
  }

  public void setResources(TenantResources resources) {
    this.resources = resources;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    com.siemens.mindsphere.iot.data.Tenant tenant = (com.siemens.mindsphere.iot.data.Tenant) o;
    return Objects.equals(id, tenant.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Tenant{"
        + "id='"
        + id
        + '\''
        + ", name='"
        + name
        + '\''
        + ", externalId='"
        + externalId
        + '\''
        + ", identityId='"
        + identityId
        + '\''
        + ", typePrefix='"
        + typePrefix
        + '\''
        + ", storagePrefix='"
        + storagePrefix
        + '\''
        + ", configuration="
        + configuration
        + ", resources="
        + resources
        + '}';
  }
}
*/
