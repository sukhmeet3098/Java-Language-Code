import java.util.Scanner;

public class LoopsHomework {
  public static void main(String[] args) {

    // Print all even numbers till n.
    Scanner sc = new Scanner(System.in);
    // int userInput = sc.nextInt();

    // for (int i = 0; i <= userInput; i++) {
    // if (i >= 0) {
    // if (i % 2 == 0) {
    // System.out.print(i + " ");
    // }
    // }
    // }
    // System.out.println("Number must be greater than zero.");

    // Run Default Syntax of For Loop

    // Menu driven program. The user can enter 2 numbers, either 1 or 0.
    // If the user enters 1 then keep taking input from the user for a student’s
    // marks(out of 100).
    // If they enter 0 then stop.
    // If he/ she scores :
    // Marks >=90 -> print “This is Good”
    // 89 >= Marks >= 60 -> print “This is also Good”
    // 59 >= Marks >= 0 -> print “This is Good as well”
    // System.out.println("Student Marks");
    // int userInput = 0;
    // do {
    // System.out.print("Enter Marks: ");
    // int marks = sc.nextInt();

    // if (marks < 0) {
    // System.out.println("Marks must be greater than zero.");
    // } else if (marks > 90) {
    // System.out.println("This is Good.");
    // } else if (marks >= 89 || marks >= 60) {
    // System.out.println("This is also Good.");
    // } else {
    // System.out.println("This is Good as well.");
    // }
    // System.out.print("Enter 1 for Continue or 0 for Stop: ");
    // userInput = sc.nextInt();
    // } while (userInput != 0);

    // Print if a number is prime or not (Input n from the user).
    int userInput = sc.nextInt();
    int flag = 0;

    if (userInput > 0) {

      for (int i = 2; i <= (userInput / 2); i++) {
        if (userInput % i == 0) {
          flag = 1;
          break;
        }
      }
      if (flag != 0) {
        System.out.println(userInput + " is not a Prime Number.");
      } else {
        System.out.println(userInput + " is a Prime Number.");
      }
    } else {
      System.out.println("Number must be greater than zero.");
    }
  }
}
