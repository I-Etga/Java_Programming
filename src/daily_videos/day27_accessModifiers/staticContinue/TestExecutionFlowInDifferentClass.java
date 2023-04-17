package daily_videos.day27_accessModifiers.staticContinue;

public class TestExecutionFlowInDifferentClass {
    public static void main(String[] args) {

        System.out.println("Main Method"); // first static block gets executed !

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

        System.out.println("Main Method"); // first static block gets executed !
    }
}
/* ****
This flow is a bit different from the flow when we run the test code in different class. So in this example #1 is static block, because we call the main method in the same class where our objects are coming from. But normally the flow is that way:
#1 Main Method
#2 Static Block
#3 Instance Block
#4 Constructor
#5 Instance Block
*****
*/