import java.util.Scanner;

public class Sample {

  public static void main(String[] args) {
    System.out.println("entery");
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    scanner.close();

    System.out.println(myFunction(n));
  }

  public static int myFunction(int n) {

    if (n <= 1) {
      return n;
    }

    return myFunction(n - 1) + myFunction(n - 2);
  }
}
