package daily_videos.day34_abstraction_interface.tasks.deviceTask;

public class Dekstop extends Computer implements Downloadable{
    public Dekstop(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop is turning off");
    }

    @Override
    public void turnOff() {
        System.out.println("Dekstop is turning off");
    }

    @Override
    public void downloadApp() {
        System.out.println("Desktop app downloading");
    }
}
