import java.util.Scanner;

public class patternMagics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = n;
        int space = -1;

        while (row <= 2 * n - 1) {
            // LEFT stars
            int i = 1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }

            // Spaces
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }

            // RIGHT stars
            int k = 1;
            if (row == 1 || row == 2 * n - 1) {
                // First and last row: print full stars without space in middle
                k = 2;  // Skip second set of stars (avoid duplicate)
            }
            while (k <= star) {
                System.out.print("*");
                k++;
            }

            // Mirror logic for next row preparation
            if (row < n) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }

            row++;
            System.out.println();
        }

        sc.close();
    }
}
