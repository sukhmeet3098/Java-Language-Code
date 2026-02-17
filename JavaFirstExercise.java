import java.util.Scanner;

public class JavaFirstExercise {

  public static float findAverage(float num1, float num2, float num3) {

    float average = (num1 + num2 + num3) / 3;
    return average;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Enter 3 numbers from the user & make a function to print their average.
    float num1 = sc.nextInt();
    float num2 = sc.nextInt();
    float num3 = sc.nextInt();

    float average = findAverage(num1, num2, num3);
    System.out.println("Average is : " + average);
  }
}
