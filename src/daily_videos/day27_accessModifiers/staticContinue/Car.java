package daily_videos.day27_accessModifiers.staticContinue;

public class Car { // outer class CAN NOT BE STATIC
    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine { // inner class (It can be created only if object is created !!Without car object, there is no carEngine object as well)

        public void method() {
            System.out.println(make);
            System.out.println(wheels);
        }

    }
        // Static class  can exist, if there is a nested class ! That means , in java ONLY INNER CLASS CAN BE STATIC CLASS !
    public static class StaticInnerClass { // in order to use anything of this class , we can call that class through name of outer class
        public void method(){
            //System.out.println(make); --> we get error.Because we can't use instance variable inside static class,method,block.
            System.out.println(wheels);
        }
    }

}
