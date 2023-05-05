package daily_videos.day35_polymorphism.transportationTask;

public class Tesla extends Car implements Electric, AutoPilot {
    /*  If we implement the AutoPilot interface, methods of AutoPark will be implemented as well.
        Because AutoPilot is child/sub class of AutoPark.
            */

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }
}
