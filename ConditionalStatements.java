import java.util.Scanner;

public class ConditionalStatements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // If-else Statement
    
   //int age = sc.nextInt();

    /*if(age > 18) {
      System.out.println("Adult");
    }

    else {
      System.out.println("Not Adult");
    }*/

    /*int num = sc.nextInt();

    if ((num % 2) == 0) {
      System.out.println("Number is Even");
    }

    else {
      System.out.println("Number is odd");
    }*/

    // If-Elseif-Else Statements

    /*int a = sc.nextInt();
    int b = sc.nextInt();

    if(a==b) {
      System.out.println("Equal");
    }
    else if (a > b){
      System.out.println("a is greater");
    }
    else{
      System.out.println("a is lesser");
    }*/

    // Switch Statement

    int button = sc.nextInt();

    switch (button) {
      case 1: System.out.println("Hello");
      break;
      
      case 2: System.out.println("Namaste");
      break;

      case 3: System.out.println("Bonjour");
      break;

      default: System.out.println("Invalid Button");
    }
  }
}
