// package Coding_Block.Loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:   ");
        int num1 = sc.nextInt();
        int  ori = num1;
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
        int  ori2 = num2;
        int rem;
        do{

            rem = num2 % num1 ;
            num2 = num1;
            num1 = rem;

        }
        while (rem!=0);
    System.out.println("The HCF of these two numbers " + ori+" and " + ori2 + " are " + num2);    
    }

}
