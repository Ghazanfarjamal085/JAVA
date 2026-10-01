import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        System.out.print("Eter a number ;    ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("The given number is even :" + num);
        } else {
            System.out.println("The given number is odd :" + num);
        }
    }
}
