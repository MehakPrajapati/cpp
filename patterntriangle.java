
import java.util.Scanner;

public class patterntriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
       
        while(row<=n){
            int i = 1;
            while(i<=space){
            System.out.print(" \t ");
            i++;}
         int val = row;
        int j = 1;
        while(j<=star){
            System.out.print(val+" \t");
            if(j < row  ){
val++;
        }else{
            val--;
        }
            j++;
            
        }
        
    
       
        System.out.println();
 row++;
        star+=2;
        space--;
        }
    }
}
