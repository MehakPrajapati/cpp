
                                               // Palindromic Pattern
import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
// spcae 
for (int i = 1; i<=a;i++){
    for (int j = 1; j<=a-i; j++) {
        System.out.print(" ");
    }
    // row number  1st half
    for (int j = i; j>=1; j--) {
        System.out.print(j + " ");
    }
    //sec half
   for (int j = 2; j <=i; j++) {
       System.out.print(j+" ");
   }
   System.out.println();
 }
    }
}
