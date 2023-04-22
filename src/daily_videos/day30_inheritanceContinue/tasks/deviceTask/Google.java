package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class Google extends Phone{
    public Google( String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Google", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void moonPhoto(){
        System.out.println(getBrand() + " " + getModel() + " is taking shot of moon ");
    }
}
