import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n_th term :   ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("0");
        } else if (n == 2 || n == 3) {
            System.out.println("1");
        } else {
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println(b);

        }
    }
}
