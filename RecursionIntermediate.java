public class RecursionIntermediate {

  public static int first = -1;
  public static int last = -1;

  public static void towerofHanoi(int n, String src, String helper, String destination) {
    if (n == 1) {
      System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
      return;
    }

    towerofHanoi(n - 1, src, destination, helper);
    System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
    towerofHanoi(n - 1, helper, src, destination);
  }

  public static void printRevString(String str, int idx) {
    if (idx == 0) {
      System.out.print(str.charAt(idx));
      return;
    }
    System.out.print(str.charAt(idx));
    printRevString(str, idx - 1);
  }

  public static void findOccurance(String str, int idx, char element) {
    if (idx == str.length()) {
      System.out.println(first);
      System.out.println(last);
      return;
    }

    if ((str.charAt(idx)) == element) {
      if (first == -1) {
        first = idx;
      } else {
        last = idx;
      }
    }
    findOccurance(str, idx + 1, element);
  }

  public static boolean isSorted(int[] arr, int idx) {
    if (idx == arr.length - 1) {
      return true;
    }

    if (arr[idx] >= arr[idx + 1]) {
      return false;
    }

    return isSorted(arr, idx + 1);
  }

  public static void moveAllX(String str, int idx, int count, String newString) {
    if (idx == str.length()) {
      for (int i = 0; i < count; i++) {
        newString += 'x';
      }
      System.out.println(newString);
      return;
    }

    char currChar = str.charAt(idx);
    if (currChar == 'x') {
      count++;
      moveAllX(str, idx + 1, count, newString);
    } else {
      newString += currChar;
      moveAllX(str, idx + 1, count, newString);
    }
  }

  public static void main(String[] args) {

    // Tower of Hanoi
    // int n = 3;
    // towerofHanoi(n, "Source", "Helper", "Destination");

    // Reverse String
    // String str = "abcd";
    // int index = str.length() - 1;
    // printRevString(str, index);

    // Find First and Last Occurance of the given element from the string
    // String str = "abaacdaefaah";
    // findOccurance(str, 0, 'a');

    // Check if an array is sorted (Strictly Increasing)
    // int[] arr = { 1, 3, 5 };
    // System.out.println(isSorted(arr, 0));

    // Move all 'x' to the end of the string

    String str = "axbcxxd";
    moveAllX(str, 0, 0, "");
  }
}
