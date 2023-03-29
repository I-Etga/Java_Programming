package wednesdays_office_hours.week8;

public class CodeAnalysisMemory {
      /*
        -Stack:

        -Methods
        -Local Variables
        -Reference Variables

        Heap:
        -objects
        -Instance Variables

         */

    public class Test {

        int z; // instance variable --> heap memory

        public static void add(int a, int b) { // Add method--> methods are in stack memory
            System.out.println(a + b);   // parameters and variables inside methods --> stack (int a and int b)
        }

        public static void main(String[] args) { // main method --> stack memory
            add(5, 3);
            // reference of obj --> stack
            //  Test obj = new Test(); // --> objects are heap memory !!
            //  obj.z = 10; // instances variables of object are HEAP memory
        }
    }
}


