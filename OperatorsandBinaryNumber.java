public class OperatorsandBinaryNumber {
  public static void main(String[] args) {
    // Arithmetic Operators
    // int a = 10;
    // int b = 5;

    // System.out.println("Sum is: " + (a + b));
    // System.out.println("Sub is: " + (a - b));
    // System.out.println("Mul is: " + (a * b));
    // System.out.println("Divide is: " + (a / b));
    // System.out.println("Remainder is: " + (a % b));

    // Uniary Operator

    // Pre Increment or Decrement means first change the value and then use the
    // value. (++a/--a)
    // int a = 10;
    // int b = 0;

    // b = ++a;// First change the value then assign it into b
    // System.out.println(a);// 11
    // System.out.println(b);// 11

    // Post Increment or Decrement means first use the value and then change the
    // value. (a++/a--)
    // int a = 10;
    // int b = 0;

    // b = a++;// First assign the value then change it.
    // System.out.println(a);// 10
    // System.out.println(b);// 11

    // Relational Operators (==, !=, >, <, >=, <=) returns always boolean

    // int a = 10;
    // int b = 5;

    // System.out.println("Equals: " + (a == b));
    // System.out.println("Not Equals: " + (a != b));
    // System.out.println("A Greater Then: " + (a > b));
    // System.out.println("A Less then: " + (a < b));
    // System.out.println("A Greater Then Equals: " + (a >= b));
    // System.out.println("A Less Then Equals: " + (a <= b));

    // Logical Operators (&&, ||, !)

    // Assignment Operator (=, +=, -=, *=, /=, %=)

    int a = 0;
    int b = 5;

    System.out.println("a = b is: " + (a = b));
    System.out.println("a += b is: " + (a += b)); // Means a = a + b;
    System.out.println("a -= b is: " + (a -= b)); // Means a = a - b;
    System.out.println("a *= b is: " + (a *= b)); // Means a = a * b;
    System.out.println("a /= b is: " + (a /= b)); // Means a = a / b;
    System.out.println("a %= b is: " + (a %= b)); // Means a = a % b;
  }
}
