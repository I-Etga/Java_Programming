package daily_videos.day14_forLoop;

public class MethodOverloadingPractice {
    public static void main(String[] args) {

        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));


        System.out.println(sum(0.1, 8.9));
        System.out.println(sum(1.8, 2.6, 8.8));

        /*
                int and double together
            # what if I use sum(1, 5.9);
            second sum method which has two double parameters WILL GET EXECUTED!!
                    Because (range of ) double >int .
         */

        System.out.println(sum(1, 8.9));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {

        // compiler runs automatically the first sum Method-
        //  Because there is only two parameters !!
        return sum(num1, num2) + num3;

    }

    public static int sum(int num1, int num2, int num3, int num4) {
        // there are two sum methods (first is with int parameters and second is double two parameters.)
        // if we enter int, first one runs ; enter double second runs implicitly.
        return sum(num1, num2, num3) + num4;
    }

    /*
                If I write sum I'll see some options including ;
    sum(double num1, double num2) : double) & sum(int num1, int num2) : int)
  We do NOT have to choose. If we enter double parameters runs the second one automatically.

     */
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2, double num3) {
        return sum(num1, num2) + num3;
    }

    public static double sum(double num1, double num2, double num3, double num4) {
        return sum(num1, num2, num3) + num4;


    }
}
