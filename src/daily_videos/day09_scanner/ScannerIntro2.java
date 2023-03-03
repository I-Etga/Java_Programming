package daily_videos.day09_scanner;

import java.util.Scanner;

public class ScannerIntro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
                THIS IS REALLY IMPORTANT
                    NORMALLY COMMA IS NOT ALLOWED FOR THE DECIMAL NUMBERS IN JAVA.!! WE MUST USE PERIOD NOT COMMA.!!
                        BUT IF WE ENTER A DECIMAL NUMBER AS AN INPUT,!! WE MUST USE COMMA NOT PERIOD!!.
         */

        System.out.print("Please enter first decimal number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Please enter your second decimal number: ");
        double num2 = scanner.nextDouble();

        /*
        If I enter a int valua, it will be implicitly cast and print decimal .
                ex: input =>10 -- result 10.0
         */

        System.out.print("Enter true or false: ");
        boolean r = scanner.nextBoolean();
        /*
        If user enters anything but true/false , compiler gives error.
         */


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("r = " + r);

        scanner.close();
    }
}
