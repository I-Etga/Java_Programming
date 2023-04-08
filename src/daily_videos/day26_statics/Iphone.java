package daily_videos.day26_statics;

public class Iphone {

    public static String brand = "Apple"; // static: Because apple is the brand of all iphone objects.

    public String model; // we initialize in Constructor. instance: model of iphone objects are different.

    public  String color;

    public double price ;

    public static String OS = "iOS";

    public static String madeIn = "China";

    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean isExprensiveToFix = true;

  /*  public static void printPhoneInfo(){

                  STATIC METHOD ONLY ACCEPTS STATIC VARIABLES !! NOT INSTANCES
                 BUT INSTANCES METHODS ACCEPT STATIC VARIABLES.
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);

    }*/

    public void printPhoneInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void printOperationSystem(){
        System.out.println("Operating System: " + OS);
    }
}
