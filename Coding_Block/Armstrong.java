import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy_number = n;
        int size = 0;
        int rem = 0;
        while (n > 0) {
            n = n / 10;
            size += 1;
        }
        
        System.out.println(size);
        n = copy_number;
        int sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum += (int) Math.pow(rem, size);
            n = n / 10;
        }
        System.out.println(sum);

        if (sum == copy_number) {
            System.out.println("yes the given number is armstrong number "   + copy_number);
        } else {
            System.out.println("No the given number is not an armstrong number "   + copy_number);
        }
    }
}
