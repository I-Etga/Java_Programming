package tests.other;

import daily_videos.day27_accessModifiers.AccessModifier;
// in order to access data , we have import package and modifier type should allow us !

public class TestVisibilityOutsidePacked {

    public static void main(String[] args) {
        System.out.println(AccessModifier.publicData); // #1 public is always accessible in different packages.

        // #2 System.out.println(AccessModifier.protectedData); //protected is NOT ALWAYS accessible in different packages.
        //                      It could be accessible only if we create subclass.


        // #3System.out.println(AccessModifier.defaultData); -->default is never accessible in different packages.

        // #4 System.out.println(AccessModifier.privateData); // private is never accesible in different packages.

        new AccessModifier();

        AccessModifier.publicMethod(); // ONLY PUBLIC is accessible in different package.
        //AccessModifier.protectedMethod(); // protected method is not accessible in different packages.
        //AccessModifier.defaultMethod();// default method is not accessible in different packages.
        //AccessModifier.privateMethod(); // only private is not accessible in the same package.

    }

}
