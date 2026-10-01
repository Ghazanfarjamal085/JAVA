import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    void show() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class FinalResult extends Student {
    double internalMarks;
    double externalMarks;

    void readMarks() {
        System.out.print("Enter Internal Marks: ");
        internalMarks = sc.nextDouble();

        System.out.print("Enter External Marks: ");
        externalMarks = sc.nextDouble();
    }

    double total() {
        return internalMarks + externalMarks;
    }

    void showFinalResult() {
        show();
        System.out.println("Internal Marks: " + internalMarks);
        System.out.println("External Marks: " + externalMarks);
        System.out.println("Total Marks: " + total());

        double percentage = total() ;
        System.out.println("Percentage: " + percentage + "%");

    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int N = sc.nextInt();

        FinalResult[] students = new FinalResult[N];


        for (int i = 0; i < N; i++) {
            // System.out.println("\nEnter details of Student " + (i + 1));

            students[i] = new FinalResult();

            students[i].accept();
            students[i].readMarks();
        }

        System.out.println("The final result of the students you provided are ");

        for (int i = 0; i < N; i++) {
            students[i].showFinalResult();
        }

        sc.close();
    }
}