import java.util.Scanner;

public class inventedhourpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();  // example: 5

        // upper half including middle
        for (int i = 0; i <= n; i++) {
            // left side decreasing
            for (int j = n; j >= n - i; j--) {
                System.out.print(j + " ");
            }

            // spaces
            int space = (n - i) * 2 - 1;
            for (int s = 0; s < space; s++) {
                System.out.print("  ");
            }

            // right side increasing
            if (i != n) {
                for (int j = n - i; j <= n; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= n; j++) {  // start from 1 to avoid double 0
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 0; i--) {
            // left side decreasing
            for (int j = n; j >= n - i; j--) {
                System.out.print(j + " ");
            }

            // spaces
            int space = (n - i) * 2 - 1;
            for (int s = 0; s < space; s++) {
                System.out.print("  ");
            }

            // right side increasing
            for (int j = n - i; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
