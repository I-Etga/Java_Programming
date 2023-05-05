package daily_videos.day35_polymorphism;

import daily_videos.day31_inheritanceContinue.shape_methodOverriding.Circle;
import daily_videos.day32_finalKeyword.carTaskOverriding.*;
import daily_videos.day33_abstraction.employeeTask.*;
import daily_videos.day34_abstraction_interface.animalTask.*;

public class PolymorphismIntro {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");

        Cat cat = new Cat("Felly", "British Short Hair", 'M', 2, "Small", "Gray");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Dolphin dolphin = null;

        Shark shark = null;

        Duck duck = null;

       /* Dog[] animals = {dog, cat,tiger, lion, eagle ,parrot, dolphin, shark, duck};
            Array only accepts dog object, it does not accept the rest of objects.
            Because there is no inheritance relationship Dog class and other Classes objects
            In other word, Dog Class can not reference those animal objects.

        Cat[] animals = {dog, cat,tiger, lion,eagle ,parrot, dolphin, shark, duck}; // accepts only cat

        Lion[] animals = {dog, cat, tiger, lion, eagle ,parrot, dolphin, shark, duck};// accepts only lion object

        Flyable[] animals = {dog, cat, tiger, lion ,eagle ,parrot, dolphin, shark, duck}; // accepts only eagle,parrot object

        WildAnimal[] animals = {dog, cat, tiger, lion, eagle ,parrot, dolphin, shark, duck};// accepts only tiger,lion,eagle,shark object

        So that's the benefit of polymorphism. Parent Class can reference different types of objects.

        Animal animal = eagle;

         Animal animal = new Tesla ("Model Y", "Blue", 2022, 60000);
           there is no relationship between Animal and Tesla
*/

        Animal animal = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        animal.eat();
        animal.sleep();


        // animal.play();
        // animal.bark();

        System.out.println("-------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Accord", "Gray", 2019, 24000);

        Audi audi = new Audi("Q6", "Silver", 2021, 50000);

        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);

        Teacher teacher = new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);

        Developer developer = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);

        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);


        Object[] objects = {str, n, r, d, honda, audi, tesla, teacher, developer, driver, tester};
       /*   Object Class is the parent class of all classes in Java.
            So I can pass any object inside that curly braces.
            Because object class can reference to all kind of objects.
            That's also an example of POLYMORPHISM.
                        */

        Employee[] employees = {teacher, developer, driver, tester};


        Object obj1 = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
        //Reference type decides which class is called.
        // I don't have any specific methods.

        Employee obj = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");
        //Reference type decides which class is called.
        // Now I have all methods Employee Class but  with the implementation of calling obj Developer.

        obj.work();//Lucy is coding inJava

        Employee obj2 = new Teacher("Katy", 30, 'F', "C1", "Java Developer", 95000);
        obj2.work(); //Katy is teaching

        Employee obj3 = new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000);
        obj3.work();

        Tesla car1 = new Tesla("Model 3", "White", 2022, 65000);
        // Tesla references to its own object. So it's not polymorphism.
        // reference type-> tesla , object type is also -> Tesla

        tesla.start();
        tesla.autoPilot();

        // What if I change the reference type Car?

        Car car2 = new Tesla("Model 3", "White", 2022, 65000);
        car2.start();
        //car2.autoPilot();-> If I check the Car class , it does not have autoPilot method. So I can't call it.

    }
}
