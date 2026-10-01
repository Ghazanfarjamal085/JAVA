// package Java_Assignment;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        double perimeter =2 * Math.PI * radius; 
        System.out.println("The area of the circle having radius " + radius + " is " + area );
        System.out.println("The perimeter  of the circle having radius " + radius + " is " + perimeter );
    }
}
