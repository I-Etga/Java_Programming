package daily_videos.day38_exceptions;

public class BreakTimeException extends RuntimeException {

    /*
                        In order to print message:
     #1 call constructor of parent exception class-super()- IN the custom class default constructor and
                       pass the message in super("it;s break time")

     #2 make a constructor with String parameters(String message) in Custom exception and
                   call parent class constructor-super(message) and pass the argument in.
        */
    public BreakTimeException() {
        super("It's break time");// parent class RuntimeException constructor
    }

    public BreakTimeException(String message) {
        super(message);// parent class RuntimeException constructor
    }


}
