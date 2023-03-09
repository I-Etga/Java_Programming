package daily_videos.day13_CustomMethodsContinue;

public class ReturnStatements {
    public static void main(String[] args) {

        eligible(43);

        System.out.println(multiplication(45,6));

        System.out.println("----------------");

        System.out.println("Test 1 started");

        boolean exit = true;
        if(exit){
            return; // main method gets terminated
        }

        System.out.println("Test1 completed");
        System.out.println("Test2 started");

    }

    public static void eligible(int age) {
        if (age < 0 || age > 150) {
            System.err.println("Invalid age: " + age);
            return; // exits the method;
        }
        if (age >= 21) {
            System.out.println("You are eligible to buy alcohol");
        } else {
            System.out.println("You are not eligible to buy alcohol");
        }

    }

    public static int multiplication(int n1, int n2){
        int result = n1 * n2;
        return result;
        //void or any data types methods ends with return !!
        // the codes come after return won't be executed.
    }
}
