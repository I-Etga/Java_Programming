package daily_videos.day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor() { // gets executed separately for each object.
        System.out.println("Constructor");
    }

    // instance and static block DON'T TAKE any arguments.
    {
        System.out.println("Instance Block"); // gets executed separately for each object.
    }

    static {
        System.out.println("Static Block"); // gets executed only once.
    }

    public static void main(String[] args) {

        System.out.println("Main Method"); // first static block gets executed !

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

        System.out.println("Main Method"); // first static block gets executed !

        /*
        output: the EXECUTION FLOW:
        Static Block -> #1 static block [regardless of main, static block get executed FIRST and only ONCE]

        Main Method -> #2 main method [basic java execution flow-top to bottom and left to right]

        Instance Block -> #3 instance block [3&4 comes with Constructor(create obj.)- first instance block then constructor]
        Constructor -> #4 Constructor

        Instance Block -> #5 Instance Block [5&6 comes with Constructor(create obj.)- first instance block then constructor]
        Constructor ->  #6 Constructor

        Main method -> #5 main method [basic java execution flow-top to bottom and left to right]
         */
    }
}
