package sundays_live_sessions.week7;

import java.util.Arrays;

public class ReverseMiddle {
    public static void main(String[] args) {

        String[] words = {"Mustafa", "Kemal", "Ataturk"};

        String str = words[1];

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        words[1] = reverse;
        System.out.println(Arrays.toString(words)); // it prints as an array [, , ]

        for (String word : words) {
            System.out.print(word + " "); // it prints independent , not in array
        }
        System.out.println(); // to jump up to the next line !!(after print() we should do it !!)

        System.out.println("-----------");

        String[] words2 = {"more", "java", "please"};

        String str1 = words2[1];

        String reverse1 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse1 += str1.charAt(i);
        }

        words2[1] = reverse1;

        System.out.println(Arrays.toString(words2));// print as an array [, , ]
        for (String s : words2) {
            System.out.print(s + " "); // it prints independent , not in array
        }
    }
}

/*
ReverseMiddle [array, String, loop]

	Create a program that will have a String consisting of three words. Print the String, but the middle word should be reversed

	Ex:
		input: more java please
		ouput: more avaj please
 */