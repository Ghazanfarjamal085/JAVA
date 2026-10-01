import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1:  ");
        int a = sc.nextInt();
        System.out.print("Enter number2:  ");
        int b = sc.nextInt();
        System.out.println("The numbers before swappings are " );
        System.out.println(a);
        System.out.println(b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The numbers after  swappings are " );
        System.out.println(a);
        System.out.println(b);
    }
}
