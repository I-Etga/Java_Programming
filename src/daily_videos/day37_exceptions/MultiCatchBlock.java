package daily_videos.day37_exceptions;

import daily_videos.day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {
        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive();
        } catch (ArithmeticException e) {
            System.out.println("First Catch Block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("Second Catch Block");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Third Catch Block");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Five Catch Block");
            e.printStackTrace();
        }

 /*
        Only one of that catch block gets executed.
        The last one has to be handled in any case. So we use parent class of possible exceptions !!
        If one catch block can't catch the exception, then it jumped to the next catch !! [same principle with if ]
        The last catch is created just in case previous catches can't catch the exception

        Parent Exception can NOT be placed before child Class !!
        For example RunTimeException is parent all those four exceptions class and placed after all of them .
        If I don't follow that rule, I'll get compiler error.

        Checked Exceptions any idea has shortcuts. But for unchecked there is no !!
                        */

      /*
            that does  not work[ try blocks after catch block !!]
      try{

        }catch (){

        }try{

        }try{

        }catch(){

        }*/

        System.out.println("Program1 ended");
    }
}
