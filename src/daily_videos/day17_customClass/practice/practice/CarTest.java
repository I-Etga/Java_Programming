package daily_videos.day17_customClass.practice.practice;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.marke = "Ford";
        car.model = "Fiesta";
        car.year = 2022;
        car.color = "Blue";
        car.price = 25000;

        System.out.println(car.toString());

        Car car2 = new Car();

        car2.setInfo("Opel","Astra",2011,"White",8000);

        System.out.println(car2.toString());
    }
}
