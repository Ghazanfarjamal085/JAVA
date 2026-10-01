import java.util.Scanner;

public class Rotate_Array {
    public static void reverse( int [] arr, int i, int j ) {
       
      while (i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 8, 1, 2, 4, 9, 0 };
        System.out.println("Enter How many times you want to rotate the array :    ");
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();


       reverse(arr, 0, n - 1);       // pure Array ko reverse krdo 
       reverse(arr, 0, k - 1);       // shuruwat ke elements ko reverse kro 
       reverse(arr, k, n - 1);       // bakki bache elements ko reverse rko 


       System.out.print("The rotated Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
