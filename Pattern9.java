                             // Number Pyramid
import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
     Scanner scanner= new Scanner(System.in);
     int a = scanner.nextInt();
     // spcae 
     for (int i = 1; i<=a;i++){
        for (int j = 1; j <=a-i; j++) {
            System.out.print(" ");
        }
        // row number
        for (int j = 1; j <=i; j++) {
            System.out.print(i + " ");
        }
         System.out.println();
         
     }
    }
}
