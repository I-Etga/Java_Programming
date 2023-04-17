package daily_videos.day30_inheritanceContinue.phoneTask;

public class Nokia extends Phone_superClass {


    public Nokia(String model, double size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefence() {
        System.out.println(getBrand() + " " + getModel() + " is self defencing! ");
    }

}