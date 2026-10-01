public class q1 {

    public static void main(String[] args) {

        cuboid c1 = new cuboid(5, 5, 4);
        c1.volume();
        cube c2 = new cube(10);
        c2.volume();


        circle c3 = new circle(10);
        c3.area();


        rectangle c4 = new rectangle(3, 4);
        c4.area2();


        triangle c5 = new triangle(10, 10);
        c5.area3();

    }
}


class shapes {

    double length;
    double breadth;
    double height;

    shapes(double length, double breadth, double height) {

        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
}


class cuboid extends shapes {

    cuboid(double length, double breadth, double height) {
        super(double length, double breadth, double height);
    }
    void volume() {
       double v = length * breadth * height;
       System.out.println("Volume of the cuboid is " + v);
    }
}


class cube extends shapes {
    cube(double length) {
        super(length, 0, 0);
    }
    void volume() {
        double v2 = length * length * length;
        System.out.println("Volume of the cube is " + v2);
    }
}


class circle extends shapes {
    circle(double length) {
        super(length, 0, 0);
    }
    void area() {
        double area1 = 3.14 * length * length;
        System.out.println("Area of the circle is " + area1);
    }
}


class rectangle extends shapes {
    rectangle(double length, double breadth) {
        super(length, breadth, 0);
    }

    void area2() {
        double area2 = length * breadth;
        System.out.println("Area of the rectangle is " + area2);
    }
}


class triangle extends shapes {
    triangle(double length, double breadth) {
        super(length, breadth, 0);
    }

    void area3() {
       double area3 = 0.5 * length * breadth;
       System.out.println("Area of the triangle is " + area3);
    }
}





