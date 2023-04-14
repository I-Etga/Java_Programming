package daily_videos.day27_accessModifiers.tasks.iPhone;

public class Iphone {

    public String model;
    public double size;
    public String color;
    public double price;
    public static String brand;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn;
    public static String designedIn;

    public Iphone(String model, double size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    static {
        brand = "Apple";
        OS = "iOS";
        isSmartPhone = true;
        madeIn = "China";
        designedIn = "California";
    }

    // Just reminder ! : We can use instances&statics in instances methods. But, we can only use statics in statics method !
    public static void printOperatingSystem() {
        System.out.println(OS);
    }

    public void call(long phoneNumber) {
        System.out.println(phoneNumber + " is calling ...");
    }

    public void text(long phoneNumber) {
        System.out.println("is texting to " + phoneNumber);
    }

    public void faceTime(long phoneNumber) {
        System.out.println("is faceTiming " + phoneNumber);
    }

    public void text(String email) {
        System.out.println("is faceTiming " + email);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*




            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()

 */
