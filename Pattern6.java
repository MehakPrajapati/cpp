                                     //0-1 triangle 
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");   
        int a = scanner.nextInt();
        //outer loop
        for( int i = 1 ; i<=a ; i++){
       // inner loop
       for(int j = 1; j<=i;j++){
        int sum = i +j ;
        if (sum % 2 == 0){            // even
            System.out.print("1 ");
        }else{                     //odd
            System.out.print("0 ");
        }
       }
       System.out.println();
       
        }
    
    
                }
}
