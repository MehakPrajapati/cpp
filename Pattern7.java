                                        // Butterfly Patter
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");   
        int a = scanner.nextInt();
              // first part >>>> upper half
        for ( int i = 1; i<=a; i++) {
            // print star
            for (int j = 1; j<=i; j++) {
                System.out.print("*"); 
                
            }
            // print spaces upper space
            int spaces = 2*(a-i);
            for (int j = 1; j <=spaces; j++){  
                System.out.print(" ");
            }
                 // sec part of upper half
                 for (int j = 1; j <=i; j++){
                    System.out.print("*");
                 }
           System.out.println();

        }
    // lower half 
    for ( int i = a; i>=1; i--) {
        // print star
        for (int j = 1; j<=i; j++) {
            System.out.print("*"); 
            
        }
        // print spaces
        int spaces = 2*(a-i);
        for (int j = 1; j <=spaces; j++){  
            System.out.print(" ");
        }
             // sec part of lower half
             for (int j = 1; j <=i; j++){
                System.out.print("*");
             }
       System.out.println();
    }
}
}