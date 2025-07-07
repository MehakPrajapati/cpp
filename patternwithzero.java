import java.util.Scanner;

public class patternwithzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int val =1 ;
        while(row<= n){
            int i = 1;
            while(i<=star){
                System.out.print(" ");
                if(i==1 || i == star ){
                    System.out.print(val+"\t");
                    
                }else{
                    System.out.print("0");
                  
                }
               
                i++;
            }
            System.out.println();
                star++;
                row++;
                val++;
           
        }
    }
}
