package daily_videos.day25_cunstructors;

public class Rectangle {

    public double length , width;

    public double area (){
        return length*width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

