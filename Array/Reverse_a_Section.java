public class Reverse_a_Section {
    public static void main(String[] args) {
       int[] arr = { 34, 9, 43, 263, 90 , 144, 1976 };
        int i = 2;
        int j = 5;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}
