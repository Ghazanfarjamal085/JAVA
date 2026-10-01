import java.util.Scanner;

public class Q_no_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        // int rows = sc.nextInt();
        // int j = 1;

        // while (j <= rows){ // is loop se number of rows pata lag rha hai
        // int i = 1;
        // while(i <= j){ // stars print is loop se krwa rhein hain
        // System.out.print("* ");
        // i++;
        // }
        // j++;
        // System.out.println();
        // }

        // Monu Bhaiya method
        int n = sc.nextInt();
        int row = 1;
        int stars = 1;
        while (row <= n) {
        // stars print krna
        int i = 1;
        while (i <= stars) {
        System.out.print("* ");
        i++;
        }
        // preparation of next row
        row++;
        System.out.println();
        stars++;
        }

    
    }
}
