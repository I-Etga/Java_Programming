package daily_videos.day34_abstraction_interface.tasks.deviceTask;

public class IPhone extends Phone implements AppleApps {

    public IPhone(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getModel() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getModel() + " is turning off");
    }

    @Override
    public void downloadApp() {
        System.out.println(" App downloading");
    }

    public void faceTime(long phoneNumber) {
        System.out.println(getModel() + " is face-timing with email " + phoneNumber);
    }

}