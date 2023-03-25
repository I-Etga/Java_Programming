package daily_videos.day19_Arrays.tasks;

import utilities.ArraysUtility;

public class ClassMates {

    public static void main(String[] args) {
        /*
         there are two ways to declare an array. 1-new constructor 2-curly braces {}
         In this case I know the all elements, so I use the second way

        */

        String[] classMates = {"Akif", "Zainab", "Ziya", "Sabah", "Marah", "Husametin", "Yevgeniy", "Aynur", "Rachel", "Ross"};

                // #1 approach for loop
        for (int i = 0; i < classMates.length; i++) {
            System.out.println(classMates[i]);
        }

        System.out.println("----------");
                // #2 approach  for each loop
        for (String classMate : classMates) {
            System.out.println(classMate);
        }


        System.out.println("----- REVERSE-------");
            // don't forget : classMate(each) is a String !! (We have to use String methods)
        for (String classMate : classMates) {
            String str ="";
            for (int i = classMate.length()-1; i >=0; i--) {
                str += classMate.charAt(i);
            }
            System.out.println(str);
        }

    }
}

