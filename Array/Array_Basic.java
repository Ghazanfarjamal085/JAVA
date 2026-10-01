
// public class Array_Basic {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 34, 323, 0, 89 };
//         System.out.print(arr[5]);
//         for (int i = 1; i <= arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// public class Array_Basic {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 34, 323, 0, 89 };
//         System.out.print(arr[5]);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] +   " ");
//         }

//     }
// }

import java.util.Scanner;

public class Array_Basic {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array:    ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + "term of Array ");
            int nums_of_array = sc.nextInt();
            arr[i] = nums_of_array  ;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "  ");
            sum+=arr[j];
        }
        System.out.println(sum);
        }
    }
    
