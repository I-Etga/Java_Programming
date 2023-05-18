package daily_videos.day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");

        int age = new Scanner(System.in).nextInt();


        //Using throw is better than exit method !!
        if (age < 0 || age > 150) {
            if (age < 0) {
                throw new InputMismatchException("Age of the person should not be negative: " + age);
            } else {
                throw new InputMismatchException("Age of the person can not be greater than 150: " + age);
            }
        }

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }

        System.out.println("-----------------------------------------------------------");

        // throw new RuntimeException("Runtime exception");
        // After throw block, program will be crashed. So next codes won't be accessible.[Compiler error]
        // System.out.println("Hello World");


        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------------------");

        RuntimeException exception = new RuntimeException();

        // throw exception;
        // throw new RuntimeException();

        // even it's an unchecked exception, the codes coming after that gives error.

        // throw new Person("Jimmy", 45, 'M');


        // throws and throw are totally opposite keyword.
        // throw makes exception , throws fix exception temporarily !!
    }
}
