import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        System.out.print("Enter the length of Array:  ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        // System.out.print("Enter the elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + "st Element ");
            int num_of_arr = sc.nextInt();
            arr[i] = num_of_arr;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (i % 2 == 0){
                arr[i]+=10;
            }
            else{
                arr[i]*=2;
            }
        }
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
