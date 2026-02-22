import java.util.Scanner;

public class ArraysHomework {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1. Take an array of names as input from the user and print them on the
    // screen.

    // int size = sc.nextInt();
    // String names[] = new String[size];
    // sc.nextLine();

    // for (int i = 0; i < size; i++) {
    // names[i] = sc.nextLine();
    // }

    // for (int i = 0; i < size; i++) {
    // System.out.println(names[i]);
    // }

    // 2. Find the maximum & minimum number in an array of integers.

    // int size = sc.nextInt();
    // int numbers[] = new int[size];

    // int minNum = Integer.MAX_VALUE;
    // int maxNum = Integer.MIN_VALUE;

    // for (int i = 0; i < size; i++) {
    // numbers[i] = sc.nextInt();
    // }

    // for (int i = 0; i < numbers.length; i++) {
    // if (maxNum < numbers[i]) {
    // maxNum = numbers[i];
    // }
    // if (minNum > numbers[i]) {
    // minNum = numbers[i];
    // }
    // }

    // System.out.println("Min Number is: " + minNum);
    // System.out.println("Max Number is: " + maxNum);

    // 3.Take an array of numbers as input and check if it is an array sorted in
    // ascending order.

    int size = sc.nextInt();
    int numbers[] = new int[size];
    boolean isAscending = true;

    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }

    for (int i = 0; i < size - 1; i++) {
      if (numbers[i] > numbers[i + 1]) {
        isAscending = false;
        break;
      }
    }

    if (isAscending) {
      System.out.println("The given array is in ascending order.");
    } else {
      System.out.println("The given array is not in ascending order.");
    }
  }
}