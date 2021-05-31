public class  MyouterClass {
  protected int x = 1;
  private final String st = "Number";

  public static void main(String[] args) {
    MyouterClass obj = new MyouterClass();
    obj.innerIns();
  }

  private void innerIns() {
    MyInnerClass inner = new MyInnerClass();
    inner.seeOuter();
  }

  private class MyInnerClass {
    private void seeOuter(){
//      protected int x=2;
  //    System.out.println(st+" " +x);
    }
  }
}
