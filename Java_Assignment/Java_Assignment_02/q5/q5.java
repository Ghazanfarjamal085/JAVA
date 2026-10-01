import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        calculator c1 = new calculator(num1, num2);

        c1.calculate(num1, num2, operator);
    }
}

class calculator {

    int num1;
    int num2;

   
    calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void add(int num1, int num2) {
        System.out.println("Addition = " + (num1 + num2));
    }

    void sub(int num1, int num2) {
        System.out.println("Subtraction = " + (num1 - num2));
    }

    void mul(int num1, int num2) {
        System.out.println("Multiplication = " + (num1 * num2));
    }

    void div(int num1, int num2) {
        System.out.println("Division = " + (num1 / num2));
    }

    void calculate(int num1, int num2, char operator) {

        switch (operator) {

            case '+':
                add(num1, num2);
                break;

            case '-':
                sub(num1, num2);
                break;

            case '*':
                mul(num1, num2);
                break;

            case '/':
                div(num1, num2);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}