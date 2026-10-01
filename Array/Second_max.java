import java.util.Arrays;

public class Second_max {
    public static void main(String[] args) {
        int[] arr = { 34, 9, 43, 263, 90 };
        // Arrays.sort(arr);
        // System.out.println("Sorted Array : " + Arrays.toString(arr));
        // int smax = arr[arr.length - 2];
        // System.out.println("The second maximun in the array is " + smax);

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }




        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }
        System.out.println("The maximum element in the array is : " + max);
        System.out.println("The second maximum element in the array is : " + smax);
    }
}
