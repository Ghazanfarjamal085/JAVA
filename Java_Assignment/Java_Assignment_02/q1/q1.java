import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {

        calculator c1 = new calculator(10, 20);

        c1.menu();
    }
}

class calculator {

    int num1;
    int num2;

    calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void add() {
        System.out.println("Addition = " + (num1 + num2));
    }

    void sub() {
        System.out.println("Subtraction = " + (num1 - num2));
    }

    void mul() {
        System.out.println("Multiplication = " + (num1 * num2));
    }

    void div() {
        System.out.println("Division = " + (num1 / num2));
    }

    void menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                add();
                break;

            case 2:
                sub();
                break;

            case 3:
                mul();
                break;

            case 4:
                div();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}