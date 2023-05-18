package daily_videos.day34_abstraction_interface.tasks.deviceTask;

public class Google extends Phone implements AndroidApps{
    public Google( String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getModel() + " is turning on");
    }

    @Override
    public void downloadApp() {
        System.out.println("App downloading");
    }
}