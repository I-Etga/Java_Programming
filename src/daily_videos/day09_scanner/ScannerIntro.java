package daily_videos.day09_scanner;

import java.util.Scanner;
//import java.util.*;

/*
        both of them(.scanner & .*) import Scanner !!
        But why would I import the all java packages that I do not need at all . That does not make any sense.
        And also if I've imported scanner or any other java package and never use it, compiler warns me about it.

        // IDEs import Scanner java package automatically. Just type inside of main method Scanner and press enter.

 */

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         If we type new Scanner() and leave the inside of parenthesis empty we get compiler error.
        Because Scanner can read not only file but also users input(keyboard input)
         we have to specify our purpose or which function of Scanner we want to use !
         */
        System.out.print("Say something: ");// DO NOT FORGET THE PRINT METHOD BEFORE ASKING INPUT FROM USERS!
        String resullt = scanner.nextLine();
        /*
        .next() -- only reads UNTIL the first SPACE
        nextLine() -- reads the entire line. DOES NOT READ THE NEXT LINE
        It does not matter how long the line is, nextLine() reads the entire line but NOT NEXT LINES(BELOW)
         */
        System.out.println(resullt);

        System.out.print("Enter a number: ");
        byte b1 = scanner.nextByte(); // DO NOT FORGET THE PRINT METHOD BEFORE ASKING INPUT FROM USERS!
        //If we don't enter a value in data type expected from us WE GET ERROR !!
        System.out.println(b1);

        scanner.nextInt();
        /*
        in that way , we can get an input from user but we cant use that value.
            Because we haven't declared a variable before and that's why we cant assign to a variable.

         */

        //If we don't enter a value in data type expected from us WE GET ERROR !!

        System.out.println("Please enter another number: ");
        short s2 = scanner.nextShort();
        System.out.println(s2);
        /*
         as far as I   remember ,the range of the short is between -32k and +32k
         So if I enter a number out of the range of short(for example 33k), compiler gives an error. (code1)
         */


        int i4 = (int) scanner.nextLong();
        // if we insist on using nextLong , WE HAVE TO USE CASTING !!


        scanner.close();
      /*
                         disconnect scanner
               AFTER CLOSE SCANNER WE CAN' T USE IT.
               If you want to use scanner again, you must declare a scanner object
                                                Scanner input = new Scanner (System.in)
               **That's why we should close the scanner after the last line we have used it. **

               what if I don't close it ? it will be stay connected to your keyboard and takes up memory space.
                        That's why we should close it, when we are done with it or at the very end.
       */

        /*
        IF WE DO NOT INPUT A VALUE, THE PROGRAM WAITS UNTIL WE TYPE SOMETHING AND DOES NOT END AUTOMATICALLY.
         WE MUST EITHER ENTER A VALUE OR END THE PROGRAM MANUALLY.
         */

        // UNLESS THE PROCESS FINISHED WITH EXIT CODE 0, THAT MEANS THERE IS A PROBLEM.
    }


}
