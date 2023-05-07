package daily_videos.day36_referenceType_casting;

import daily_videos.day29_inheritance.animalTask.*;
import daily_videos.day29_inheritance.tasks.vocationsTask.Tester;
import daily_videos.day30_inheritanceContinue.phoneTask.*;
import daily_videos.day33_abstraction.employeeTask.*;
import daily_videos.day34_abstraction_interface.carTask.*;

public class RefereneceTypeCasting {

    public static void main(String[] args) {
        // Dog dog = new Dog();

        //Cat cat =new Dog(); // we can't assign different reference types to each other.

        //                  # UPCASTING
        Animal animal = new Dog(); // implicit casting ->(Animal)new Dog();
        //Car car = (Car) new Honda(); Another example of upcasting
    /*
        Reference type seem different.
        Why I don't get any compiler here in line 15 ?
            Because that's polymorphism. Animal is the parent/super class of Dog Class.
    Sub --> super upcasting. It's done implicitly. So I don't have to use cast operator ()
     */

        System.out.println("------------");
        //                  # DOWNCASTING

    /*
            Where we need downcasting ?
            If you have certain variables and methods in the object type,
                    without changing reference type we can't call them.
            As long as reference type is parent class ,
                    we can call only variables and methods which are specified in parent class.
     */
        //reference type & object type
        Animal animal1 = new Dog(); // upcasting ==> polymorphism

        // I can call all the methods and variables specified in Animal class !!
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");
        animal1.eat();
        animal1.drink();
        animal1.sleep();
/*
            But what if I try to call a method exist only Dog class?
            For example bark() method -> It's a unique method of Dog class
                    */

        //animal1.bark();
        // As long as the reference type is animal, I can't call it bark() method.
        // I can't. Because one of the rule of polymorphism, reference type decides what we can access!!

        // What can I do to be able to call bark method ?? --> Downcasting !!

        // #1 non-reusable downcasting (do NOT forget double parentheses before calling method of variable)
        ((Dog) animal1).bark(); // this is why we need downcasting.

        //Dog dog1 = animal1; //  I can't animal1 assign directly to dog1.
        //Because reference type of dog1 is Dog and reference type of animal1 is Animal.

        // #2 reusable downcasting
        Dog dog1 = (Dog) animal1; // I didn't create a new dog object.I still use the same object (animal1).
        dog1.bark();
        System.out.println(dog1.getName()); // That will still print me "Max" !! name of animal1 object--line37

        /*
            Be careful. Downcasting is done explicitly. So have to check the relationship by ourselves.
            If there is no inheritance relationship, we get classCastingException
                    */

        //animal1.scratch; // I can't call it. Animal Class does not have that method.

        // reference type is cast to Cat. So I can call Cat unique method scratch !!
        //((Cat)animal1).scratch();
        /*
           We get ClassCastException
            !! animal1 is assigned to Dog object !!
           Dog Class has no relationship with Cat.
           So Dog can not be cast to Cat. [Dog can NOT be converted to Cat]

         */

        System.out.println("--------");

        Phone phone = new Nokia("XR20", "Small", "Blue", 350);

        phone.call(911);
        phone.text(23456);
        //phone.selfDefence(); ->unique method of Nokia Class(obj type)
        // I can't call it. Because reference type decides what we can access.

        ((Nokia) phone).selfDefence(); // I can call it through downcasting.

        // ((IPhone) phone).faceTime(911);
        /*
        As you can see, I don't get any error.
        I can call Iphone unique method .facetime() through downcasting IMPLICITLY.

        However, I have to make sure MYSELF , if there is a relationship between them.
        Otherwise, I might get " ClassCastException "

        In summary,
        intelliJ will not automatically warn us if there is no relationship.

        So, in the example phone obj. is casting to Iphone.
        But phone is #1 declared -line 85-/ #2 assigned to -line 64- < reference to > an obj from Nokia class.
        There is no relationship between Nokia and Iphone. [both of them subclass of phone]
        "IS A" means sub-super relationship. So two subclass has no that kind of relationship.
        They are not inheriting each-other. No !! So no relationship
        That's why I get " ClassCastException ".
                         */

        //phone.selfDefence(); -> If we write that, intelliJ suggest directly cast version !!
        //((Nokia) phone).selfDefence();

        System.out.println("---------");

        Employee employee = new Developer("Lucy", 30, 'F', "C1", "Java Developer", 95000, "Java");

        employee.work();
  /*
        Employee[reference type] doesn't have ProgrammingLanguage variable, but Developer has[obj. type].
        Reference type decides what I can access. So I can't.
        Therefore, I have to use downcasting.
        IntelliJ suggest a shortcut to cast it[!! right click on red warning and see what it suggests !!].
        System.out.println(employee.getProgrammingLanguage);
                    */
        System.out.println(((Developer) employee).getProgrammingLanguage());

        //Tester tester = (Tester)employee;

        /*
            It gives error because, super type can't be assigned directly to subtype !!
            That's means I should cast it, before assign it.

            However, it does not work.
            employee obj. reference to Developer obj.
            ,and there is no inheritance relationship between Developer and Tester.
            I can do downcasting. It's done explicitly, and we get no warning from intellij/
            But, If we cast it one to another, we get " ClassCastException ".
                        */


    }


}
