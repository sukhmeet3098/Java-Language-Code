public class Recursion {

  public static void printNumb(int n) {
    if (n == 0) {
      return;
    }
    System.out.print(n + " ");
    printNumb(n - 1);
  }

  public static void printNumber(int n) {
    if (n == 6) {
      return;
    }
    System.out.print(n + " ");
    printNumber(n + 1);
  }

  public static void printSum(int i, int n, int sum) {
    if (i == n) {
      sum += n;
      System.out.println(sum);
      return;
    }
    sum += i;
    printSum(i + 1, n, sum);
  }

  public static int printfactorial(int n) {
    if (n == 1 || n == 0) {
      return 1;
    }
    return (n * printfactorial(n - 1));
  }

  public static void printFib(int a, int b, int n) {
    if (n == 0) {
      return;
    }
    int c = a + b;
    System.out.print(c + " ");
    printFib(b, c, n - 1);
  }

  public static int calPower(int x, int n) {
    if (n == 0) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }

    return (x * (calPower(x, n - 1)));
  }

  public static int calPowerLogn(int x, int n) {
    if (n == 0) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }

    if (n % 2 == 0) {
      return (calPowerLogn(x, n / 2) * calPowerLogn(x, n / 2));
    } else {
      return (calPowerLogn(x, n / 2) * calPowerLogn(x, n / 2) * x);
    }
  }

  public static void main(String[] args) {
    // int n = 5;

    // // Print Number 5 to 1.
    // printNumb(n);// n = 5;

    // System.out.println();
    // int num = 1;
    // // Print Number 1 to 5.
    // printNumber(num);

    // System.out.println();
    // // Print the sum of first n numbers
    // printSum(1, 5, 0);

    // Factorial of n.
    // int n = 5;
    // int factorial = printfactorial(n);
    // System.out.println(factorial);

    // Print Fibonnaci Series of first n numbers
    // int n = 7;
    // int a = 0, b = 1;
    // System.out.print(a + " " + b + " ");
    // printFib(a, b, n - 2);

    // Print x^n (stack height = n)
    // int x = 2, n = 5;
    // int ans = calPower(x, n);
    // System.out.println(ans);

    // Print x^n (stack height = log n)
    int x = 2, n = 5;
    int ans = calPowerLogn(x, n);
    System.out.println(ans);
  }
}
