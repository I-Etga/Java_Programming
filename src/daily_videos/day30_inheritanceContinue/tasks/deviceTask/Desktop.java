package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class Desktop extends Computer{
    public Desktop(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") + ", hasBattery=" + isHasBattery() + "}";
    }
}
