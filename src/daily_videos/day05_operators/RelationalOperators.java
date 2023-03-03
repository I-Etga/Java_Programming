package daily_videos.day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {
                    // GREATER THAN >
        int a = 1000;
        int b = 200;
        System.out.println(a > b); // output = true (boolean)

        System.out.println(a<b); // output = false

        boolean aIsGreater = a > b;  // this is how i create my boolean expression

        System.out.println(aIsGreater); // returns true because a > b


        System.out.println("******************");

                    //GREATER THAN OR EQUAL >=

        int score =75;
        boolean passed = score >= 60;

        System.out.println(passed); // returns true because score(75 ) >= 60


        System.out.println("***************");

                //LESS THAN <

        int age =18;

        boolean eligibleToBuyAlcohol= age >= 21 ;

        System.out.println(eligibleToBuyAlcohol); // false because age is 18 and it's less than 21

        System.out.println(" ***************");

        score = 48;  // assignment operator. We revalue / reassign the value to score variable.(it was 75 before)

        boolean failed = score < 60;

        System.out.println(failed); // return false.


        System.out.println("****************");

        System.out.println(100 < 2000); // returns true
        System.out.println(100 < 20 ); // false


        System.out.println( " ***************");

                    // LESS THAN OR EQUAL OPERATOR
        System.out.println(100 <= 100); // returns true. because 100 = 100

        System.out.println(10 >= 100); // returns false .
                //there are two options 1-greater or 2-equal
                    // if one of two options is true, RETURNS TRUE
                        //THIS IS HOW OR WORKS

        System.out.println(" ****** JUST A REMINDER *****");
        /*          Every char values has a unique numeric value.
               char a ='A'; ==identical== char a =65;
               int b = 'A'; .print(a); ==65

        */
        System.out.println(" ****** JUST A REMINDER *****");

        int aa = 'A'; // We can see the numeric value of a char with this method.
        int bb = 'B'; // we should of course print the variable to see the numeric value.

        System.out.println((int)'A'); // 65
        System.out.println((int)'B'); //66

        System.out.println('A' < 'B'); // 65<66 so true
                    /// BUT ATTENTION !! \\\
        //System.out.println("Java" < "C#"); // I get compiler error
        // Because >, <, =<, => CAN ONLY BE APPLICABLE ON NUMBERS.









    }
}
