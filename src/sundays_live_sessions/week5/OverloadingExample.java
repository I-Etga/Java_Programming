package sundays_live_sessions.week5;

public class OverloadingExample {


    public static int add(int a, int b){
        return a + b;
    }

    // this is valid
    public static double add(double a, double b){
        return a + b;
    }

    // this is invalid
//    public static float add(int c, int d){
//
//    }

    public static float add(String s){
        return 0.0f;
    }

    // other idea

//    public static String m(int a){
//
//    }
//
//    public static char m2(float f){
//
//    }

}
