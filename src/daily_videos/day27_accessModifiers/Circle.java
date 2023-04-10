package daily_videos.day27_accessModifiers;

public class Circle {

    public double radius;
    public double diameter;

    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    public double calcArea() {
        return pi * radius * radius;
    }


    public double calcPerimeter() {
        return 2 * pi * radius;
    }

    public static void printPiStatic() { // We can NOT use instances inside static methods. But we can use inside instance method static variable !!
        System.out.println("pi= " + pi);
    }

    public void printPiInstance() {
        System.out.println("pi= " + pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi" + pi +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
