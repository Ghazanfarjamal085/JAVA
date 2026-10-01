// package Java_Assignment;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num % 2) == 0) {
            System.out.println("The given number " + num + "is " + "Even ");
        } else {
            System.out.println("\"The given number \" + num   + \" is \" + \"odd \"");
        }
    }
}
