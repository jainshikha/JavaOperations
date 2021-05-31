import java.util.*;

public class ArrayOperation {
  static int sumTobe = 5;

  public static void sumOfTwoArray(Integer[] input) {
    // execute with the help of array []
    for (int j = 0; j < input.length - 1; j++) {
      for (int i = 1; i < input.length; i++) {
        // check if the sum is equal to n or not
        if (input[j] + input[i] == sumTobe) {
          System.out.println("from calculate " + input[j] + " + " + input[i]);
          input[j] = 0;
          input[i] = 0;
        }
      }
    }
  }

  public static void sumOfTwoArrayList(List<Integer> input) {
    // execute with the help of array list
    for (int j = 0; j < input.size() - 1; j++) {
      for (int i = 1; i < input.size(); i++) {
        // check if the sum is equal to n or not
        if (input.get(j) + input.get(i) == sumTobe) {
          System.out.println("from removeElement" + input.get(j) + " + " + input.get(i));
          input.remove(input.get(i));
        }
      }
    }
  }

  public static void main(String[] args) {
    // input
    Integer[] input = {-3, 7, 6, 5, 4, -2, -1, 0, 1, 2, 3, 4, 6, 7, 8};
    // -3,8  7+-2 6 +-1  4+1 2+3 0+5

    List<Integer> al = new ArrayList<Integer>();

    // adding elements of array to arrayList.
    Collections.addAll(al, input);
    Collections.sort(al);

    sumOfTwoArray(input);
    sumOfTwoArrayList(al);
  }
}
