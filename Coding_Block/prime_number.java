
import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int count = 0;
        System.out.print("Enter a number :  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count+=1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime ");
        } else {
            System.out.println("Not prime ");
        }
    }
}
