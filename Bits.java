import java.util.Scanner;

public class Bits {
  public static void main(String[] args) {
    // Get The Bit
    // int n = 5;
    // int pos = 2;
    // int bitMask = 1 << pos;

    // if ((bitMask & n) == 0) {
    // System.out.println("Bit is zero.");
    // } else {
    // System.out.println("Bit is one.");
    // }

    // Set The Bit
    // int n = 5;
    // int pos = 1;
    // int bitMask = 1 << pos;

    // int newNumber = bitMask | n;
    // System.out.println(newNumber);

    // Clear the bit
    // int n = 5;
    // int pos = 2;
    // int bitMask = 1 << pos;
    // int notBitMask = ~(bitMask);

    // int newNumber = notBitMask & n;
    // System.out.println(newNumber);

    // Update the bit.
    Scanner sc = new Scanner(System.in);
    int oper = sc.nextInt(); // oper: 1 means set the bit to 1. oper: 0 means clear the bit to 0.
    int n = 5;
    int pos = 2;
    int bitMask = 1 << pos;

    if (oper == 1) {
      // Set Operation
      int newNumber = bitMask | n;
      System.out.println(newNumber);
    } else {
      int notBitMask = ~(bitMask);
      int newNumber = notBitMask & n;
      System.out.println(newNumber);
    }
  }
}