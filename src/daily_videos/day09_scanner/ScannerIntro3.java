package daily_videos.day09_scanner;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ScannerIntro3 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        /*
        I've realised that if I use nextLine() method AFTER next() , there is something wrong
                I don't know why but in this case nextLine() does NOT WORK.
        But if I use nextLine() before next() , it works properly !!

         */

        System.out.println("Whatever you type in this line , I'll show you: ");
        String answerEntireLine;
        answerEntireLine = scanner.nextLine();
        System.out.println(answerEntireLine);

        /*
                That's not necessary to use timeout method and We haven't learnt yet but
                            I wanted to use it.
                                Thanks to sleep function our program works more realistic !

         */
        TimeUnit.MILLISECONDS.sleep(500);


        System.out.print("Would you like to continue?: ");
        String answerWordUntilSpace = scanner.next();
        System.out.println("You have entered: " + answerWordUntilSpace);

        /*
         We have already talked about it.
                next() reads the input only until the first space
         but nextLine() reads the entire line.
         */

        TimeUnit.MILLISECONDS.sleep(500);

        System.out.println("*** Get input as char****");

        System.out.print("Please enter a characters: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You have entered: " + ch);


        /* Even if I type a whole word or sentences; I'll get the first character as an input
         */


        scanner.close();

    }
}
