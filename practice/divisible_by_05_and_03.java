// package practice;

import java.util.Scanner;

public class divisible_by_05_and_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if ((num % 3 == 0) && (num % 5 == 0)) {
            System.out.println("Yes the number is divisible by both 5 as well as 3 ");
        } else if (num % 3 == 0) {
            System.out.println("The number  is divisible by 3 only ");
        } else if (num % 5 == 0) {
            System.out.println("The number  is divisible by 3 only ");
        } else {
            System.out.println("The number is neither divisble by 5 nor 3 ");
        }
    }
}
