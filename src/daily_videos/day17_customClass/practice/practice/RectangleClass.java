package daily_videos.day17_customClass.practice.practice;

public class RectangleClass {

    double length ;
    double width ;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "rectangleClass{" +
                "length=" + length +
                ", width=" + width +
                ", area= " + calculateArea() +
                ", perimeter= " + calculatePerimeter() +
                '}';
    }

    public static void main(String[] args) {

        RectangleClass rectangle1 = new RectangleClass();

        rectangle1.length = 10;
        rectangle1.width = 12;
        //System.out.println(rectangle1.calculateArea());
        //System.out.println(rectangle1.calculatePerimeter());
        System.out.println(rectangle1.toString());

        System.out.println("********");

        RectangleClass rectangle2 = new RectangleClass();

        rectangle2.setInfo(20.6,18.5);

        System.out.println(rectangle2.toString());

    }
}

