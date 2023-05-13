package daily_videos.day38_exceptions;

import utilities.Library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException {

        // Caller of the method will be responsible for handling the exception
        // checked exception: #1 try&catch #2 throws[only checked !!]
        // unchecked exceptionev: #1 try/catch

        //method1();
        Library.sleep(3.5);

        //   method2();


    }


    public static void pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(5000);
        // IntelliJ suggests two options: #1 throws #2 try/catch

    }


    public static void method1() throws InterruptedException {

        /*  throws keyword does not fix exception.
            So If I call the methods again , I have to handle it again !!
        */

        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }


    public static void method2() throws InterruptedException, FileNotFoundException {

        // advantages of throws: code readable/short/fast
        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream(" ");


        Thread.sleep(5000);


    }


}
