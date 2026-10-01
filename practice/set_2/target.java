import java.util.Scanner;
public class target{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the aray  ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("enter arrray element : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.print("Enter the target which u want : ");
        // int target = sc.nextInt();


        //  for (int i = 0 ; i<arr.length;i++){
        //     for (int j = i+1; j<arr.length; j++){
        //         if((arr[i] + arr[j])== target){
        //             System.out.println(arr[i] + " and " + arr[j]);
        //         }
        //     }
        // } 
        int count= 0; 
        for(int i = 0 ; i< size ; i++){
            for (int j= i+1; j<size; j++){
                if(arr[i]== arr[j]){
                    count+=1;
                   System.out.println("The occurance of"+ arr[i] + " " );
                }
                System.out.println(count);
            }
        }
         

    }
}