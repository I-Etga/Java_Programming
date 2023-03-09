package daily_videos.day13_CustomMethodsContinue;

import java.util.Scanner;

public class ReturnStatementPractice2 {
    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();

        if (number < 1 || number > 7) {
            System.out.println("Invalid number:" + number);
            return; // terminate(exits) the main method
        }
        /*
                ## USING RETURN INSTEAD OF NESTED IF STATEMENT !!
               # code runs how we want
               Because if number is inside of range of the if condition;
                    print "invalid" and -return- exits the main method. So the last part of
                    code won't get executed.
                                    (number>=1 || number<=7)
                    BUT if the number is out of range of the if condition,
                    if block will NOT GET EXECUTED so java skip the next line after if.

         */
        System.out.println((number == 1) ? "Monday" : (number == 2) ? "Tuesday" :
                (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" :
                        (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday");
    }


}
