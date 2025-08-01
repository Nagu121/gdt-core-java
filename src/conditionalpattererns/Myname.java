package conditionalpattererns;
import java.util.Scanner;

public class Myname{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // N
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // A
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i != 0 ||
                    i == 0 && j != 0 && j != n - 1 ||
                    i == n / 2) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // G
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 ||
                    (i == n / 2 && j >= n / 2) ||
                    (j == n - 1 && i >= n / 2)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // U
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i != n - 1 ||
                    i == n - 1 && j != 0 && j != n - 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println(); // next row
        }
    }
}
