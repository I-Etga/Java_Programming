package daily_videos.day34_abstraction_interface.animalTask;

public interface Playable {
    /*              ##   Rules about VARIABLES in interfaces ##
    In Java, one class can extend only one super class. Interface helps us about it !!

    #1 Every single variable must be STATIC and FINAL !!
    #2 No Constructor in interface !!

    #3 We don't have to use FINAL and STATIC keyword in interface.
    Access Modifier is PUBLIC by default. No need to write that as well !!

   That's why even if we defined variable PUBLIC STATIC FINAL , that keyword will be colored gray which means that keywords are optional/not necessary.
     */

    boolean isFriendly = true; // static & final [given automatically-implicitly] We can't have any other kind of variables.

/*                   ##   Rules about METHODS in interfaces ##
    #1 STATIC methods and DEFAULT methods are totally optional. You have it or not.It depends on the scenario.

    public static void main(String[] args) { // #1# Static Method
        // isFriendly = false ; it's final, so we can't change it. We get compiler error.
        System.out.println(isFriendly); // If isFriendly is not static, we couldn't use it in main method.
    }
        -----
    #2 Static methods  can be  PUBLIC or PRIVATE  !!
     #2.1 However, non-static methods , MUST be PUBLIC
        -----
    #3 In interface we are not allowed to create instances method !!
        [default static method acts like instances method ] So default static methods are allowed !!

        we can also create default methods !
    default void method(){// #2# Default Method-->It transforms instance method in subclass.
    So if you need an instances method in subclass, use it !!
        -----
    #4 Unlike Class, in interface we don't have to define the methods as public and abstract.
    They are public & abstract by default, if I define as static or default method.
    }*/

    void play(); // #3#  abstract method


    /*  SUMMARY:

        I create a variable: "boolean isFriendly = true";
        it's a public & static & final variable by default. I don't have to use that three keyword.
        Even if I write these keywords, they will turn to gray. Because not necessary.
        It's only allowed variable type by the way !!



        And I create a method:  "void play(); "
        it's a public & abstract method by default. I don't have to use that two keyword.
        Even if I write these keywords, they will turn to gray. Because not necessary.

        Addition to abstract method , we can create static and default methods.
        Static method can be public or private but others MUST be public.

        Default method acts like instances method in subclass. It must be public and it's public by default. So we don't have to write public.
     */

}
