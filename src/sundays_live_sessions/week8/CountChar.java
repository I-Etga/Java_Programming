package sundays_live_sessions.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class CountChar {
    public static void main(String[] args) {

        ArrayList<String> letters = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));

        char letter = 'a';
        // # old version solution (str.charAt() )
        int count = 0;
        for (String s : letters) { // I have here a String. So two methods come to my mind. #1 charAt & toCharArray()
            //s.toCharArray() --> returns a char array !! (look at line 34)
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == letter) {
                    count++;
                }
            }
        }
        System.out.println(count);

        System.out.println("*** toCharArray() method ***");

        System.out.println(countCharInList(letters, 'a'));
        System.out.println(countCharInList(letters, 's'));
        System.out.println(countCharInList(letters, 'j'));

    }

    //#2 new version (toCharArray())
    public static int countCharInList(ArrayList<String> list, char letter) {
        int count = 0;
        for (String eachWord : list) {
            for (char eachLetter : eachWord.toCharArray()) { // iterates through each character of the String elements
                if (eachLetter == letter) {
                    count++;
                }
            }
        }
        return count;
    }
}
