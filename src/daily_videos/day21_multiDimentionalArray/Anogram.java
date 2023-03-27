package daily_videos.day21_multiDimentionalArray;

import java.util.Arrays;

public class Anogram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2 = "earth";

        // There are two ways to turn a string to an array! #1 .split("") // returns String[] !!


        // String [] array1 = str1.split("");
        //System.out.println(Arrays.toString(array1));

        char[] array1 = str1.toCharArray();
        // #2 way .toCharArray(); // returns char[] !!

        char[] array2 = str2.toCharArray();
        System.out.println(Arrays.toString(array2));

        System.out.println("***before sort !! above***");
        System.out.println("------------------------");
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("***after sort !! below***");

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        // Arrays.equals() --> arrays have to have the same data type
        // Array.equals(String{h,e,a,r,t} , char {h,e,a,r,t}) !! ILLEGAL !!
        boolean isAnagram = Arrays.equals(array1, array2);
        System.out.println("isAnagram = " + isAnagram);
    }
}
