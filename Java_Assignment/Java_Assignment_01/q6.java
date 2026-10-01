import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int add = a + b;
        System.out.println("Addition = " + add);

        int subtraction = a - b;
        System.out.println("Subtraction = " + subtraction);

        int multiplication = a * b;
        System.out.println("Multiplication = " + multiplication);

        int div = a / b;
        System.out.println("Division = " + div);

        int remainder = a % b;
        System.out.println("Remainder = " + remainder);
    }
}