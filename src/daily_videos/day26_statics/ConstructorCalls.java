package daily_videos.day26_statics;

public class ConstructorCalls {

    public ConstructorCalls() {
        System.out.println("Default constructor");
    }

    /*
    #1- You can't call the Constructor by its name. Instead, we have to use this()
    #2 - Other methods are not able to call Constructor !! ONLY Constructor can call !!
    #3 - this() must be at the first step in the Constructor's body.
    #4 - One Constructor can call more than one Constructor !! There is a limit.
    #5 - Constructor can NOT call and contain ITSELF. [methods can call itself !!]
     */
    public ConstructorCalls(int a) {
        //ConstructorCalls();
        this();
        System.out.println("Constructor with int argument");
        // this() -> at the first step !!
    }
    public ConstructorCalls(double b){

        System.out.println("Constructor with double argument");

    }
    public ConstructorCalls(String c){
        this(2.5);
        //this();
        System.out.println("Constructor with String argument");

    }


    public static void main(String[] args) {
        method1(); // print only method1

        System.out.println("*****");

        method2(); // prints method1 and method2

    }

    public static void method1() {
        System.out.println("Method 1");
    }

    public static void method2() {
        method1();
        System.out.println("Method 2");
    }


}
