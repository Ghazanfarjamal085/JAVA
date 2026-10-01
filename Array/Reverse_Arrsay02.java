public class Reverse_Arrsay02 {
    public static void main(String[] args) {
        int[] arr = { 12, 4567, 45, 782, 56 };
        int n = arr.length ;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int ele : arr) {
            System.out.println(ele + " ");
        }
    }
}
