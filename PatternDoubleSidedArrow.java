import java.util.Scanner;

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Input: Must be odd

        int row = 1;
        int space = n - 1;
        int leftNumbers, rightNumbers;

        while (row <= n) {
            // Printing leading spaces
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // Left side numbers (descending)
            leftNumbers = (row <= (n / 2 + 1)) ? row : n - row + 1;
            int num = leftNumbers;
            int j = 1;
            while (j <= leftNumbers) {
                System.out.print(num + " ");
                num--;
                j++;
            }

            // Middle spaces
            int midSpace = (row <= (n / 2 + 1)) ? 2 * (row - 1) - 1 : 2 * (n - row) - 1;
            int k = 1;
            while (k <= midSpace) {
                System.out.print("  ");
                k++;
            }

            // Right side numbers (ascending), skip for the first and last row
            if (row != 1 && row != n) {
                int rightCount = (row <= (n / 2 + 1)) ? row : n - row + 1;
                int val = 1;
                int l = 1;
                while (l <= rightCount) {
                    System.out.print(val + " ");
                    val++;
                    l++;
                }
            }

            // Next line
            System.out.println();

            // Adjust spaces for next row
            if (row < (n / 2 + 1)) {
                space -= 2;
            } else {
                space += 2;
            }

            row++;
        }

        sc.close();
    }
}
