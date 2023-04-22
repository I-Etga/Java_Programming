package daily_videos.day30_inheritanceContinue.tasks.deviceTask;

public class PersonalCumputer  extends Computer{
    public PersonalCumputer(String brand, String model, String color, double size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void pc(){
        System.out.println("The operating system of PC is Windows");
    }
}