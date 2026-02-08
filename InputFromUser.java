import java.util.Scanner;

public class InputFromUser {
  public static void main(String[] args) {
    // Input From the User

    Scanner sc = new Scanner(System.in);
    //String name = sc.next(); // Only Prints First Word
    String name = sc.nextLine(); // Prints The Complete String
    System.out.println(name);


    // Practice Question

    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = a + b;
    System.out.println(sum);
  }
}
