import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.menu();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();

    }
}

class calculator {
    calculator() {
        int num1 = 0;
        int num2 = 0;
    }

    void add() {
        int num1 = 10;
        int num2 = 20;
        System.out.println("The addition of these two numbers are " + (num1 + num2));
    }

    void sub() {
        int num1 = 10;
        int num2 = 20;
        System.out.println("The subtraction  of these two are " + (num1 - num2));
    }

    void mul() {
        int num1 = 10;
        int num2 = 20;

        System.out.println("The multiplication of these two are " + num1 * num2);
    }

    void div() {
        int num1 = 10;
        int num2 = 20;
        System.out.println("The division  of these two are " + num1 / num2);
    }

    void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int choice;

            System.out.println("1 .Addition ");
            System.out.println("2 .Subtraction ");
            System.out.println("3 .Multiplication  ");
            System.out.println("4 .Division ");
            System.out.println("5 .Exit ");
            System.out.println("Enter you choice    ");
            choice = sc.nextInt();
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
                case 5:
                    System.out.println("You scuccesfully existed from the code ");
                    return;

                default:
                    System.out.println("Invalid input ");
            }

        }

    }
}