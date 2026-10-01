public class Sorted_array_or_not {
    public static void main(String[] args) {

        boolean isSorted = true;
        // int[] arr = { 12, 45, 6, 89, 1, 1000 };
        int[] arr = { 1,2,2,3,3,5,5,5,5,10};
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] >  arr[i + 1]) {
                isSorted = false;
                break;
            } 
        }
        if (isSorted) {
            System.out.println("Yes the array is sorted ");
        } else {
            System.out.println("No the array is no tsorted ");
        }
    }
}
