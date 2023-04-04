package daily_videos.day19_arrays;
import java.util.Arrays;
public class ArraysIntro {
    public static void main(String[] args) {
        int score1 = 85;
        int score2 = 70;
        int score3 = 50;
        int score4 = 67;
        int score5 = 45;                          // more than one !
        // there is a special variable allows me to store five variables innit !

        System.out.printf("------------");

        int scores [] = new int[5]; // this how instantiate an array !!(number of element must be entered !!)


        System.out.println(scores); // hash code will be printed
        System.out.println(scores.toString()); // hash code will be printed ex: [I@30f39991

                            // array utility class
        System.out.println( Arrays.toString(scores)); // now I get 5 zeros [0,0,0,0,0]( default value of int)

        scores[0]= 85;
        scores[1]= 70;
        scores[3] = 67;
        scores[4] = 45;
        scores[2] = 78; // [0, 0, 2, 0, 0 ] according to index number 0-4

        //scores[5] = 80; -- ArrayIndexOutOfBoundsException
        //scores[-1] = 100; -- ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(scores));

        String letters [] = new String[4];

        System.out.println(Arrays.toString(letters)); // Il get 4 null [null, null, null, null] - default value of string null



        scores = new int[10]; // now the first array(line14) goes to garbage collection after line 40
        /*
        this is different object from the first scores array.
        So the all 10 values are now zero [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]!! old values stayed in old array[5]
         */

        System.out.println(Arrays.toString(scores));


        scores = new int[50]; // now the second array(line40) goes to garbage collection.
        scores[0] = 50;
        System.out.println(scores[0]); // returns an int 50

        System.out.println("---------");

        scores = new int[5];

        scores[0]= 85;
        scores[1]= 70;
        scores[3] = 67;
        scores[4] = 45;
        scores[2] = 78;

        // this is how to get the  index of the last element in the array
        System.out.println(scores.length-1);

        for (int i = 0; i < scores.length; i++) {

            System.out.println(scores[i]);

        }

    }
}
