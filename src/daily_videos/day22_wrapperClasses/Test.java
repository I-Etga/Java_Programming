package daily_videos.day22_wrapperClasses;

import utilities.ArraysUtility;

public class Test {
    public static void main(String[] args) {

        int [] numbers = {10,20,30,40,50,60,70,90};

        boolean contains = ArraysUtility.contains(numbers,20);
        System.out.println("It contains 20: " + contains);

        System.out.println("-------------------");



    }
}
