package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class SmartTv extends TV{

    public SmartTv(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void stream(){
        System.out.println("Streaming on TV");
    }


}
