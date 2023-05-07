package daily_videos.day36_referenceType_casting;

import daily_videos.day17_customClass.practice.practice.Car;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false [it's about the memory !!]

        System.out.println(circle1.equals(circle2)); // true

        System.out.println(circle1.equals(circle3));  // false


        System.out.println("----------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", "White", 900);


        System.out.println(iphone1.equals(iphone2)); // true

        //System.out.println(iphone1.equals(circle3)); // Invalid object, Object must be Iphone

        Car car = new Car();
        System.out.println(car.equals(iphone1));// I can use it, but I can't implement my condition without overriding!

        /*
        Original equals method from Object Class:
        [There is no specific condition.]

        public boolean equals(Object obj) {
        return super.equals(obj);
    }
        If I create custom Class, I have to override the equals method in order to give conditions

        Examples of conditions: given obj is from the same Class ?/ same color ? same radius ? ...
        If I don't override it, default implementation of equals methods will get executed.

        " instanceof " keyword helps us to check if the given/passed obj is from the same Class.

         */

    }
}
