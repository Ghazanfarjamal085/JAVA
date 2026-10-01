import java.util.Scanner;
public class Min_in_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array;    ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + i + "Element of the Array :  ");
            int num_of_arr = sc.nextInt();
            arr[i] = num_of_arr ;

        }
        int min = arr[0];
        for (int j = 0 ; j < arr.length; j++){
            if(arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println("The maximum in this array is " + min );


}

}
