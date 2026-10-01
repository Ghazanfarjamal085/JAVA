import java.util.Scanner;

public class Q_n0_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  n:   ");
        int n = sc.nextInt();
        int rows = n;
        while (rows >= 1) {
            int stars = 1;
            while (stars <= rows) {
                System.out.print("* ");
                stars++;
            }
            System.out.println();
            rows--;

        }
    }
}
