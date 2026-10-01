import java.util.Scanner;

public class product_of_array {
    public static void main(String[] args) {
        System.out.print("Enter the length of Array:  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + "st Element ");
            int num_of_arr = sc.nextInt();
            arr[i] = num_of_arr;
        }
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
           product*=arr[i];
        }
        System.out.println(product);
}
}
