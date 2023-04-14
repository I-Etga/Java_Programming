package daily_videos.day28_encapsulation.tasks.circle;

public class Circle {
    private double radius;

    public double pi;

    public Circle(double radius) {
        setRadius(radius);
        this.pi = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("radius can not be zero or negative");
        }
    }

    public double calcArea() {
        return radius * radius * pi;
    }

    public double calcPerimeter() {
        return 2 * radius * pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

