package daily_videos.day27_accessModifiers.staticContinue;

public class StaticInitializationBlock {

    public static int a; // we can even now initialize that variable. int a =100;
    public static double b;
    public static String c;

    //public static ExcelSheet sheet;
    static {
        a = 100;
        b = 20.5;         // the best choose the initialize statics is STATIC BLOCK ! it always starts with static block to run.
        c = "Java";

    }

/*    public StaticInitializationBlock() { // constructor only get executed when we create an object.
        // We should do that every single time. So we shouldn't use Constructor to initialize statics.
        a = 100;
        b = 20.5;
        c = "Java";*/

    /*public static void main(String[] args) { // main method does not get executed in other class !!
        a= 100;
        b=20.5;
        c ="Java";
    */
}
