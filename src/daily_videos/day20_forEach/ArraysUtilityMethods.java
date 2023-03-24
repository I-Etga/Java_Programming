package daily_videos.day20_forEach;

import java.util.Arrays;

public class ArraysUtilityMethods {


    public static void main(String[] args) {

        int score[] = {70,100,80,90,65};

        System.out.println(Arrays.toString(score));

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }

        System.out.println("---------");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1,a2); // same element same order then true !!
        System.out.println(r1);

        System.out.println("--------");

        char [] ch1 = {'A', 'B', 'C'};
        char [] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1,ch2);
        System.out.println(r2); // same elements but in different ORDER. so false !!

        System.out.println("---------");

        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","C","B"};

        boolean r3 = Arrays.equals(s1,s2);
        System.out.println(r3);

    }
}
