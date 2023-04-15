package daily_videos.day28_encapsulation.tasks.rectangle;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.err.println("Invalid width. It can not be zero or negative");
            System.exit(1);
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.err.println("Invalid length. It can not be zero or negative");
            System.exit(1);
        }

        this.length = length;
    }

    public double calcArea() {
        return width * length;
    }

    public double calcPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}

/*

        Methods:
            calcArea(): returns the area of rectangle
            calcPerimeter(): returns the perimeter of rectangle
            toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement
 */