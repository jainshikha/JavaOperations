class B2 extends B1 {
  protected int c = 10;

  B2(int a, int b) {
    super(a, b);
  }

  protected void add() {
    sum(10, 20);
  }
}

class Examp7 {
  public static void main(String[] args) {
    new B2(2, 3).add();
  }
}
