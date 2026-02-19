import java.util.Scanner;

public class TwoDArray {
  public static void main(String[] args) {

    // Decalaration of 2D-Array
    // int[][] numbers = new int[3][5];
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int[][] numbers = new int[rows][cols];

    // Input the Value
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    // Print the Values
    // for (int i = 0; i < rows; i++) {
    // for (int j = 0; j < cols; j++) {
    // System.out.print(numbers[i][j] + " ");
    // }
    // System.out.println();
    // }

    // Search the value
    int x = sc.nextInt();

    // Print he index of the search value
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (numbers[i][j] == x) {
          System.out.println("x found at index : (" + i + " , " + j + ")");
          return;
        }
      }
    }
  }
}
