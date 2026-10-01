import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        calculator c1 = new calculator(10,30);
        c1.menu();
        c1.add(10,30);
        c1.sub(10,30);
        c1.mul(10,30);
        c1.div(10,30);

    }
}

class calculator {
    int num1 ,num2;
    calculator(int num1 ,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void add(int num1 ,int num2) {

        System.out.println("The addition of these two numbers are " + (num1 + num2));
    }

    void sub(int num1 ,int num2) {

        System.out.println("The subtraction  of these two are " + (num1 - num2));
    }

    void mul(int num1 ,int num2) {

        System.out.println("The multiplication of these two are " + num1 * num2);
    }

    void div(int num1 ,int num2) {

        System.out.println("The division of these two are " + num1 / num2);
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
                    add(10,30);
                    break;

                case 2:
                    sub(10,30);
                    break;

                case 3:
                    mul(10,30);
                    break;

                case 4:
                    div(10,30);
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