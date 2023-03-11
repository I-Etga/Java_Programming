package daily_videos.day04_concatenation;

public class Concatenation_vs_Addition {

    public static void main(String[] args) {

        System.out.println("32" + 1); // output 321

        System.out.println(7 + "1"); // output 71

        System.out.println("12" + "5"); // output 125

        System.out.println("***********************");

        System.out.println(12 + 2.5); // 14.5

        System.out.println("The value is " + true); // The value is true
        // so boolean can be also used



        /*
                            if at least one String, we have concatenation.
                    it does NOT MATTER Sting BLANK, SPACE OR any other characters.

                    the trick example is about that java compiler runs top to bottom and left to write.
                        So if there is two integer and between them addition operator then a String ;
                                    first we're doing the math and after that we concatenate !!

                                    look at line 33-34. It looks the same but totally different.
                                       Compiler runs top->bottom & left->right
                                       Compiler thinks it's mathematical operation until it comes across a string.
                                       ex 1: until String math>so 4+8=12 and after string concatenation 12Ankara53
                                       ex 2: until string math(addition). It starts with String. So this is completely concenation.
                                        ex 3: until String math(addition). we can think about it -(4+8+5+3) + "Ankara"4+6
         */

        System.out.println(4 + 8 + "Ankara" + 5 + 3); //  12Ankara53[ (4+8)+"Ankara"+ 5 + 3]
        System.out.println("Ankara" + 4 + 8 + 5 + 3); // Ankara4853  ["Ankara"+ 4 + 8 + 5 + 3]
        System.out.println(4 + 8 + 5 + 3 + "Ankara" + 4 + 6); // 20Ankara46 [(4+8+5+3) + "Ankara"+ 4 + 6]


    }
}
