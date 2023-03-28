package daily_videos.day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionArrayPractice {
    public static void main(String[] args) {
        String [] group1 = {"Lucy", "Umran", "Sumeye", "Abidullah"}; // 4 names
        String [] group2 = {"Madiyar","Khashayar", "Reyhane"}; // 3 names
        String [] group3 = {"Alena","Evgeniya","Shukur","Hasan","Bilal"}; // 5 names
        String [] group4 = {"Adilan","Ali"}; // 2 names

        // only multi dimensional array is container for the single dimension arrays !!
        String [][] groups = {group1,group2,group3,group4};

        for (int i = 0; i < groups.length; i++) {
            String [] eachGroup = groups[i];  // returns an array
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                System.out.println(eachGroup[j]); // returns an element
            }
        }

        System.out.println("------ // for each loop //--------");

        for (String[] group : groups) {
            //System.out.println(Arrays.toString(group));
            for (String each : group) {
                System.out.println(each);
            }
        }


        System.out.println("------ // for each loop & for loop mixed //--------");

        System.out.println("outer-for each & inner -for");
        for (String[] group : groups) {
            for (int i = 0; i < group.length; i++) {
                System.out.println(group[i]);
            }
        }

        System.out.println("outer-for & inner-for each");
        for (int i = 0; i < groups.length; i++) {
            for (String eachElement : groups[i]) {
                System.out.println(eachElement);
            }
        }

        System.out.println(Arrays.toString(groups));
            // toString() method is only for single dimension arrays.
            // If you write inside multi dimensional array, you'll get hashcode.


        //here comes to print multi dimensional arrays !

        System.out.println(Arrays.deepToString(groups));
    }


}
