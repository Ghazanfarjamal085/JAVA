public class calculation_Circle {
    public static void main(String[] args) {
        circle c1 = new circle(10);
        System.out.println(c1.volume());
        System.out.println(c1.perimeter());

    }
}

class circle {
    double radius;
    double volume;
    double perimeter;

    circle() {
        radius = 0;
    }

    circle(double radius) {
        this.radius = radius;
    }

    double volume() {
        volume = Math.PI * Math.pow(radius, 2);
        return volume;
    }

    double perimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;

    }
}