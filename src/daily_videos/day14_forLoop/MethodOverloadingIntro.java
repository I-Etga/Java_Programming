package daily_videos.day14_forLoop;

public class MethodOverloadingIntro {
    public static void main(String[] args) {

    }

    /*
                We can create more than once method with the same name.
                    So we have to memorize only one name of method.
                      In these two cases, overloading method works.
                            1- THE NUMBER OF
                                        OR          PARAMETERS MUST BE DIFFERENT
                            2- THE DATA TYPES

                NOTE: It does not matter void or return method.
                       So, we can create a void and return method with the same name!
                                        line 30-33 & line 47-50

     */


    // multiple void methods with method overloading
    public static void methodA() {

    }
    public static void methodA(int a) {

    }
    public static void methodA(double b) {

    }
    public static double methodA(double b, double a) {
        return b + a;
    }
    public static void methodA(int a, int b) {

    }

    // multiple return methods with method overloading
    public static int sum(int a) {
        return a;
    }
    public static int sum(int a, int b) {
        return (a + b);
    }
    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }
    public static void sum(double d, double d1) {
        System.out.println(d + d1);
    }

}
