// package Java_Assignment;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:   ");
        String name = sc.nextLine();
        System.out.print("Enter your registration number      ");
        int registration_num = sc.nextInt();
        System.out.print("Enter your roll number      ");
        int roll_num = sc.nextInt();
        System.out.print("Enter your Branch:   ");
        sc.nextLine();
        String Branch = sc.nextLine();

        System.out.println("The name of the user is " + name);
        System.out.println("The registation  number of  the user is " + registration_num);
        System.out.println("The roll Number   number of  the user is " + roll_num);
        System.out.println("The Branch of  the user is " + Branch);
    }
}
