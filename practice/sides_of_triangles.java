import java.util.Scanner;

public class sides_of_triangles {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1 ");
        a = sc.nextInt();
        System.out.println("Enter the side 2 ");
        b = sc.nextInt();
        System.out.println("Enter the side 3 ");
        c = sc.nextInt();

        if ((a + b) > c && (b + c) > a && (a + c) > b) {
            System.out.println("Yes these three can form the sides of a triangle ");
        } else {
            System.out.println("No these can't be the sides of the trainlge ");
        }
    }
}
