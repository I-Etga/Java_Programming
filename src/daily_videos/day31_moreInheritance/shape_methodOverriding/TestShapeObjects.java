package daily_videos.day31_moreInheritance.shape_methodOverriding;

public class TestShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("--------------");

        Circle circle = new Circle(6);
        System.out.println(circle);
        circle.draw();

    }
}
