public class StringsBuilder {
  public static void main(String[] args) {
    //StringBuilder sb = new StringBuilder("Tony");
    StringBuilder sb = new StringBuilder("h");
    // Get the chararcter
    // System.out.println(sb.charAt(0));

    // Set the Character or Replace the Character
    // sb.setCharAt(0, 'S');
    // System.out.println(sb);

    // Insert the character or substring into the given string
    // sb.insert(2, 'n');
    // System.out.println(sb);

    // Delete the charcter or substring from the string
    // sb.delete(2, 3);
    // System.out.println(sb);

    // Append the character in the last
    sb.append("e");
    sb.append("l");
    sb.append("l");
    sb.append("o");
    System.out.println(sb);
  }
}