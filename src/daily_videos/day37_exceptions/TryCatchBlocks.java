package daily_videos.day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        /*
            This line will be printed.
            Because of exception, program will be terminated. So , line 11 will be also not printed.
            So I have to fix that exception in order to run the code
            I use try&catch in order to handle exception [works for checked & unchecked ]
         */

        System.out.println("Program started "); // will be printed !!


        try { // it's not independent. We must create the catch block after that !!
            System.out.println(9 / 0); // that gives me exception, so I place that inside try block
            System.out.println("try block"); // Arithmetic Exception
           /*
               if try block can handle this exception, try block gets executed.
               if not, catch block takes over the handling the exceptions.
               if we don't get any exceptions  in try block,
                        try block gets executed.Otherwise, catch block gets executed.
                                */
        } catch (ArithmeticException e) {
            System.out.println("Catch Block");
            // That print statements shows us which block gets executed !!
            // catch block can handle it, only if exception type has relationship with exception !!
        }


        System.out.println("Program ended");

        System.out.println("- - - - ");

        System.out.println("Program2 started ");


        String str = null;

        try {
            System.out.println(str.toLowerCase()); // unchecked exception
            System.out.println("try block");
        } catch (RuntimeException e) {
            // (Throwable e)[parent class of Exception] ->( Exception e ) [parent class of RunTimeException]
            // -> RunTimeException e ... works as well !!
            System.out.println("catch block");
        }

        System.out.println("Program2 ended ");


        System.out.println("- - - - ");

        System.out.println("Program3 started ");

        /*
        Checked Exception:
        If you know exact exception, you have to use the exact obj of that exception in catch !!

        So you can't handle checked exception with parent class of that exception !!
        That's only possible for unchecked/ unknown exception !!
         */

        try {
            Thread.sleep(3000); // checked (compile time) exception
            System.out.println("Try Block");
        } catch (InterruptedException e) {
            System.out.println("Catch Block");
        }
        System.out.println("Program3 ended ");

        System.out.println("- - - - ");


        System.out.println("Program4 started ");
        // Checked Exceptions any idea has shortcuts. But for unchecked there is no !!



        System.out.println("Program4 ended ");

        try {
            System.out.println("Sleeping...");
            Thread.sleep(100);
            System.out.println("Done sleeping, no interrupt.");
        } catch (InterruptedException e) {
            System.out.println("I was interrupted!");
            e.printStackTrace();
        }

    }
}
