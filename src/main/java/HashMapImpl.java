import java.util.*;

public class HashMapImpl {

  public static void main(String[] args) {
    HashMap<Emp, String> listOfEmp = new HashMap<>();
    Emp empObj = new Emp("shikha", 1);
    Emp empObj1 = new Emp("jain", 2);
    Emp empObj2 = new Emp("shubhan", 1);
    Emp empObj3 = new Emp("shasank", 1);
    Emp empObj4 = new Emp("shikhar", 1);
    Emp empObj5 = empObj;

    listOfEmp.put(empObj, "first");
    listOfEmp.put(empObj, "first1");

    listOfEmp.put(empObj1, "seconf");
    listOfEmp.put(empObj2, "thred");
    listOfEmp.put(empObj3, "seconf");
    listOfEmp.put(empObj4, "thred");
    listOfEmp.put(empObj5, "seconf");

//    System.out.println(listOfEmp.entrySet());
//    System.out.println(listOfEmp);

    HashMap<Integer, Emp> putIfcheck= new LinkedHashMap<>();
    putIfcheck.put(1,empObj);
    //putIfcheck.computeIfPresent(1,empObj1);
    List<Emp> _listOfEmp = new ArrayList();
    _listOfEmp.add(empObj);
    _listOfEmp.add(empObj1);

    _listOfEmp.add(empObj2);
    _listOfEmp.add(empObj3);
    _listOfEmp.add(empObj4);
    _listOfEmp.add(empObj5);
    Set x = new HashSet<>(_listOfEmp);
    System.out.println(x);
  }
}
