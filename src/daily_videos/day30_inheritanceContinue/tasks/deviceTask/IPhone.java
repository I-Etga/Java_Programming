package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class IPhone extends Phone{

    public IPhone( String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(getModel() + " is face-timing with email " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(getModel() + " is face-timing with email " + email);
    }

}
