package daily_videos.day34_abstraction_interface.tasks.deviceTask;

public abstract class Computer extends Device {

    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }
}
