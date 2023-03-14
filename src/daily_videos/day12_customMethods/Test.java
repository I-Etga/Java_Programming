package daily_videos.day12_customMethods;

public class Test {
    public static void main(String[] args) {

        int number = 300;

        /*
                       # Attention !!
               -Here we're seeing the access a method created in another class.
               -We've actually seen that while using java class like String/Scanner.
               -That's the same principle.

               ClassName.methodName()
         */

        CustomMethodWithParameters.oddOrEven(number);

    }
}
