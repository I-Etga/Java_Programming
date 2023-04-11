package daily_videos.day27_accessModifiers.staticContinue;

public class TestNestedClassObjects {
    public static void main(String[] args) {


        Car obj1 = new Car(); // car object

        obj1.new CarEngine(); // I can create an inner class object only THROUGH outer class name !

        Car.CarEngine obj2 = obj1.new CarEngine(); // this is how we create an inner class object.

        Car.StaticInnerClass obj3 = new Car.StaticInnerClass(); // this is how we create an static class object.
    }
}
