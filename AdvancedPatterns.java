public class AdvancedPatterns {
  public static void main(String[] args) {
    // Butterfly Pattern
    int n = 4;

    // Upper Part
    for(int i = 1; i <= n; i++){
      // First Star Part
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      // Spaces Part
      int spaces = 2*(n-i);
      for(int j = 1; j <= spaces; j++){
        System.out.print(" ");
      }
      // Second Star Part
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
    // Lower Part
    for(int i = n; i >= 1; i--){
      // First Star Part
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      // Spaces Part
      int spaces = 2*(n-i);
      for(int j = 1; j <= spaces; j++){
        System.out.print(" ");
      }
      // Second Star Part
      for(int j = 1; j <= i; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    // Solid Rhombus Pattern
    int num = 5;

    for(int i = 1; i<=num; i++){
      //Spaces Part
      for(int j = 1; j <= (num-i); j++){
        System.out.print(" ");
      }
      //Stars Part
      for(int j = 1; j <= num; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}