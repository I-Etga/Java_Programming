package daily_videos.day28_encapsulation.tasks.square;

public class TestSquareObjects {
    public static void main(String[] args) {
        Square square = new Square(6);

        System.out.println(square); //Square{side=6.0 area=36.0perimeter=24.0}

        square.setSide(8);

        System.out.println(square); //Square{side=8.0 area=64.0perimeter=32.0}
    }
}
