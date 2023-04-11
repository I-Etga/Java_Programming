package tests.staticImport;

//import daily_videos.day27_accessModifiers.staticContinue.Data;

import static daily_videos.day27_accessModifiers.staticContinue.Data.d; // imports only static method d
import static daily_videos.day27_accessModifiers.staticContinue.Data.method3; // imports only static method d
import static daily_videos.day27_accessModifiers.staticContinue.Data.method4; // imports only static method d
//import static daily_videos.day27_accessModifiers.staticContinue.Data.*; // imports all statics in the class

public class Test2 {

    public static void main(String[] args) {

        //System.out.println(Data.d);

        // if I import only statics, I don't need to call them through class name to use .

        System.out.println(d);
        method3();
        method4();

   /*       Static methods imports only static variables and methods. So we can't access that without regular import !!
        System.out.println(a);// instance variable a
        System.out.println(b); // instance variable b
        System.out.println(c); // instance variable c

        method1();
        method2();*/
    }
}
