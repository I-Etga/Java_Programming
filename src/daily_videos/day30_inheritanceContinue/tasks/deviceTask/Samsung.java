package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class Samsung extends Phone{
    public Samsung(String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, color, size, price, hasBattery, hasPowerButton);
    }

    public void zoom(){
        System.out.println("Zooming");
    }
}

