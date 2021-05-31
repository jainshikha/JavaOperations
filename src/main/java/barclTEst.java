import java.util.HashMap;
import java.util.Map;

public class barclTEst {
  private final String val;

  public barclTEst(String val) {
    this.val = val;
  }

  public static void main(String[] args) {
    //
    Map<String, Integer> map = new HashMap<String, Integer>();
    String st1 = "Java OOPs!";
    String st2 = "Java OOPs!";
    map.put(st1, new Integer(10));
    map.put(st2, new Integer(20));
    Map<barclTEst, Integer> map2 = new HashMap<barclTEst, Integer>();
    barclTEst st3 = new barclTEst(st1);
    barclTEst st4 = new barclTEst(st2);
    map2.put(st3, new Integer(10));
    map2.put(st4, new Integer(20));
    System.out.println(map.get(st1));
    System.out.println(map2.get(st3));

  }
}
