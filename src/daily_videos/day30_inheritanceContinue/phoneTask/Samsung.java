package daily_videos.day30_inheritanceContinue.phoneTask;

public class Samsung extends Phone_superClass {


    public Samsung(String model, double size, double price, String color) {
        super("Samsung", model, size, price, color);
    }

    public void freeze() {
        System.out.println(getBrand() + " " + getModel() + " is freezing! ");
    }

}
