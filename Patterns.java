public class Patterns {
  public static void main(String[] args) {
    // Solid Rectangle Pattern
    // int rows = 4;
    // int col = 5;

    // outer loop for rows
    // for(int i = 1; i <= rows; i++){
    // inner loop for columns
    //   for(int j = 1; j <= col; j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // Hallow Rectangle Pattern

    // int rows = 4;
    // int col = 5;
    
    // for(int i = 1; i <= rows; i++){
    //   for(int j = 1; j <= col; j++){
    //     if(i == 1 || j == 1 || i == rows || j == col){
    //       System.out.print("*");
    //     }else{
    //       System.out.print(" ");
    //     }
    //   }
    //   System.out.println();
    // }

    // Half Pyramid Pattern

    // int rows = 4;

    // for(int i = 1; i <= rows; i++){
    //   for(int j = 1; j <= i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Inverted Half Pyramid Pattern
    // int rows = 4;

    // for(int i = rows; i >=1 ; i--){
    //   for(int j = 1; j <= i ; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    //Inverted and rotated By 180 degree Pyramid Pattern

    // int rows = 4;

    // for(int i = 1; i <= rows; i++){
    //   // inner loop -> for spaces
    //   for(int j = 1; j <= rows-i; j++){
    //     System.out.print(" ");
    //   }
    //   //inner loop -> for stars
    //   for(int j = 1; j <= i; j++){
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Half Pyramid with Numbers Pattern
    // int rows = 5;

    // for(int i = 1; i <= rows; i++){
    //   for(int j = 1; j <= i; j++){
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }

    // Inverted Half Pyramid with Numbers
    // int rows = 5;
    // for(int i = 1; i <= rows; i++){
    //   for(int j = 1; j <= rows - i + 1; j++){
    //     System.out.print(j + " ");
    //   }
    //   System.out.println();
    // }

    // Floyd's Triangle Pattern
    // int rows = 5;
    // int print_Number = 1;
    // for(int i = 1; i <= rows; i++){
    //   for(int j = 1; j <= i; j++){
    //     System.out.print(print_Number + " ");
    //     print_Number = print_Number + 1;
    //   }
    //   System.out.println();
    // }

    // 0-1 Triangle Pattern

    int rows = 5;
    for(int i = 1; i <= rows; i++){
      for(int j = 1; j <= i; j++){
        if((i+j) % 2 == 0){
          System.out.print("1 ");
        }else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }
}