                              // right angle triangle (half pyramid)

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        int a; 
        System.out.println(" "); 
        a = scanner.nextInt();
        //outer loop
        for (int i = 1; i <= a; i++) {
            // inner loop >>>>>> Print spaces
            for (int j = 1; j <= a- i ; j++) {
                System.out.print(" ");
            }
            //inner loops>>>>>> Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}

