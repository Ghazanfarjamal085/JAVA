// package practice;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number  ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}
