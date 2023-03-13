package daily_videos.day14_forLoop.practice;

import java.util.Scanner;

public class Polidrome {
    public static void main(String[] args) {
        System.out.println("Enter your word: ");
        polindrome(new Scanner(System.in).next());
    }
    public static void polindrome(String str) {

        int lenght = str.length();
        String reverse = "";
        for (int i = 0; i < str.length() ; i++) {
            reverse += str.substring(lenght - i - 1, lenght - i);
        }
        /*      just to check out if it works !
        System.out.println(str);
        System.out.println(reverse);
         */
        System.out.println(str.equalsIgnoreCase(reverse));
    }
}
            /*
                        #2 approach:
                        for (int i = str.length()-1; i >= 0 ; i--) {
                            reverse += str.charAt(i);
                        }
                        boolean isPalindrome = str.equalsIgnoreCase(reverse);
             */
