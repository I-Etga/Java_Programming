package daily_videos.day27_accessModifiers.tasks.iPhone;

public class TestIPhoneObjects {
    public static void main(String[] args) {
        Iphone iphone12ProMax = new Iphone("12 Pro Max",6.68,"White",1250);

        iphone12ProMax.color = "green"; // instances through obj name

        Iphone.madeIn = "Turkey"; // statics through class name

        iphone12ProMax.call(653456789);
        iphone12ProMax.text(653456789);
        iphone12ProMax.faceTime(34356744);
        iphone12ProMax.faceTime("IA@icloud.com");
    }
}
