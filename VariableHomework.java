import java.util.Scanner;

public class VariableHomework {
  public static void main(String[] args) {
    // Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.

    int age = 18;
    float balance = 28242.692f;
    String name = "Sukhmeet Singh";
    char c = 'a';
    boolean check = true;
    long loan_Amount = 1000000000;
    double marks = 95.1234552148512148;

    System.out.println(marks);
    System.out.println(age);
    System.out.println(balance);
    System.out.println(c);
    System.out.println(check);
    System.out.println(loan_Amount);
    System.out.println(name);

    //Make a program that takes the radius of a circle as input, prints its radius and area as output to the user.
    
    Scanner sc = new Scanner(System.in);
    float PI = 3.14f;
    int r = sc.nextInt();
    float area = PI * (r * r);
    System.out.println(area); 

    // Make a program that prints the table of a number that is input by the user.

    int n = sc.nextInt();

    System.out.println(n + " * 1 = " + (n * 1));
    System.out.println(n + " * 2 = " + (n * 2));
    System.out.println(n + " * 3 = " + (n * 3));
    System.out.println(n + " * 4 = " + (n * 4));
    System.out.println(n + " * 5 = " + (n * 5));
    System.out.println(n + " * 6 = " + (n * 6));
    System.out.println(n + " * 7 = " + (n * 7));
    System.out.println(n + " * 8 = " + (n * 8));
    System.out.println(n + " * 9 = " + (n * 9));
    System.out.println(n + " * 10 = " + (n * 10));
  }
}
