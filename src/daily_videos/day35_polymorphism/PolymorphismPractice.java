package daily_videos.day35_polymorphism;

import daily_videos.day34_abstraction_interface.animalTask.*;
import daily_videos.day35_polymorphism.transportationTask.*;

public class PolymorphismPractice {


    public static void main(String[] args) {

        Tiger tiger1 = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");
        // reference type tiger and obj type tiger. It's not polymorphism.
        // I can call all methods Tiger class has.
        tiger1.eat();
        tiger1.drink();
        tiger1.sleep();
        tiger1.hunt();


        Animal tiger = new Tiger("Sher Khan", "Bengal", 'M', 5, "Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        //  tiger.hunt();
       /*   Reference type Class (Animal) does not have hunt method .
            But, one of the subclass of Animal Class Tiger has that hunt method.
            However, it comes to the polymorphism, we can call only the methods reference type class has.
            That's why when we call hunt method, we get compiler error.
            Another thing is, if obj type Class override any methods of reference type class, overridden version of that method is called.

            Summary:
            #1 Methods comes from reference type Class [Animal].
            #2 However, if there is override/implementation, then overridden methods come from object Class, not regular version.
                    */

        System.out.println("------");

        Eagle animal1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        animal1.fly(); // this is not polymorphism. So I can call fly method. Eagle has fly method!
        animal1.eat();
        animal1.sleep();
        animal1.drink();


        Animal animal = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        // animal.fly(); -> reference type class has no fly method. So I can NOT call it !!
        animal.eat();
        animal.sleep();
        animal.drink();


        Flyable obj1 = new Eagle("John", "American Eagle", 'M', 3, "Small", "Black & White");
        /*   There is an inheritance relationship between Flyable and Eagle.
             So it's polymorphism.

             I can't call that eat,drink,sleep methods. Because reference type Flyable doesn't have those methods.
        // obj1.eat();
        // obj1.drink();
        // obj1.sleep();
                                */

        obj1.fly(); // I can call it because reference type has it !!
        System.out.println(obj1.canFly);

        System.out.println("-------");

        Lion lion = null;

        Parrot parrot = null;

        Shark shark = null;

        Dolphin dolphin = null;

        Eagle eagle = null;

        Duck duck = null;

        Dog dog = null;

        Cat cat = null;

        CydeoCar cydeoCar = null;

        //reference type  --> object type must have relationship in order not to get error!!
        Flyable[] birds = {parrot, eagle, duck};

        Swimmable[] fishes = {dolphin, shark, duck, cydeoCar};

        Playable[] friendlyAnimals = {dog, cat, duck};

        // instanceof keyword checks if the object is certain class [returns boolean]!!
        boolean isAnimal = dog instanceof Animal;

        //boolean isAnimal1 = cydeoCar instanceof Animal; -> If not, it gives compiler error.

        System.out.println(isAnimal);

        System.out.println("------------------------------------------------");

        Car car = new Tesla("Model Y", "White", 2020, 55000);

        // There must be relationship right and left side of instanceof keyword.
        // In that case relationship means EXTENDS and/or IMPLEMENTS keyword.!!

        boolean isTesla = car instanceof Tesla;
        boolean isAudi = car instanceof Audi;

        boolean isElectricCar = car instanceof Electric;
        boolean hasAutoPark = car instanceof AutoPark;
        boolean hasAutoPilot = car instanceof AutoPilot;


        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectricCar = " + isElectricCar);
        System.out.println("hasAutoPark = " + hasAutoPark);
        System.out.println("hasAutoPilot = " + hasAutoPilot);

        System.out.println("------------------------------------------------");
    }
}
