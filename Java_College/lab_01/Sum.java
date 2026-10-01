import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 01 ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 02 ");
        int n2 = sc.nextInt();
        System.out.println("The addition of these two numbers" + n1 + "and" + n2 + " are " + (n1 + n2));
        }
}