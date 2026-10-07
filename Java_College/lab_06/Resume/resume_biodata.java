// import Java_College.lab_06.Resume.person.student.resume;

import java.util.Scanner;

import Java_College.lab_06.Resume.employee.student;

public class resume_biodata {
    public static void main(String[] args) {
        student s = new student();
        s.display();

    }
}

class person(){
String name;
 int age ;

    person(){
        this.name = "Unknown man ";
        this.age = -1;
    }
}

class employee extends person(){

}

class teacher extends employee implements resume(){
    int age;
    String name;
    teacher(){
        this.age = -1;
        this.name = "Unknown";
    }

    biodata(){
        System.out.println("Enter the name of Teacher : ");
        Scanner sc = new Scanner(System.in);
        String name_student = sc.next();
        System.out.println("Enter the age of the teacher :  ");
        int age_teacher = sc.nextInt();
        while (true){
            System.out.println("1: Married :    ");
            System.out.println("2: Unmarried :     ");
            System.out.println("3: Exit ");
            int n = sc.nextInt();
            if(n == 1){
                System.out.println("sir is married ");
            }
            if (n === 2){
                System.out.println("sir is Unamrried ");
            }
            if (n == 3){
                System.out.println("you exit from the code succesfully :    ");
                break;
            }
            else{
                System.out.println("Invalid input \n please enter 1 or 2 or 3 ");
            }
        }

        System.out.println("Enter the Experience :  ");
        int exp = sc.nextInt();
        System.out.println("Enter the course which he teaches : ");
        int course = sc.nextInt();

    }
}

class student extends teacher implements resume(){

    void biodata() {
        System.out.print("Enter the name of the student : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Enter Your Age :    ");
        int age_student = sc.nextInt();
        System.out.print("Enter the Branch :   ");
        String branch = sc.next();
        System.out.println("Enter Registration Number :     ");
        int reg = sc.nextInt();
        System.out.println("Enter your CGPA:    ");
        double cgpa = sc.nextDouble();

        void display(){
            System.out.println();
        }
    }
}

interface resume {
    abstract biodata();
}
