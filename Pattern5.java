                                             // floyd's triangle
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");   
        int a = scanner.nextInt();
      

        int number = 1;
              for(int i = 1; i<=a; i++ ){
                for(int j = 1; j <=i;j++){
             System.out.print(number + "  ");
                number++;
                }
            System.out.println();
              }

    }
}
