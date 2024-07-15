                            // Diamond Pattern
import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); 
        // upper half
 // space
 for (int i = 1; i <=a; i++) {
    for (int j = 1; j <=a-i; j++) {
        System.out.print(" ");
    }
     // star
     for (int j = 1; j <=2*i-1; j++){
         System.out.print("*");
     }
     System.out.println();

    }
                               // lower half
      // space
 for (int i = a; i>=1; i--) {
    for (int j = 1; j <=a-i; j++) {
        System.out.print(" ");
    }
     // star
     for (int j = 1; j <=2*i-1; j++){
         System.out.print("*");
     }
     System.out.println();                         

 }
    }
}
