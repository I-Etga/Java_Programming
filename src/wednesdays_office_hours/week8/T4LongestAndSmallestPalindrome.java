package wednesdays_office_hours.week8;

import utilities.StringUtility;

public class T4LongestAndSmallestPalindrome {
    public static String longestAndSmallestPalindrome(String[] words) {

        String longest = ""; // racecar
        String smallest = words[0];

        for (String each : words) {

            String reverse = StringUtility.reverse(each);

            if (reverse.equals(each) && reverse.length() > longest.length()) {
                longest = each;
            }
            if (reverse.equals(each) && reverse.length() < smallest.length()) {
                smallest = each;
            }
        }
        /*  if(!longest.isEmpty()){
            return "longest : "+longest +"\nsmallest: " + smallest; }*/

        return longest.isEmpty() ? "No Palindrome Found" : "longest : " + longest + "\nsmallest: " + smallest;
    }

    public static void main(String[] args) {

        String[] strs = {"really long word", "java", "long word", "civic", "apple", "racecar", "mom", "anna"};

        System.out.println(longestAndSmallestPalindrome(strs));


    }
}
