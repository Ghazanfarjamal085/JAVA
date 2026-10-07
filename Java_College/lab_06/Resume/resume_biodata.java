import java.util.Scanner;

public class resume_biodata {
    public static void main(String[] args) {

        student s = new student();

        s.biodata();
        s.display();
    }
}

// Parent class
class person {
    String name;
    int age;

    person() {
        this.name = "Unknown";
        this.age = -1;
    }
}

// Child of person
class employee extends person {

}

// Child of employee + implements interface
class teacher extends employee implements resume {

    int age;
    String name;

    teacher() {
        this.age = -1;
        this.name = "Unknown";
    }

    @Override
    public void biodata() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of Teacher: ");
        String teacherName = sc.next();

        System.out.print("Enter the age of Teacher: ");
        int teacherAge = sc.nextInt();

        while (true) {

            System.out.println("\n1. Married");
            System.out.println("2. Unmarried");
            System.out.println("3. Exit");

            int n = sc.nextInt();

            if (n == 1) {
                System.out.println("Sir is married");
                break;
            }
            else if (n == 2) {
                System.out.println("Sir is unmarried");
                break;
            }
            else if (n == 3) {
                System.out.println("You exited successfully");
                break;
            }
            else {
                System.out.println("Invalid input. Please enter 1, 2 or 3.");
            }
        }

        System.out.print("Enter the Experience: ");
        int exp = sc.nextInt();

        System.out.print("Enter the course which he teaches: ");
        String course = sc.next();

        System.out.println("\n--- Teacher Biodata ---");
        System.out.println("Name: " + teacherName);
        System.out.println("Age: " + teacherAge);
        System.out.println("Experience: " + exp + " years");
        System.out.println("Course: " + course);
    }
}

// Student inherits teacher
class student extends teacher implements resume {

    @Override
    public void biodata() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of Student: ");
        String studentName = sc.next();

        System.out.print("Enter Your Age: ");
        int studentAge = sc.nextInt();

        System.out.print("Enter the Branch: ");
        String branch = sc.next();

        System.out.print("Enter Registration Number: ");
        int reg = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n--- Student Biodata ---");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Branch: " + branch);
        System.out.println("Registration Number: " + reg);
        System.out.println("CGPA: " + cgpa);
    }

    void display() {
        System.out.println("\nStudent object created successfully.");
    }
}

// Interface
interface resume {
    void biodata();
}