package daily_videos.day21_multiDimentionalArray.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CydeoStudents {

    public static void main(String[] args) {
        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Groups = new String[3][];

        batch1Groups[0] = batch1Group1;
        batch1Groups[1] = batch1Group2;
        batch1Groups[2] = batch1Group3;

        System.out.println(batch1Group1); // pass directly reference of 1D Array -> we get hash code
        System.out.println(Arrays.toString(batch1Group1)); // 1D Array- Arrays.toString(1DArray) returns array
        System.out.println(batch1Groups); // pass directly reference of Multi-dimensional Array(2D Array) -> we get hash code
        System.out.println(Arrays.deepToString(batch1Groups)); // Multi-dimensional Array(2D Array)- Arrays.deepToString(2DArray) returns 2DArray

        System.out.println("**********");

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups = new String[3][];

        batch2Groups[0] = batch2Group1;
        batch2Groups[1] = batch2Group2;
        batch2Groups[2] = batch2Group3;

        System.out.println(Arrays.deepToString(batch2Groups));

        String[][][] cydeoStudents = new String[2][][];
        cydeoStudents[0] = batch1Groups;
        cydeoStudents[1] = batch2Groups;


        System.out.println(Arrays.deepToString(cydeoStudents));


        for (String[][] batches : cydeoStudents) { //3D Array
            for (String[] batch : batches) {      //2D Array
                for (String student : batch) {   //1D Array
                    System.out.println(student);// String
                }
            }
        }
    }
}
