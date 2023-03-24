package daily_videos.day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Cydeo School";

        char [] ch1 = str.toCharArray();

        System.out.println(Arrays.toString(ch1));

        ch1 = str.replace(" ", "").toCharArray();

        System.out.println(Arrays.toString(ch1));

        System.out.println("*******************");

        String str2 = "Today is a great day to learn java";

        String[] str3 = str2.split(" "); // reference value to split !!

        System.out.println(Arrays.toString(str3));

        System.out.println("--------------");

        String sentence = "I love Java";
        // "Java love I"

        String [] sentenceReverse  = ArraysUtility.reverse(sentence.split(" " ));

        System.out.println(Arrays.toString(sentenceReverse)); // [Java, Love, I] --> returns String[]

        String reservedSentence = "";

        for (int i = 0; i < sentenceReverse.length; i++) {
            reservedSentence += sentenceReverse[i] + " ";
        }
        System.out.println(reservedSentence); // Java Love I --> returns String
    }

}
