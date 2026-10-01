import java.util.Scanner;

public class Sum_of_2 {
    public static int sum(int a , int b){
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:   ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2:   ");
        int num2 = sc.nextInt();
        System.out.println(sum(num1, num2));
    }
}
