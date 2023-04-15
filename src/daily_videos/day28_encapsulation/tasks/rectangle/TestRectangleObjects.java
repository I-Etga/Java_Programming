package daily_videos.day28_encapsulation.tasks.rectangle;

public class TestRectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(6.5, 8);

        System.out.println(rectangle1); // Rectangle{width=6.5, length=8.0, area=52.0, perimeter=29.0}

        System.out.println(rectangle1.getLength()); // 8.0

        rectangle1.setLength(9);
        rectangle1.setWidth(7);
        System.out.println(rectangle1); // Rectangle{width=7.0, length=9.0, area=63.0, perimeter=32.0}


    }
}


