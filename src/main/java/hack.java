import java.util.Arrays;

public class hack {
  int val = 10;
  int a, b = 9;

  public static void main(String[] args) {
    //
    hack hack = new hack();
    //      System.out.println(hack.val);
    System.out.println(hack.sum() + hack.result() + hack.add());
  }

  public int sum() {
    return a + b;
  }

  private int add() {
    return a + b;
  }

  int result() {
    return new hack().add();
  }
}
