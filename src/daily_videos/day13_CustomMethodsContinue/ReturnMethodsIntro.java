package daily_videos.day13_CustomMethodsContinue;

public class ReturnMethodsIntro {
    public static void main(String[] args) {
        /*
            AS you can see, we can nOT use void method
            as a returning value !!
        void method does not return any data.
             |||||||||||||||||||||||||||||
       int total =  sum(20,40);-> ILLEGAL
       System.out.println(sum(20,30)); -> ILLEGAL

                   NOT REusable !!

         */


        /*
        I have store the data in a variable or use that way !!
                I doesn't print like void method !!
         */
        addition(10, 23);

        int total = addition(10, 2);
        System.out.println(total);

        System.out.println(addition(89, 11));


        int r = cube(5);
        System.out.println(r);
        ;

    }

    public static void sum(int n1, int n2) {
        int result = n1 + n2;

    }

    public static int addition(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }


    public static int square(int number) {
        int square = number * number;
        return square;
    }

    public static int cube(int number) {
        /*
         -We can use the return methods in another method as a variable !!
         -Also method name and variable name can be the same.
        - int cube = number * number* number; */
        int cube = square(number) * number;
        return cube;

        /*
         We can use the return methods in another method as a variable !!
         -Also method name and variable name can be the same.
         */

    }
}
