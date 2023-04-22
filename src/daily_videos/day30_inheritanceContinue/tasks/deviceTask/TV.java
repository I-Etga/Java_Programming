package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class TV extends Device {
    public TV(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void channelUp() {
        System.out.println("Next Channel is opening...");
    }

    public void channelDown() {
        System.out.println("Previous Channel is opening");
    }

}


