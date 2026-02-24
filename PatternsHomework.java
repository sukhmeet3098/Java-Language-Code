import java.util.*;

public class PatternsHomework {
  public static void main(String[] args) {
    // Print Half Pyramid.
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();

    // for (int i = 1; i <= rows; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j + " ");
    // }
    // System.out.println();
    // }

    // Print Inverted Half Pyramid.
    // int k = 1;
    // for (int i = rows; i >= 1; i--) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(k + " ");
    // }
    // System.out.println();
    // k = k + 1;
    // }

    // Print a hollow Rhombus.

    // for (int i = 1; i <= rows; i++) {
    // if (i == 1 || i == rows) {
    // for (int j = 1; j <= (rows - i); j++) {
    // System.out.print(" ");
    // }
    // for (int j = 1; j <= rows; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // } else {
    // for (int j = 1; j <= (rows - i); j++) {
    // System.out.print(" ");
    // }
    // System.out.print("*");
    // for (int j = 1; j <= (rows - 2); j++) {
    // System.out.print(" ");
    // }
    // System.out.println("*");
    // }
    // }

    // Print a hollow Butterfly.
    // for (int i = 1; i <= (2 * rows); i++) {
    // for (int j = 1; j <= (2 * rows); j++) {
    // if (j == 1 || i == j || j == (2 * rows) || j == ((2 * rows) - i + 1)) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }

    // Print Pascal’s Triangle.
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= (rows - i); j++) {
        System.out.print(" ");
      }
      int number = 1;
      for (int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number = number * (i - j) / j;
      }
      System.out.println();
    }
  }
}
