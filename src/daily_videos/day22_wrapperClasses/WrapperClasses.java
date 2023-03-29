package daily_videos.day22_wrapperClasses;


import daily_videos.day03_variables.Char;

public class WrapperClasses {
    public static void main(String[] args) {
        String str = "Java";

        int a = 10;

        int a1 = 10;
        Integer a2 = 10; // wrapper class integer

        System.out.println("---------------");

        int b1 = 100;

        double c1 = b1; // convert implicitly
        long c2 = b1; // convert implicitly

        Integer b2 = b1; // auto-boxing (make sure you choose the right class !! Double Integer Long ...)

      /*  Long b3 = (long)b1; // you can only assign long primitive values
       -we can use casting but that would be a bad practice.
       -What would I use it ? I've already dedicated wrapper class for long !

        Double b4 = b1; // // you can only assign double primitive values */

        char ch = 'A';

        Character ch2 = ch; // Autoboxing

        double d1 = 5.5;

        Double d2 = d1;// Autoboxing (converts the primitive into wrapper class object !!)

        System.out.println("----------");

        Integer n1 = 20;

        int n2 =n1;
        long n3 = n1; // bad practice
        double n4 = n1; // bad practice
        /*
        We get no error,but it's always better to use own primitive by unboxing as well .
         */


        Character e1 = 'Z';

        char e2 = e1; // unboxing

        int e3 = e1; // it's not 'Z' anymore. It's a whole number (ascii)
        long e4 = e1; // it's not 'Z' anymore. It's a  number (ascii)

    }
}
