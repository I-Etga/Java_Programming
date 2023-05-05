package daily_videos.day35_polymorphism.transportationTask;

public class Audi extends Car implements AutoPark {
    /*  Car class can not provide the all methods Audi Class needs.
         So we implement Autopark interface.*/

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }

    @Override
    public void autoPark() {

    }
}
