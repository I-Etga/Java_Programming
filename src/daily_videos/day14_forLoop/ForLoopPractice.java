package daily_videos.day14_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        /*      this for loop prints infinite times Hello World.
                        Because the condition will be never false !!
              (int i 5; i<=10 , i--) -->[ i = 5,4,3,2,1,-1,0 .... so always <= 10]
        for (int i=5; i<=10; i--){
            System.out.println("Hello World");
        }
         */

        for (int i = 10; i >= 5; i--) {
            System.out.println("Hello World " + i);
        }


        // count 1-100

        int sum = 0;
        for (int number = 1; number <= 100; number++) {
            sum += number;
            // I want to see the process of for loops
            System.out.println(number);
            System.out.println(sum);
            System.out.println("******");
        }

        System.out.println(sum); // only gives the last sum !!

        System.out.println("*********");

        // print A-Z
        // DO NOT FORGET THE ASCII TABLE !!
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int asciiNum = (int) ch;
            System.out.println(ch + ": " + asciiNum);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }
        System.out.println(); // without it output: abcdefghijklmnopqrstuvwxyzHello World
        System.out.println("Hello World");
        /*
                    When you use the .print() , cursor stays on the same line.
                    So you should use a blank .println() statement to cursor goes to the new line.

                                       NEVER FORGET !!
                            ANY CODE INSIDE OF LOOP STATEMENT ,
                     RUNS EVERY SINGLE TIME THE CONDITION RETURNS TURE


         */


        for (char ch1 = 'Z' ; ch1 >= 'A'; ch1--){
                                // with spaces between the letters
            System.out.print(ch1 + " ");
        }
        System.out.println();
    }
}
