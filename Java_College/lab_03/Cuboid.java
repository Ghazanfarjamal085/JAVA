public class Cuboid{
    public static void main(String[] args) {
        Main_box M1 = new Main_box(10);
        M1.volume_calculation();

    }
}

class Main_box {
    double length, breadth, height;

    Main_box() {
        length = 0.0;
        breadth = 0.0;
        height = 0.0;
    }

    Main_box(double length) {
        this.length = length;
        this.breadth = length;
        this.height = length;
    }

    Main_box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void volume_calculation() {
        System.out.println("The volume of the dimension you provided is " + length * breadth * height);
    }
}