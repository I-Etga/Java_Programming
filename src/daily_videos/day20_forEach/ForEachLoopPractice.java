package daily_videos.day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,};

        // I want to print only odd numbers !!
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }


        for (int each : numbers) {
            if (each % 2 != 0) {
                System.out.println(each);
                // infinite loop IMPOSSIBLE !!
            }
        }
        System.out.println("------------");

        int [] nums = {100,20,30,40,5,4,3,2,1,1000,300,500};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) {

            if(each > max){
                  max = each ;
            }

            if(each < min){
                min = each;
            }
        }

        System.out.println("Maximum Number= "+ max);
        System.out.println("Minimum Number= "+ min);


        System.out.println("----------");

        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100,110,120};

        int [] a3 = new int[a1.length + a2.length];

        int k = 0;

        for (int each : a1) {
            a3[k++] = each;
            //k++;
        }

        for (int each : a2) {
            a3[k++] = each;
            //k++;
        }
        System.out.println(Arrays.toString(a3));


        System.out.println("-----------");

        String [] names = {"Mohammad Karimi", "Vasyl Dobrianski", "Gadir Imrahimov", "Abidullah Rahimi"};

        for (String each : names) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ")+1));
        }


    }
}
