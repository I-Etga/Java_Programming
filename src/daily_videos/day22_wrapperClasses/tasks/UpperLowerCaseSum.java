package daily_videos.day22_wrapperClasses.tasks;

import java.util.Arrays;

public class UpperLowerCaseSum {
    public static void main(String[] args) {

        String str = "JAVA 45 java B";

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars)); // [J, A, V, A,  , 4, 5,  , j, a, v, a]

        int numberOfUpperCase = 0;
        int numberOfLowerCase = 0;

        for (char aChar : chars) { // alternative -> for (char aChar : str.toCharArray())
            if (Character.isUpperCase(aChar)) {
                numberOfUpperCase++;
            } else if (Character.isLowerCase(aChar)) {
                numberOfLowerCase++;
            }
        }

        boolean isEqual = numberOfLowerCase == numberOfUpperCase;

        System.out.println("isEqual = " + isEqual); // alternative: (numberOfLowerCase == numberOfUpperCase)
    }
}
