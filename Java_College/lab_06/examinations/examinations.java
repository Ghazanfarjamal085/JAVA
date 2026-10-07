import java.util.Scanner;

public class examinations {
    public static void main(String[] args) {

        Online_Exam obj = new Online_Exam();
        obj.Conduct_Exam();
        exam.display();

    }
}



interface exam {

    void Conduct_Exam();

    default void guidelines() {
        System.out.println("Follow all examination guidelines.");
    }

    static void display() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your registration number: ");
        int reg = sc.nextInt();

        System.out.print("Enter your semester: ");
        int sem = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + reg);
        System.out.println("Semester: " + sem);
    }
}



class Online_Exam implements exam {

    public void Conduct_Exam() {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1: No back paper");
            System.out.println("2: Yes back paper");
            System.out.println("3: Exit");

            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            if (n == 1) {

                System.out.println("You have no back paper.");

                System.out.print("Enter the number of subjects: ");
                int sub = sc.nextInt();

                int total_fees = sub * 100;

                System.out.println("Total fees = " + total_fees);
            }

            else if (n == 2) {

                System.out.println("You have back paper.");

                System.out.print("Enter the number of subjects: ");
                int sub = sc.nextInt();

                System.out.print("Enter the number of back papers: ");
                int back_paper = sc.nextInt();

                int total_fees = (sub * 100) + (back_paper * 200);

                System.out.println("Total fees = " + total_fees);
            }

            else if (n == 3) {

                System.out.println("Exit....");
                break;
            }

            else {

                System.out.println("Invalid input! Please enter 1, 2 or 3.");
            }
        }
    }
}

class Offline_Exam implements exam {

    public void Conduct_Exam() {
        System.out.println("Offline examination");
    }
}