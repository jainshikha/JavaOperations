public class fineIntDuplicate {
  static int findduplicate(int[] arr, int n) {
    // return -1 because in these cases
    // there can not be any repeated element
    if (n <= 1) return -1;
    // initialize j and i
    int i = arr[0];
    int j = arr[arr[0]];
    System.out.println("i  is  " + i + " j is : " + j);
    // loop to enter in the cycle
    while (j != i) {
      // move one step for i
      i = arr[i];
      // move two step for j
      j = arr[arr[j]];
    }
    // loop to find entry
    // point of the cycle
    j = 0;
    while (i != j) {
      i = arr[i];
      j = arr[j];
    }
    return i;
  }
  // Driver Code
  public static void main(String[] args) {
    int[] arr = {1, 6, 2, 4, 3, 6, 3};
    int[] A = {1, 2, 2, 3, 3, 4, 4};
    int n = arr.length;
    //   System.out.print(findduplicate(arr, n));

    int i = 0, j = 1;
    while (i < n-1) {
      if (A[i] == A[i++]) System.out.println(A[i]);
      i++;
      }
  }
}
