
    import java.util.Scanner;

public class pyramid{
    public static void main(String[] args) {
        int stars = 1;
        int rows = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:    ");
        int n = sc.nextInt();
        int space = n - 1;
        while (rows <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= stars) {
                System.out.print("* ");
                j++;
            }
            stars++;
            rows++;
            space--;
            System.out.println();

        }
    }
}


