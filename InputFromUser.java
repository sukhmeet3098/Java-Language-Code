import java.util.Scanner;

public class InputFromUser {
  public static void main(String[] args) {
    // Input From the User

    Scanner sc = new Scanner(System.in);
    //String name = sc.next(); // Only Prints First Word
    String name = sc.nextLine(); // Prints The Complete String
    System.out.println(name);

  }
}
