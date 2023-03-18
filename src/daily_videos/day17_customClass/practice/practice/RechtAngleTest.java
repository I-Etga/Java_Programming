package daily_videos.day17_customClass.practice.practice;

public class RechtAngleTest {
    public static void main(String[] args) {

        RechtAngle rechtAngle = new RechtAngle();

        rechtAngle.setInfo(12,15);

        System.out.println(rechtAngle.toString());


        System.out.println(rechtAngle.calculateArea());
        System.out.println(rechtAngle.calculatePerimeter());

    }
}
