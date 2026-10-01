import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 56, 78, 88 };
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int size = arr.length;
        for(int i = (size - number); i <=size; i++){
            arr[0] = arr[1];
            arr[1] = arr[2];
        }
        for (int i = 0 ; i <=1 ; i++){
            arr[i] = arr[i+1];
        }
        // System.out.println("The array formed is " + arr);
        for (int i = 0 ; i <arr.length ; i++){
            System.out.println(arr);
        }
    }
}
