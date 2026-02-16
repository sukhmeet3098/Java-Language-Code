import java.util.Scanner;

public class CondtitionalStatementsHomework {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Calculator Problem
    System.out.print("Enter the First Number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter the Second Number: ");
    int num2 = sc.nextInt();
    System.out.println("Select one of the following operator ('+', '-', '*', '/', '%'): ");
    char operator = sc.next().charAt(0);

    if(operator == '+'){
      System.out.println("Addition: " + (num1 + num2));
    }
    else if(operator == '-'){
      System.out.println("Difference: " + (num1 - num2));
    }
    else if(operator == '*'){
      System.out.println("Multipy: " + (num1 * num2));
    }
    else if(operator == '/'){
      if(num2 == 0){
        System.out.println("Invalid Numbers");
      }else{
        System.out.println("Division: " + (num1 / num2));
      }
    }
    else if(operator == '%'){
      if(num2 == 0){
        System.out.println("Invalid Numbers");
      } else{
        System.out.println("Modulus: " + (num1 % num2));
      }
      
    }

    // Display Month Name from the User Input
    System.out.println("Enter the Number from 1 to 12: ");
    int userInput = sc.nextInt();

    switch (userInput) {
      case 1:System.out.println("January");
        break;
      case 2:System.out.println("February");
        break;
      case 3:System.out.println("March");
        break;
      case 4:System.out.println("April");
        break;
      case 5:System.out.println("May");
        break;
      case 6:System.out.println("June");
        break;
      case 7:System.out.println("July");
        break;
      case 8:System.out.println("August");
        break;
      case 9:System.out.println("September");
        break;
      case 10:System.out.println("October");
        break;
      case 11:System.out.println("November");
        break;
      case 12:System.out.println("December");
        break;              
      default:System.out.println("Invalid Number");
        break;
    }


  }
}
