import java.util.Scanner;

public class reverse_arr {
    public static void main(String[] args) {
        int[] arr;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:    ");
        int size = sc.nextInt();
        arr = new int[size];
        int[] rev = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + "elements of array ");
            arr[i] = sc.nextInt();
        }
        int number_of_times = sc.nextInt();

        // for (int i = (size - 1), j = 0; i >= 0; i--, j++) {
        //     rev[j] = arr[i];
        // }
        // for (int i = 0; i < size; i++) {
        //     System.out.print(rev[i] + " ");
        // }
        // for(int i= (size-number_of_times),j=size-1 ; i<size; i++,j--){
        //     rev[i] = arr[j];
        //     System.out.print(rev[i] + " ");
        // }
        //  for(int i= 0, j=size-number_of_times-1;i <size-number_of_times ; i++,j--){
        //     rev[i] = arr[j];
        //     System.out.print(rev[i] + " ");
        //}
        int i,j;
        for(i=0,j=size-number_of_times-1;i<size-number_of_times;i++,j--){
            rev[i]=arr[j];
            System.out.print(rev[i]+" ");
        }
        for(j=size-1;j>=size-number_of_times;j--,i++){
            rev[i]=arr[j];
            System.out.print(rev[i]+" ");
        }
        // for (int u = (size - 1), v = 0; u>= 0; u--, v++) {
        //     arr[v] = rev[u];
        //     System.out.println(arr[u]+" ");
        // }
       
    }
}
