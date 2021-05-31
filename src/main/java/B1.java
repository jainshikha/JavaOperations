class B1 {

  protected int b = 30;
  private int a = 10;

  public B1(int a, int b) {
    this.a = a;
    this.b = b;
  }

  protected void sum(int a, int b) {
    new B1(a, b).get();
  }

  private void get() {
    System.out.println(a + b);
  }
}
