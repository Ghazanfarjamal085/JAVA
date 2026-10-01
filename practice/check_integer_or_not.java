// package practice;

import java.util.Scanner;

public class check_integer_or_not {
    public static void main(String[] args) {
        double num;
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        int a = (int) num;
        if ((num - a) == 0) {
            System.out.println("The number given is integer");
        } else {
            System.out.println("The number given is not integer");
        }
    }
}
