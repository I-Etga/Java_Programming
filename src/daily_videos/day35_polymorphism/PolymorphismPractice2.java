package daily_videos.day35_polymorphism;

import daily_videos.day29_inheritance.animalTask.*;
import daily_videos.day30_inheritanceContinue.phoneTask.*;
import daily_videos.day33_abstraction.employeeTask.*;

public class PolymorphismPractice2 {
    public static void main(String[] args) {
        //I declare and initialize here an Array.
        Employee[] employees = {
                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
        };


        // 1. Print the name and Job Title of every employee
        for (Employee each : employees) {
            System.out.println(each.getName() + " : " + each.getJobTitle());
        }

        System.out.println("-----------------------------------------------------");

        int countDeveloper = 0,
                countTester = 0,
                countDriver = 0,
                countTeacher = 0;

        for (Employee each : employees) {

            if (each instanceof Developer) { // if the employee is Developer
                countDeveloper++;
            } else if (each instanceof Tester) { // if the employee is Tester
                countTester++;
            } else if (each instanceof Teacher) { // if the employee is Teacher
                countTeacher++;
            } else {
                countDriver++;
            }

        }

        System.out.println("countDeveloper = " + countDeveloper);
        System.out.println("countTester = " + countTester);
        System.out.println("countDriver = " + countDriver);
        System.out.println("countTeacher = " + countTeacher);

        System.out.println("--------------------------------------------------------");

        for (Employee each : employees) {
            if (!(each instanceof Developer)) {
                System.out.println(each.getName());
            }
        }


        Animal animal = new Animal();//not polymorphism
        // There must be IS A inheritance relationship !!
        //# reference type        # obj type
        Animal cat = new Cat();//polymorphism

        Cat cat1 = new Cat(); // not polymorphism


        // upcasting [parent->sub] (implicitly)
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        animal.setName("Any"); // not polymorphism
        animal.eat();
        animal.drink();
        animal.sleep();

        System.out.println("******");

        cat.setName("Pamuk");//polymorphism--> We can access methods and variables of Animal Class BUT with Cat Class implementation !!
        // No uniques of Cat class because of polymorphism
        cat.eat();
        cat.drink();
        cat.sleep();

        System.out.println("******");

        cat1.setName("Duman");
        cat1.eat();
        cat1.drink();
        cat1.sleep();
        cat1.scratch();
        cat1.meow();

        // #downcasting [sub->parent] (explicitly)

        // Animal dog = new Dog();
        Dog dog1 = (Dog) new Animal();
        dog1.bark();


        /* primitive casting

        long a = 567842490;
         int b = (int) a;

         int c = 45;
         long d = c;

         */

        Phone phone = new Nokia("XR20", "Small", "Blue", 350);

        ((Nokia) phone).selfDefence(); // I can call it through downcasting.

        ((IPhone) phone).faceTime(911); // ClassCastException

        // the obj type of dog object is Dog Class.
        // Both of them are subclasses of Animal Class.
        // However, there is no IS A inheritance relationship between dog and cat.

        // ((Cat) dog).eat(); // unchecked -runtime exception


    }

}
