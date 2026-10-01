// package Java_Assignment;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter teh length of rectangle ");
    int length = sc.nextInt();

    System.out.print("Enter the breadth of the rectagle   ");
    int breadth = sc.nextInt();
    double area = length * breadth;
    double perimeter = 2 * (length + breadth);
    System.out.println( "The perimeter and the area of the rectangele having  length and bredth  " +  length  + " and "+ breadth +" is " + perimeter +","+ area);
    }
}
