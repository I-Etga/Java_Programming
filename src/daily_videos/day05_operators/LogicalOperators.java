package daily_videos.day05_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        double salary = 90000;
        int creditScore =650;
        int age = 25;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 &&  age >=25;
                                // if one of these statements is false, then returns false
                                // in the case which all of the statements are true, then return true

        System.out.println(eligibleForLoan);

        int old = 18;
        String country = "USA";

        boolean eligibleToVote = old >= 18 && country == "USA";

        System.out.println(eligibleToVote);


        System.out.println("---------------");
                        //  || OR OPERATOR
        String answer = "maybe";

        boolean validAnswer = answer == "yes" || answer == "maybe"; // returns true.
                                // because || (or operator) returns true, if one of the statements is true.
                                //so the only condition which it returns false is that all of them are false.
        System.out.println(validAnswer);

        String answerNew = "idk";

        boolean notValidAnswer = answerNew == "yes" || answer == "no"; // it returns false.
                                // because both of them are false !!
        System.out.println(notValidAnswer);

        System.out.println("---------------");

        char grade = 'B';
        boolean passedTheExam = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D';
        System.out.println(passedTheExam);

        System.out.println("---------------");

                // ! (not) operators
        System.out.println(!true);

        String a = "yes";
        boolean yes = a == "yes";
        boolean no = !yes;

        System.out.println(yes); // return true
        System.out.println(no); // return false

        System.out.println("---------");

        int score = 65;
        boolean passed = score >= 60;
        boolean failed  = !passed;

        System.out.println(passed); // true
        System.out.println(failed); // false

        System.out.println("---------------");


        System.out.println(true == !false && false == !true && true != !true);
                            //    true      &&     true    &&         true ::::: true











    }
}
