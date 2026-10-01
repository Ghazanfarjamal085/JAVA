import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the aray  ");
        // int size = sc.nextInt();
        // int[] arr = new int[size];
        // System.out.print("enter arrray element : ");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // for (int i = 0; i < size; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // for (int i = 0; i < size / 2; i++) {
        // int temp = arr[i];
        // arr[i] = arr[size - 1-i];
        // arr[size - 1- i] = temp;
        // }
        // for (int i = 0; i < size; i++) {
        // System.out.println(arr[i] + " ");
        // }
        // System.out.println("====");
        // for (int i = 0; i < size; i++) {
        //     for (int j = i+1; j < size; j++) {
        //         if (arr[i] == arr[j]) {
        //             System.out.print(arr[i] + " ");
        //         }
            // }
        // }
        int []arr = {2,7,11,15,3,6};
        int target = 9;
        for (int i = 0 ; i<arr.length;i++){
            for (int j = i+1; j<arr.length; j++){
                if((arr[i] + arr[j])== 9){
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }

    }
}