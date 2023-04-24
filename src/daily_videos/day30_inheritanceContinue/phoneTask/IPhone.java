package daily_videos.day30_inheritanceContinue.phoneTask;

public class IPhone extends Phone_superClass {
    public static boolean hasApplePay = true;

    public IPhone(String model, double size, double price, String color, boolean isImitation) {
        super("Apple",model, size, price, color); // super calls the constructor of superClass(parent)
    }

    public void faceTime(long phoneNumber) {
        System.out.println(getModel() + " is face-timing with email " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(getModel() + " is face-timing with email " + email);
    }

}
