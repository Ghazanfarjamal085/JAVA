public class Search_in_Array {
    public static void main(String[] args) {
        int[] arr = { 12, 18, 45, 8 };
        int x = 45;
        boolean found = false ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                // System.out.println("Yes ");
                found = true;
                
            }
        }
             if (found){
             System.out.print(" yes ");
        }
        else{
            System.out.print(" No ");
        }
    }

}
