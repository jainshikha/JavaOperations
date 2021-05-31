interface A {
  default void hi() { System.out.println("A"); }
}

interface B {
  default void hi() { System.out.println("B"); }
}

class AB implements  B,A {
  public void hi() { A.super.hi(); }

}