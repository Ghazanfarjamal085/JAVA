import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        // int n = sc.nextInt();
        // int i = 1;

        // while (i <= n) {
        //     int j = 1;

        //     while (j <= n) {
        //         System.out.print("* ");
        //         j++;
        //     }

        //     System.out.println();
        //     i++;
        // }

            int n = sc.nextInt();
        int rows = 1;
        // int stars = 1;
        while (rows <= n) {
            int stars = 1;
            while (stars <= n) {
                System.out.print("* ");
                stars++;
            }
            //preparation of next row
            rows++;
            System.out.println();
        }
    }
}
