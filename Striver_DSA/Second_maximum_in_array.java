// package Striver_DSA;
public class Second_maximum_in_array {
    // public class Practice_set {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 6, 89, 1, 1000 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
            if ((arr[i] > smax) && (arr[i] < max  )) {
                smax = arr[i];
            }
        }

        System.out.println("The maximun in this array is " + max);
        System.out.println("The second maximun in this array is " + smax);
    }
}

