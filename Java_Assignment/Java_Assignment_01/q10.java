// package Java_Assignment;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbeer 01    ");
        int num1 = sc.nextInt();
        System.out.print("Enter numbeer 02    ");
        int num2 = sc.nextInt();
        System.out.print("Enter numbeer 03    ");
        int num3 = sc.nextInt();
        int average = (num1 + num2 + num3) / 3;
        System.out.println("The average of these three number " + num1 + " " + num2  + " "+ num3+  " " + "is " + average);
    }
}
