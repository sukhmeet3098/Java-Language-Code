import java.util.Scanner;

public class JavaFirstExercise {

  public static float findAverage(float num1, float num2, float num3) {

    float average = (num1 + num2 + num3) / 3;
    return average;
  }

  public static void sumOfOdd(int a) {
    int sum = 0;
    if (a > 0) {
      for (int i = 1; i <= a; i++) {
        if ((i % 2) != 0) {
          sum = sum + i;
        }
      }
    } else {
      System.out.println("Number must be greater than zero.");
      return;
    }
    System.out.println(sum);
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Enter 3 numbers from the user & make a function to print their average.
    // float num1 = sc.nextInt();
    // float num2 = sc.nextInt();
    // float num3 = sc.nextInt();

    // float average = findAverage(num1, num2, num3);
    // System.out.println("Average is : " + average);

    // Write a function to print the sum of all odd numbers from 1 to n.
    int num = sc.nextInt();
    sumOfOdd(num);

  }
}
