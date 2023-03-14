package daily_videos.day15_LoopsContinue;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 2) {
                /* Because of continue, it prints 1,3,4,5.
                So, only 2 is not printed. Before and After continue got executed.

                If I write break instead of continue, It will print only 1 !!
                Because after break, loop will be terminated!!
                 */
                continue;
            }
            System.out.println(i);
        }

        System.out.println("**********");

        for (int i = 10; i < 21; i++) {

            if (i % 2 == 0) {
                continue; // skip the current iteration
                // With this continue statement, it will print only odd numbers.
            }
            System.out.println(i);
        }

        System.out.println("**********");

        for (char i = 'A'; i <= 'G'; i++) {
            /*
            if(i == 'A' & i == 'B'){ // i can NOT be two characters
                        at the SAME TIME. So always false and never jumps the next i !!
                continue;
            }
             */
            if (i == 'B') {
                continue;
            }
            if (i == 'E') {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("**********");

        for (int i = 0; i < 10; i++)
            System.out.println("Hello World");
        System.out.println("hi");
        System.out.println("Hello Cydeo");

            /*
                    LOOP WİTHOUT CURLY BRACES ( NOT RECOMMENDED !!)
            This is for loop without curly braces.
            It executes ONLY NEXT statement.
            So line 49 will be printed 10 TIMES !!
            and line 50-51 will be printed/executed only ONCE !!(compiler warns! anyway)

             */

        System.out.println("**********");

        // find the SUM of all the ODD number between 50-100

        int sum = 0;
        for (int i = 50; i <101 ; i++) {
            if ((i % 2 )!= 0) {
                sum += i;
            }
           /*   #2 approach !! W-continue
            if(i %2 == 0){
                continue;
            }
            sum+=i;
            */
            //System.out.println( i +" "+  sum);// [to see how it works]
        }
        System.out.println(sum);

        //              #2 Approach-- Super easy (same task-same result with a litte trick!!
        int sum2=0;               //**
        for (int i = 51; i < 101; i+=2) {
            sum2+=i;
        }
        System.out.println(sum2);





    }
}
