public class QuickSortImpl {
  public static void main(String[] args) {
    int[] arr = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
    int n = arr.length;

    quickSort(arr, 0, n - 1);
  }

  static void quickSort(int[] input, int low, int high) {
    if (low < high) {
      int pi = partition(input, low, high);
      System.out.println("------------------------" + pi);
      quickSort(input, low, pi - 1);
      quickSort(input, pi + 1, high);
    }
  }

  static int partition(int[] input, int low, int high) {
    int pivot = input[high]; // 6
    System.out.println("pivot " +pivot);
    int i = (low - 1); // -1
    for (int j = low; j < high; j++) // 0-9
    {
      System.out.println("low " +low);
      System.out.println("input [j] " +input[j]);
      System.out.println("pivot " +pivot);
      if (input[j] < pivot) // [0] 9 < 6
      {
        i++; // 0
        System.out.println("i is " +input[i]);
        System.out.println("j is " +input[j]);
        // swap
        int temp = input[i]; //  9
        input[i] = input[j]; // i=0 =0
        System.out.println(input[j]);
        input[j] = temp;
      }
    }
    System.out.println("temp" + input[i+1]);
    System.out.println("temp" + input[high]);
    int temp = input[i + 1]; //  9
    input[i + 1] = input[high]; // i=0 =0
    input[high] = temp;

    return i + 1;
  }
}
