import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {

    // Declare mark array
    // int[] marks = new int[3];
    // int marks[] = new int[3];
    // // Intialize Array
    // marks[0] = 97;// phy
    // marks[1] = 98;// chem
    // marks[2] = 95;// eng

    // Second Declaration
    // int marks[] = { 97, 98, 95 };

    // User Define Array
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int numbers[] = new int[size];

    // Input Values in Array
    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }

    // Print the value of array
    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);

    // Second Way of Printing
    // for (int i = 0; i < 3; i++) {
    // System.out.println(marks[i]);
    // }

    // for (int i = 0; i < size; i++) {
    // System.out.println(numbers[i]);
    // }

    // Linear Search

    int x = sc.nextInt();

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == x) {
        System.out.println("x found at index : " + i);
        return;
      }
    }

  }
}
