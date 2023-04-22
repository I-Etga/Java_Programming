package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class Blackberry extends Phone{
    public Blackberry(String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Blackberry", model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public void text() {
        System.out.println("Texting by BBM");
    }
}
