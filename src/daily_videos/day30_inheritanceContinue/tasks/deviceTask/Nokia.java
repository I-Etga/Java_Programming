package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class Nokia extends Phone{
    public Nokia(String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void defence(){
        System.out.println(getBrand() +" " + getModel() + " is defencing");
    }
}
