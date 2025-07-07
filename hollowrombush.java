import java.util.Scanner;

public class hollowrombush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;

        while (row <= n) {
            // Printing leading spaces
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }

            // Printing stars and inner spaces
            int i = 1;
            while (i <= n) {
                if (row == 1 || row == n || i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                i++;
            }

            System.out.println();
            row++;
            space--;
        }

        sc.close();
    }
}
