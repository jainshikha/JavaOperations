public class heath {
  static void Java() {
    try {
      System.out.println("inside jaaa");
      throw new RuntimeException("demo");
    } finally {
      System.out.println("Java finally");
    }
  }

  static void python() {
    try {
      System.out.println("inside pythin");
      return;
    } finally {
      System.out.println("python finally");
    }
  }

  public static void main(String[] args) {
    try {
      Java();
    } catch (Exception e) {
      System.out.println("exception cat");
    }
    python();
  }
}
