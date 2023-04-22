package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class Laptop extends Computer{

    public Laptop(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void onTrip(){
        System.out.println("Laptop is available to use on trip");
    }
}
