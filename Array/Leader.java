import java.util.Scanner;

public class Leader {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array ;   ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + "elemts of this array    ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("=======");
        for (int i = 0; i < (size - 1); i++) {
            boolean leader = true;
            for (int j = (i+1); j < (size - 1); j++) {
                if (arr[i] <= arr[j]){
                    leader = false;
                    break;
                }
                    System.out.print(arr[i] + " ");
                // break;
            }
        }
    }
}