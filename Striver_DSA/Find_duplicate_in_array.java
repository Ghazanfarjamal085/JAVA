public class Find_duplicate_in_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3, 7, 5 };
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(
                            "yes duplicate element is found in this array at " + i + "and is at index " + arr[i]);
                    foundDuplicate = true;
                    break;
                }
                // else{
                //     System.out.println("No duplicate has been found ");
                // }
            }
        }
        // if(foundDuplicate){
        //     System.out.println();
        // }
    }
}
