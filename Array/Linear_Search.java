public class Linear_Search {
    public static void main(String[] args) {
        // int[] arr = { 18, 12, 9, 14, 77, 50 };
        int[] arr = { 18, 12, 9, 15, 77, 50 };
        int numToBefound = 7;
        boolean foundIt = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == numToBefound){
                foundIt = true;
            }
            }
     if(foundIt){
        System.out.println("yes there is no such elements in this array " + numToBefound);
     }
     else{
        System.out.println("No there is no such elements in this array " + numToBefound);
     }
    }
}
