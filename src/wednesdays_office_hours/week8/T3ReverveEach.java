package wednesdays_office_hours.week8;

import java.util.Arrays;

public class T3ReverveEach {
    public static void main(String[] args) {

        String[] words = {"can", "you", "join", "the", "team" };

        String [] reverseWords = reverse(words);

        System.out.println(Arrays.toString(reverseWords));
    }
    public static String[] reverse(String[] array) {

        String[] reverseWords = new String[array.length];
        /*
        I've used here the outer loop as for each loop.
        That would be easier, if I used regular for loop.
        However, inner loop MUST be for loop. Because for each loop has no index an order is completely fixed.
         */
        int k = 0;

        for (String word : array) {
            //can // you
            String reverse = ""; //nac // uoy
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += "" + word.charAt(i);
            }
           // System.out.println(reverse); // shows how it works. After each! inner loop turn, we get a reverse word.
            reverseWords[k++] = reverse; // usage of k++ is important-increment !!
        }
       return reverseWords;
    }
}
