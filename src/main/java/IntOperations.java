
public class IntOperations {
  public static void main(String[] args) {
    Integer x = 3;
    Integer y = null;

    try {
      System.out.println(Integer.compareUnsigned(x, 3) == 0 || Integer.compareUnsigned(y, 0) == 0);
    } catch (Exception e) {
      System.out.println(e.getClass().toString());
    }
    try{
      //check the output for null & true
      System.out.println(y.compareTo(null)==0 || true);
    }catch (Exception e){
      System.out.println(e.getClass().toString());
    }
  }
}

