import java.util.Optional;

public class OptionalSample {
  /*  void display(){
    System.out.println("data = " + data);
    }
    int data;

  public static void main(String[] args) {
    int x = 0;
    itmtest t = new itmtest();
    t.display();
  }*/
  /*
  public static void main(String[] args) {
      List<Map<List<Integer>,List<String>>> opl = new ArrayList<>();
      Map<List<Integer>,List<String> > opmm = new HashMap<>();
      opl.add(null);
      opl.add(opmm);
      opl.add(new HashMap<List<Integer>,List<String>>());

    opl.forEach(e -> System.out.println(e + " "));

    System.out.println("***************");
    System.out.println(Stream.of("green","yellow","blue").max((s1,s2) -> s1.compareTo(s2)).filter(s-> s.endsWith("n")).orElse("yellow"));
  }*/

  /*public static void main(String[] args) {
    int x =3;
    boolean b1 = true;
    boolean b2 = false;
    if ((b1 |b2) || (x++>4) ){
      System.out.println("x1: "+ x++);
    }
    if((!b1 & b2 )&& (++x <4)){
    System.out.println("x2: " +x);
      }
  }*/

  /*  static int num1 = 10;
  static int num2 = getValue();

  static int getValue() {
    return num1;
  }

  static int doSum() {
    return num1 + num2;
  }
  static int dominus(){
    return num1-num2;
  }

  public static void main(String[] args) {
    System.out.println(doSum());
    System.out.println(dominus());
  }*/
  public static void main(String[] args) {

    String a = null;
    Optional<String> b = Optional.empty();
    try {
      //output 6
      System.out.println(a.length());
      System.out.println(b.orElse("").length());
    } catch (Exception e) {
      //output null pointer exception
      System.out.println("****" + e);
    } finally {
      a = "String";
      System.out.println(a.length());
      b = Optional.ofNullable("");
      //output 0
      System.out.println(b.get().length());
    }
  }
}
