package daily_videos.day26_statics.tasks.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4);

        System.out.println(circle1.calcPerimeter());
        System.out.println( circle1.calcArea());

        Circle circle2 = new Circle(10);

        System.out.println(circle2.calcArea());
        System.out.println(circle2.calcPerimeter());

        circle1.printPiInstance(); // instances are called through object
        Circle.printPiStatic(); // // statics are called through Class

    }
}
