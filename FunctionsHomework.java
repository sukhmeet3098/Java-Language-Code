import java.util.Scanner;

public class FunctionsHomework {
  public static void checkPrime(int a) {
    int num = a;
    int flag = 0;
    if (num > 0) {
      for (int i = 2; i <= (num / 2); i++) {
        if (num % i == 0) {
          flag = 1;
          break;
        }
      }
      if (flag != 0) {
        System.out.println(num + " is not a Prime Number.");
        return;
      } else {
        System.out.println(num + " is a Prime Number.");
        return;
      }
    } else {
      System.out.println("Number must be greater than zero.");
      return;
    }
  }

  public static void checkEvenOdd(int a) {
    int num = a;
    if (num >= 0) {
      if (num % 2 == 0) {
        System.out.println(num + " is a even number.");
        return;
      } else {
        System.out.println(num + " is a odd number.");
        return;
      }
    } else {
      System.out.println("Number must be greater than zero.");
      return;
    }
  }

  public static void printTable(int a) {
    int num = a;
    if (num > 0) {
      int i = 1;
      while (i <= 10) {
        System.out.println(num + " * " + i + " : " + (num * i));
        i++;
      }

    } else {
      System.out.println("Number must be greater than zero.");
      return;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    // checkPrime(num);
    // checkEvenOdd(num);
    printTable(num);
  }
}
