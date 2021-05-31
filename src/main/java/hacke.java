interface IntNumber {
  void ins(int item);

  int delt();
}

public class hacke implements IntNumber {
  private final int[] stck;
  private int pos;

  hacke(int size) {
    stck = new int[size];
    pos = -1;
  }

  public static void main(String[] args) {
    //
    hacke obj = new hacke(3);
    for (int i = 0; i < 4; i++) obj.ins(i);
    for (int i = 0; i <= 3; i++) System.out.println(obj.delt());
  }

  @Override
  public void ins(int item) {
    if (pos == stck.length - 1) System.out.println("overflw");
    else stck[++pos] = item;
  }

  @Override
  public int delt() {
    if (pos < 0) {
      System.out.println("underflow");
      return 0;
    } else return stck[pos--];
  }
}
