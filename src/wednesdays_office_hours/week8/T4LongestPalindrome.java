package wednesdays_office_hours.week8;

import java.util.Arrays;

public class T4LongestPalindrome {
    public static void main(String[] args) {

        String[] words = {"java", "long word", "civic", "apple", "civic", "racecar", "mom", "anna", "really long word", "anna"};

        String[] reverseWords = T3ReverveEach.reverse(words); // I've created a new array with that method which includes reversed elements of words array.

        //System.out.println(Arrays.toString(words)); (I've just checked if my custom method works. It works)

        int lengthOfLongest = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(reverseWords[i]) && words[i].length() > lengthOfLongest) {
                lengthOfLongest = words[i].length();
            }
        }

        if (lengthOfLongest == 0) {
            System.out.println("No Palindrome Found");
        }
        String longestRev = "longest palindrome/s is/are: ";
        for (int i = 0; i < reverseWords.length; i++) {                                         // just in case duplicated element
            if (reverseWords[i].length() == lengthOfLongest && words[i].equals(reverseWords[i]) && !longestRev.contains(reverseWords[i])) {
                longestRev += reverseWords[i] + " ";
            }
        }

        System.out.println(longestRev);
    }
}

