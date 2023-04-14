package daily_videos.day28_encapsulation.tasks.circle;

public class TestCircleObjects {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        System.out.println(circle); // Circle{radius=4.5, area=63.585, perimeter=28.26}

        circle.setRadius(8);
        System.out.println(circle); // Circle{radius=8.0, area=200.96, perimeter=50.24}

        System.out.println(circle.getRadius());

    }
}
