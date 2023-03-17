package daily_videos.day17_customClass.practice;

public class TestCar {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.marke = "Opel";
        car1.model = "Astra";
        car1.color = "Blue";
        car1.year = 2011;
        car1.price = 7000;

        System.out.println(car1.toString());
        Car car2 = new Car();

        car2.setInfo("Ford","Fiesta",2021,"White",21000);
        System.out.println(car2.toString());

    }

}
