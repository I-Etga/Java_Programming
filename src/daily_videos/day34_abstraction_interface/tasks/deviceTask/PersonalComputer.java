package daily_videos.day34_abstraction_interface.tasks.deviceTask;

public class PersonalComputer extends Computer implements Downloadable {
    public PersonalComputer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);

    }

    @Override
    public void turnOn() {
        System.out.println("PC is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("PC is turning off");
    }

    @Override
    public void downloadApp() {
        System.out.println("PC app downloading");
    }


}