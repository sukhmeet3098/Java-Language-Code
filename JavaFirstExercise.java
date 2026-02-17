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

  public static int findGreaterNumber(int a, int b) {
    int num1 = a;
    int num2 = b;

    if (a > b) {
      return a;
    } else {
      return b;
    }

  }

  public static float findArea(int radius) {
    if (radius > 0) {
      float area = 0;
      final float PI = 3.14f;
      area = PI * (radius * radius);
      return area;
    } else {
      System.out.println("Number must be greater than zero.");
      return 0;
    }
  }

  public static String eligibleToVote(int age) {
    if (age > 0) {
      if (age > 18) {
        return "Person Eligible to Vote.";
      } else {
        return "Person is not Eligible to Vote.";
      }
    } else {
      System.out.println("Number must be greater than zero.");
      return "0";
    }
  }

  public static void printPowerOfX(int x, int n) {
    if (n >= 0 && x >= 0) {
      int power = 1;
      while (n != 0) {
        power = x * power;
        n--;
      }
      System.out.println("Power of " + x + " is: " + power);
      return;
    } else {
      System.out.println("Numbers not be in Negative.");
      return;
    }
  }

  public static void printFibonacciSeries(int num) {
    if (num > 0) {
      if (num == 1) {
        System.out.print(0);
        return;
      } else if (num == 2) {
        System.out.print(0 + " " + 1);
        return;
      } else {
        int a = 0;
        int b = 1;
        int c = a + b;
        System.out.print(a + " " + b);
        for (int i = 3; i <= num; i++) {
          System.out.print(" " + c);
          a = b;
          b = c;
          c = a + b;
        }
        return;
      }
    } else {
      System.out.println("Number must be greater than zero.");
      return;
    }
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
    // int num = sc.nextInt();
    // sumOfOdd(num);

    // Write a function which takes in 2 numbers and returns the greater of those
    // two.
    // int num1 = sc.nextInt();
    // int num2 = sc.nextInt();
    // int greaterNumber = findGreaterNumber(num1, num2);
    // System.out.println("Greater Number is : " + greaterNumber);

    // Write a function that takes in the radius as input and returns the
    // circumference of a circle.

    // int radius = sc.nextInt();
    // float area = findArea(radius);
    // if (area != 0.0) {
    // System.out.println("Area is: " + area);
    // }

    // Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.
    // int age = sc.nextInt();
    // String check = eligibleToVote(age);
    // if (check != "0") {
    // System.out.println(check);
    // }

    // Write an infi nite loop using do while condition.
    // int i = 1;
    // do {
    // System.out.println("Sukhmeet Singh");
    // } while (i > 0);

    // Two numbers are entered by the user, x and n. Write a function to find the
    // value of one number raised to the power of another i.e. x^n.

    // int x = sc.nextInt();
    // int n = sc.nextInt();
    // printPowerOfX(x, n);

    // Write a program to print Fibonacci series of n terms where n is input by user
    // : 0 1 1 2 3 5 8 13 21 .....
    // In the Fibonacci series, a number is the sum of the previous 2 numbers that
    // came before it.

    int userInput = sc.nextInt();
    printFibonacciSeries(userInput);
  }
}
