package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(){
        System.out.println("Texting");
    }


    public void text(){
        System.out.println("Calling");
    }
}

