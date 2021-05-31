/*
import java.util.HashMap;

public class HackerEarth {
  static {
    code(2);
  }

  static {
    code(4);
  }

  static {new HackerEarth();}

  {code(6);}

  {code(8);}

  HackerEarth() {
    code(5);
  }

  static void code(int val) {
    System.out.println(val + " ");
  }

  public static void main(String[] args){

  }
}
*/

public class HackerEarth implements IntNumber {
  private final int[] stck;
  private int pos;

  HackerEarth(int size) {
    stck = new int[size];
    pos = -1;
  }

  public void ins(int item) {
    if (pos == stck.length - 1) System.out.println("overflow");
    else stck[++pos] = item;
  }

  public int delt() {
    if (pos < 0) {
      System.out.println("undrflow");
      return 0;
    } else return stck[pos--];
  }
}
