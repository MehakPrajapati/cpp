
import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        int star = 1;
        while(row<n){
            int i = 0;
            int ncr = 1;
            while(i<star){
                System.out.print(ncr+"  ");
                ncr = ((ncr*(row-i))/(i+1));
                i++;
            }
        
        System.out.println();
        row++;
        star++;
    }
}
}