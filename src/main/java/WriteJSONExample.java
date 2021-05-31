import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class WriteJSONExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws JsonProcessingException {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Lokesh");
        employeeDetails.put("lastName", "Gupta");
        employeeDetails.put("website", "howtodoinjava.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "Brian");
        employeeDetails2.put("lastName", "Schultz");
        employeeDetails2.put("website", "example.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {

            file.write(employeeList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("*****************************");
        List<BillingUsage> subList = new ArrayList();
        List tenantObjList = new ArrayList();
        tenantObjList.add(new BillingUsage("shikha", 20, "atorage"));
        tenantObjList.add(new BillingUsage("jain", 20, "atorage"));
        tenantObjList.add(new BillingUsage("wq", 20, "atorage"));
        tenantObjList.add(new BillingUsage("32", 20, "atorage"));
        tenantObjList.add(new BillingUsage("qwecc", 20, "atorage"));
        tenantObjList.add(new BillingUsage("asd", 20, "atorage"));
        tenantObjList.add(new BillingUsage("ytt", 20, "atorage"));
        tenantObjList.add(new BillingUsage("fvb", 20, "atorage"));
        tenantObjList.add(new BillingUsage("jhnhb", 20, "atorage"));
        tenantObjList.add(new BillingUsage("ofgm", 20, "atorage"));

        ArrayList<List<BillingUsage>> subList1 = new ArrayList<>();
        System.out.println("--------------------");
        int sizeSubList = 4;
        ObjectMapper objectMapper = new ObjectMapper();
        for (int i = 0; i < tenantObjList.size(); i = i + sizeSubList) {
            subList1.add(tenantObjList.subList(i, Math.min(i + sizeSubList, tenantObjList.size())));
            //System.out.println((tenantObjList.subList(i, Math.min(i + sizeSubList, tenantObjList.size()))));
            //System.out.println("  ... " + i + "   " + (i + sizeSubList - 1));
            System.out.println("subList1subList1subList1 size is "+ subList1.get(subList1.size()-1));
        }
        System.out.println(".... "+ subList1);
        System.out.println("------------------");

//      System.out.println(subList1);
//        TestEmpty("shikha");
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH-mm-ss'Z'");
        LocalDateTime localDateTime =
                LocalDateTime.ofInstant(
                        (Instant.now().truncatedTo(ChronoUnit.HOURS).minus(Period.ofDays(1))),
                        ZoneId.of("UTC"));
        String folderName = "" + localDateTime.format(formatter);
        System.out.println(folderName);

    }

    static void TestEmpty(String input) {
        if (input != null && !input.isEmpty()) {
            System.out.println("input is not emprty");
        } else {
            System.out.println("input is empty");
        }
    }
}















