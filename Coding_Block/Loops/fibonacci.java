
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
       int num1 = 0;
       int num2 = 1;
       int next = 0;

       Scanner sc = new Scanner(System.in);
       int nth_term;
       System.out.println("Enter a nth term :   ");
       nth_term = sc.nextInt();

        if(nth_term ==1){
            System.out.println(0);
        }
        else if (nth_term ==2){
            System.out.println(1);
        }
        else{
            for(int i = 3; i <= nth_term ; i++){
                next = num1 + num2;
                num1 = num2;
                num2 = next;
                System.out.println(next );
                
            }

        }
        System.out.println(next );
    }
}
