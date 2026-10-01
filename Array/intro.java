import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ;    ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the Array :    ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + "Elements of Array:   ");
            int m = sc.nextInt();
            arr[i] = m;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}