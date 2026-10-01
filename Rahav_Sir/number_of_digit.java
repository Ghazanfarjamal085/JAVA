import java.util.Scanner;

public class number_of_digit {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :    ");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            count += 1;
            sum += rem;
        }
        System.out.println(count);
        System.out.println(sum);
        
    }
}
