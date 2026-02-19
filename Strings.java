import java.util.Scanner;

public class Strings {
  public static void main(String[] args) {
    // String Declaration

    // String name = "Sukhmeet";
    // String fullName = "Sukhmeet Singh";
    // String sentence = "My name is Sukhmeet Singh";

    // Input by the user
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println("Your Name is : " + name);

    // Strings method

    // 1. Concatenation

    String firstName = "Tony";
    String lastName = "Stark";
    String fullName = firstName + "@" + lastName;
    System.out.println(fullName);

    // 2. Length
    System.out.println(fullName.length());

    // 3. CharAt Method
    for (int i = 0; i < fullName.length(); i++) {
      System.out.println(fullName.charAt(i));
    }

    // 4. Compare
    String name1 = "Tony";
    String name2 = "Tony";

    // Check three conditions
    // 1. s1 > s2 : return random +ve value.
    // 2. s1 == s2 : 0
    // 3. s1 < s2 : -ve value

    if (name1.compareTo(name2) == 0) {
      System.out.println("Both are same String.");
    }

    // 5. SubString
    String sentence = "My name is Tony";
    // String personName = sentence.substring(11, sentence.length());
    String personName = sentence.substring(11);
    System.out.println(personName);
  }
}
