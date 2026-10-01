import java.util.Scanner;

public class Min_and_Max {
    public static void main(String[] args) {
        int[] arr;
        int size;
        System.out.println("Enter the size of the array   ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " th elements of the array  ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements of the array are ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        int min = arr[0];


        for(int i = 0 ; i < size ; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
        }

        for(int i = 0 ; i < size ; i++){
            if (arr[i] < min ){
                min = arr[i];
            }
        }

        System.out.println("\nThe maximum and the minimum in this array are " + max  +"and " + min );

    }
}