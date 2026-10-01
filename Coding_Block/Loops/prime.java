// package Coding_Block.Loops;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if ((num % i == 0)) {
                count += 1;

            }
        }
        if (count == 0) {
            System.out.println("The number you provided is prime " + num);
        } else {
            System.out.println("The number you provided is not prime " + num);
        }
    }
}
