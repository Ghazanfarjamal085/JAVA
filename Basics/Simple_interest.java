import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle :   ");
        double principle = sc.nextDouble();
        System.out.print("Enter rate :   ");
        double rate = sc.nextDouble();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter time :   ");
        int time = sc1.nextInt();
        double Simple_interest = principle * rate * time / 100;
        System.out.println("The simple interest is :" + Simple_interest);
    }
}