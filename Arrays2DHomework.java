import java.util.Scanner;

public class Arrays2DHomework {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int martrix[][] = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        martrix[i][j] = sc.nextInt();
      }
    }

    int count = 1;
    int rowStart = 0;
    int colStart = 0;
    int rowEnd = rows - 1;
    int colEnd = cols - 1;

    for (int i = 0; i < (2 * rows); i++) {
      if ((rowStart <= rowEnd) && (colStart <= colEnd)) {
        if (count == 1) {
          for (int j = colStart; j <= colEnd; j++) {
            System.out.print(martrix[rowStart][j] + " ");
          }
          count = 2;
          rowStart++;
        } else if (count == 2) {
          for (int j = rowStart; j <= rowEnd; j++) {
            System.out.print(martrix[j][colEnd] + " ");
          }
          count = 3;
          colEnd--;
        } else if (count == 3) {
          for (int j = colEnd; j >= colStart; j--) {
            System.out.print(martrix[rowEnd][j] + " ");
          }
          count = 4;
          rowEnd--;
        } else {
          for (int j = rowEnd; j >= rowStart; j--) {
            System.out.print(martrix[j][colStart] + " ");
          }
          count = 1;
          colStart++;
        }

      }
    }
  }
}