import java.util.Scanner;

public class mirrorstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n/2;

        while (row <= n) {
            // Print spaces as tabs
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // Print stars with tabs
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            // Prepare for next row
            if (row <=n/2) {
                star += 2;
                space--;
            } else {
                star -= 2;
                space++;
            }

            System.out.println();
            row++;
        }

        sc.close();
    }
}
