package daily_videos.day26_statics;

public class TestIphoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("iphone12", "Black", 1000);

        System.out.println(iphone.model);
        System.out.println(iphone.color);
        System.out.println(iphone.price);

        iphone.printPhoneInfo();

        // It's legal but not the best way (calling statics through object)
        System.out.println(iphone.brand);
        System.out.println(iphone.OS);
        iphone.printOperationSystem();

        // we get instances through object(iphone) and statics through Class(Iphone)

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperationSystem();


    }
}