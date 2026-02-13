import java.util.Scanner;

public class Functions {

  //printMyName function declare 
  public static void printMyName(String name){
    System.out.println(name);
    return;
  }

  // Function to calculate the sum
  public static int calculateSum(int a, int b){
    int sum = a + b;
    return sum;
  }

  // Function to calcuate the product
  public static int calculateProduct(int a, int b){
    return a * b;
  }

  public static void printFactorial(int num){
    if(num < 0){
      System.out.println("Invalid Number");
      return;
    }
    int factorial = 1;
    for(int i = num; i >= 1; i--) {
      factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
  }

  public static void main(String[] args) {
   // Function Syntax

   // returnType functionName(type arg1, type arg2.....){
    //operations
  //}
    Scanner sc = new Scanner(System.in);

    //String name = sc.nextLine();

    //Calling the function
    //printMyName(name);

    // Calculate the sum
    //int a = sc.nextInt();
    //int b = sc.nextInt();

    // int sum = calculateSum(a, b);
    // System.out.println(sum);

    // Calculate the product
    //System.out.println(calculateProduct(a, b));

    //Calaculate the factorial
    int n = sc.nextInt();
    printFactorial(n);

  }
}
