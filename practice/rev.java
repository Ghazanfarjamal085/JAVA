import java.util.*;

public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the aray  ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter arrray element : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                boolean leader = true;
                if (arr[i] > arr[j]) {
                    System.out.print(arr[i] + " ");
                    leader = false;
                }
                if (leader) {
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }
}