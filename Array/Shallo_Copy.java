
public class Shallo_Copy {
    public static void main(String[] args) {
    int [] arr = {12,89,45,90};
    int [] a = arr; // Shallow Copy
    a[3] = 1000; 
    System.out.println(arr[3]);
    System.out.println(a[3]);
    }
    
    
}
