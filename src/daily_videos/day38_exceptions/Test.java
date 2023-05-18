package daily_videos.day38_exceptions;

import utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello Cydeo");

        // Thread.sleep(3500);
        Library.sleep(3.5);

        System.out.println("How are you today?");

        System.out.println("-----------------------------");

        if (LocalTime.now().equals(LocalTime.of(4, 0))) {
            throw new BreakTimeException();
        }

        //  throw new RuntimeException("Something went wrong");

        throw new BreakTimeException("Time to go home");
        /*
       In order to print message: [take a look at BreakTimeException Class to see details !!]
      #1 call constructor of parent exception class-super()- IN the custom class default constructor and
                        pass the message in super("it;s break time")

      #2 make a constructor with String parameters(String message) in Custom exception and
                    call parent class constructor-super(message) and pass the argument in.
         */

        //   throw new BreakTimeException();


    }
}
