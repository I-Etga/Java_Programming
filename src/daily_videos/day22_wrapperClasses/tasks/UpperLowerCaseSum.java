package daily_videos.day22_wrapperClasses.tasks;

import java.util.Arrays;

public class UpperLowerCaseSum {
    public static void main(String[] args) {

        String str = "JAVA 45 java";

        char[] chars = str.toCharArray();

        int numberOfUpperCase = 0;
        int numberOfLowerCase = 0;

        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                numberOfUpperCase++;
            } else if (Character.isLowerCase(aChar)) {
                numberOfLowerCase++;
            }
        }

        boolean isEqual = numberOfLowerCase == numberOfUpperCase;

        System.out.println("isEqual = " + isEqual);
    }
}
