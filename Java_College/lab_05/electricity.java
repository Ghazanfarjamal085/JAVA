import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {
        System.out.print("Enter the units of Domestic:    ");
        domestic d = new domestic();
        d.calculate_final_bill();

        System.out.print("Enter the units of Commercial:    ");
        commercial c = new commercial();
        c.calculate_final_bill();
    }
}

interface powerGrid {

    void calculate_final_bill();
}

class domestic implements powerGrid {

    public void calculate_final_bill() {

        Scanner sc = new Scanner(System.in);

        double units = sc.nextDouble();

        // System.out.println("Units consumed of the domestic: " + units);

        if (units <= 100) {
            double bill_of_domestic = (10 * units);
            System.out.println("The final bill of Domestic is " + bill_of_domestic);
        } else {
            System.out.println("unit is to huge");
        }

    }
}

class commercial implements powerGrid {

    public void calculate_final_bill() {

        Scanner sc = new Scanner(System.in);

        double units = sc.nextDouble();

        // System.out.println("Units consumed of commercial: " + units);

        double bill_of_domestic = (20 * units);
        System.out.println("The final bill of Commercial is " + bill_of_domestic);

    }
}

// public class electricity {``
//     public static void main(String[] args) {

//     }
// }


//My name Ghazanfar jamal