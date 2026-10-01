import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
    //   conditon ? True: False  
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :    ");
    int num = sc.nextInt();
    String result = (num % 2 == 0) ? "Even" : "Odd";
    System.out.println(result);
    }
}
