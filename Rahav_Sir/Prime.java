import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
         System.out.print("Enter a number :    ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                count += 1;
                }
        }  
            if (count == 1) {
                System.out.println("The given number is prime " + num);
            }
            else{
                System.out.println("The given number is  not a prime " + num);
            }
        }
        
    }

