package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class Computer extends Device{

    public Computer(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void restart(){
        System.out.println("Computer is restarting ...");
    }
}

