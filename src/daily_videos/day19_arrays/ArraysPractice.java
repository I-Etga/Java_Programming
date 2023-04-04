package daily_videos.day19_arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {


        String [] myGroup = new String[5];

        myGroup[myGroup.length-1] = "Aseel";

        myGroup[0] = "Gulcin";
        myGroup[1] = "Abidullah";
        myGroup[2] ="Sumeyye";
        myGroup[3] ="Khashayar";

        System.out.println(Arrays.toString(myGroup));

        myGroup[3] = "Aisha";

        System.out.println(Arrays.toString(myGroup)); // aisha replaced for Khashayar


        for (int i = myGroup.length-1; i >=0 ; i--) {
            System.out.println(myGroup[i]);
        }


        // there is a shortcut of for loops for arrays ! arraysName.forr(reverse) enter

        for (int i = myGroup.length - 1; i >= 0; i--) {

        }


    }
}
