package tests;

import daily_videos.day31_InheritanceContinue.ProtectedAccessModifier;

public class TestAccessModifier  extends ProtectedAccessModifier{

    public static void main(String[] args) {

        // We can't access protected variables and methods in different directory.

        // But if we extend the class where the protected variables and methods come from, we can access !!
        // Because as we talked about before, protecteds can be reachable in different packet,only if it's subclasses of it !!

        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();
    }
}
