import java.util.Scanner;

public class absoulute {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  ");
        a = sc.nextInt();
        if(a >=0){
            System.out.println("The number here provided is positive and this number is  " + a  );
        }
        else{
            System.out.println("The number here provided is negative  and the absolute value of this number is  " + (-(a) ) );
        }
    }
}
