package daily_videos.day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println(5 + 2 * 3);
                        // first multiplication then addition

        System.out.println(7 + 3 - 2 / 2);
                           // 7 + 3 -1 ==> 9 (first multiplication then additon and subtraction)

        System.out.println(-5 + 2); // - is unary negation operator
                    // -3

        System.out.println(10 > 9 == 8< 7 && "Java" == "Python" || 'a' == 'A');
        /*
                          true == false && "Java" == "Python" || 'a' == 'A'  == >>> && >>> |||
                                    false       &&      false        || false
                                          false               || false
                                                    //false
                                                    */

        System.out.println(100 >= 20 && 40 * 2 > 60 || true ==false);
                    //        true && true (80 >60) || false
                    //              true || false
                    //                  true

                                //THIS IS REALLY INTERESTING EXAMPLE
        int a = 20;
        a += 10 + 2 * 3;
        /*
        a += 10 + 6
        a += 16
        a = 36
         */
        System.out.println(a);





    }
}
