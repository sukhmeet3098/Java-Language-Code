import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    // For Loop Intialization
    for(int counter = 0; counter < 3; counter = counter + 1) {
      System.out.println("Hello World");
    }
    
    // Pratice Question
    // counter ++ = counter = counter + 1
    // for(int counter = 0; counter <= 10; counter ++){
    //   //System.out.println(counter);
    //   System.out.print(counter + " ");
    // }

    // While Loop
    // int i = 0;

    // while(i <= 10){
    //   //System.out.println(i);
    //   System.out.print(i + " ");
    //   i = i + 1;
    // }

    // Do - While Loop
    // int i = 0;

    // do {
    //   //System.out.println(i);
    //   System.out.print(i + " ");
    //   i = i + 1;
    // }while(i <= 10);

    // Check the difference between while and do while loop
    // int i = 12;

    // while (i < 11) {
    //   System.out.println("Sukhmeet Singh");
    //   i = i + 1;
    // }

    // do {
    //   System.out.println("Sukhmeet Singh");
    //   i = i + 1;
    // } while(i < 11);

    // Print the sum of first n natural numbers.
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int sum = 0;

    // for(int i = 1; i <= n; i = i + 1){
    //   sum = sum + i;
    // }
    // System.out.println(sum);

    // Print the table of a number input by the user.
    int n = sc.nextInt();

    for (int i = 1; i <= 10; i = i + 1){
      System.out.println("2 * " + i + " : " + (n * i));
    }
  }
}