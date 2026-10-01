import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        
        int [] arr = {12,89,45,90};
        print(arr);
        Arrays.sort(arr);
        print("The sorted array is " + arr);
    
    }
   public static void print (int [] arr){
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
    }
   } 
    

}
