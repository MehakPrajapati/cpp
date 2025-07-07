import java.util.Scanner;

public class patternmoutain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int space = 2 * n - 3;

        while (row <= n) {
            int val = 1;
            int i = 1;

            while (i <= star) {
                System.out.print(val + " ");
                val++;
                i++;
            }

            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            int k = 1;

           if (row == n) {
            k = row-1;
              
            }else{
                k = row;
            }

            while (k>= 1) {
                System.out.print( k + " ");
                k--;
              
            }

            System.out.println();
            row++;
            star++;
            space -= 2;
        }

    }
}
