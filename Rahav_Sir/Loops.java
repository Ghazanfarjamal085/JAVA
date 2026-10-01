import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // for (int i = 0; i < 4; i++) {
        // System.out.println("Jamal Thanks !!!");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // for (int i = 1 ; i <= num ;i++){
        // System.out.println("Ghazanfar is A lonely Boy !!!" + " " + i);
        // }
        // int count= 0;
        // for (int i = 1; i <= 100; i++) {
        // if (i % 2 == 0) {
        // count += 1;
        // System.out.println(i);
        // }

        // }
        // System.out.println(count);
        // for (int i = 1; i <=10; i++){
        // System.out.println("17 X i = " + 17*i);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // System.out.println("The table of "+ num);
        // for (int i = 1; i <=10; i++){
        // System.out.println("num X i = " + num*i);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // for (int i = num ; i >=0; i--){
        // System.out.println(i);
        // }

        // System.out.println("The AP is 2 , 5, 8, 11...");
        // System.out.print("Enter the n th tern you want to display: ");
        // Scanner sc = new Scanner(System.in);
        // System.out.print("\nEnter a number : ");
        // int num = sc.nextInt();
        // int nth = 2 + ((num-1) * 3);
        // System.out.println("The nth term of this series is " + nth );
        // for ( int i = 1 ; i <=num ; i ++){
        // System.out.print(2 + ((i-1) * 3) + " ");
        // }

        // System.out.println("Given AP = 99 , 95 , 91 , 87 ...");
        // int count =0;
        // System.out.print("The AP is positive till : ");
        // for (int i = 1; i <= 25; i++) {
        // System.out.println(103 - (4 * i));
        // count +=1;
        // }
        // System.out.println("The number of terms which are positive are " + count);

        // System.out.println("The Given Gp = 1 , 2, 4, 8");
        // System.out.print("Give the nth number of term : ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // double nth_term = 1 * (Math.pow(2, (n-1)));
        // System.out.println(nth_term);

        // for (int i = 65 ; i <= 90; i++){
        // System.out.println((char)i);
        // }

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
