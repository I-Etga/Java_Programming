package daily_videos.day17_customClass.practice.practice;

public class RechtAngle {

    public double length;
    public double width;

    public double area ;
    public double perimeter;


    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        return width*length;
    }
    public double calculatePerimeter(){
        return 2*(width+length);
    }


    public String toString() {
        return "RechtAngle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" +  width*length+
                ", perimeter=" + 2*(width+length) +
                '}';
    }
}
