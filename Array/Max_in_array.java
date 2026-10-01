

import java.util.Scanner;

public class Max_in_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array;    ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + i + "Element of the Array :  ");
            int num_of_arr = sc.nextInt();
            arr[i] = num_of_arr ;
            // System.out.print(arr[i] + " ");
        }
        int max = arr[0];
        for (int j = 0 ; j < arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println("The maximum in this array is " + max );

    }
}
