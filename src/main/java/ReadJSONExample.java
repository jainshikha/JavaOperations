/*
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;
import java.util.stream.IntStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample {
  private static final String DELIMITER = ",";

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    // JSON parser object to parse read file
    JSONParser jsonParser = new JSONParser();

    try (FileReader reader = new FileReader("sampleJson.json")) {
      // Read JSON file
      Object obj = jsonParser.parse(reader);
      // System.out.println("********* "+obj);
      String employeeList = obj.toString();


      PropertySetAggregateV2 propertySetAggregate = new PropertySetAggregateV2();
      PropertySetDef propertySetDef = validatePropertySetNameAndGetDefAny(
              params.getPropertySetName(),
              params.getEntityInstanceId(),
              tenantIdentityId,
              receiverTenantId);

      String name ="sad";
             */
/* propertySetDef
                      .getProperties()
                      .parallelStream()
                      .map(Property::getName)
                      .filter(val -> k.equalsIgnoreCase(val))
                      .findFirst()
                      .orElse(k);*//*

      */
/*propertySetAggregate.add(
              name,mapCSVToAggregates("1141563633000,1420.0,1141563633100,1470.0,1141563633044,1420.0,1141563633092,23220.0,1420.0,5678.97,88,10,2"));*//*

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("exception is : "+  e.getMessage()+ e.getCause());
    }
  }

  public static PropertySetAggregateValueV2 mapCSVToAggregates(String csvAggregates)
      throws Exception {
    String[] aggregateFields = csvAggregates.split(DELIMITER);
    PropertySetAggregateValueV2 aggregateObject = new PropertySetAggregateValueV2();
    IntStream.range(0, 13).forEach(x ->{
                    System.out.println(AggregateFields.getField(x).getGetterFunction().toString() + "........... " +aggregateObject.getFirstTime());
                    AggregateFields.getField(x).getSetterFunction().accept(aggregateFields[x],aggregateObject);
    });
    System.out.println("aggregateObject aggregateObject : " + aggregateObject);
    return aggregateObject;
  }
  public PropertySetDef validatePropertySetNameAndGetDefAny(
          String propertySetName,
          String entityInstanceId,
          String tenantIdentityId,
          Optional<String> receiverTenantId) {

    final Tenant tenant = getTenant(tenantIdentityId);

    EntityType.PropertySet propertySet =
            validatePropertySetNameAndGetPropertySet(
                    propertySetName, entityInstanceId, tenantIdentityId, receiverTenantId);

    // entity type is not null in the entity instance
    // property set name exist for the tenant
    final PropertySetDef propertySetDef =
            getPropertySetDef(propertySet.getPropertySetType(), tenant);

    // the category of the property set definition is dynamic
    notNull.test(propertySetDef.getCategory()).throwIfInvalid();
    return propertySetDef;
  }

  public EntityType.PropertySet validatePropertySetNameAndGetPropertySet(
          String propertySetName,
          String entityInstanceId,
          String tenantIdentityId,
          Optional<String> receiverTenantId) {
    MetaData metaData = new MetaData();
    metaData.setTenant(getTenant(tenantIdentityId));
    metaData.setEntity(getEntity(entityInstanceId, metaData.getTenant(), receiverTenantId));
    return validatePropertySetNameAndGetPropertySet(
            propertySetName, entityInstanceId, tenantIdentityId, metaData);
  }
}
*/
