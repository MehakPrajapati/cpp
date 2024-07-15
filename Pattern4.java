                                                //triangle
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {                         
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");   
        int a = scanner.nextInt();
         // outer loop
        for (int i = 1; i <= a; i++) {
                       // inner loop ---->> print spaces

            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
                      // inner loop ---->> Print stars

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

      
    }
}

