package daily_videos.day28_encapsulation.tasks.square;

public class Square {

    private double side;

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Invalid side. Side can not be zero or negative");
            System.exit(1);
        }
        this.side = side;
    }

    public double carArea() {
        return side * side;
    }

    public double calcPerimeter() {
        return 4 * side;
    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                " area=" + carArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}
