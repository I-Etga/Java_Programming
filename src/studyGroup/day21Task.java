package studyGroup;

import java.util.Arrays;

public class day21Task {
    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Groups = new String[3][];

        batch1Groups[0] = batch1Group1;
        batch1Groups[1] = batch1Group2;
        batch1Groups[2] = batch1Group3;

        System.out.println("******");

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups = {batch1Group1, batch1Group2, batch1Group3};

       /*  #2 alternative for line 24
       String [][] batch2Groups = new String[3][];
       batch2Groups[0] = batch2Group1;
        batch2Groups[1] = batch2Group2;
        batch2Groups[2] = batch2Group3;*/

        //String [][][] cydeoStudent = new String[2][][];
        String[][][] cydeoStudent = {batch1Groups, batch2Groups};
        //cydeoStudent = new String[][][]{{{"Ahmet", "Mehmet"}}}; (another way to create and assign a multi-D Array and )[example]

 /*     alternative of line 33
        cydeoStudent[0] = batch1Groups;
        cydeoStudent[1] = batch2Groups;*/

        // 1D Arrays.toString(arr);
        // Multi Arrays.deepToString()

        System.out.println(Arrays.deepToString(cydeoStudent));

        for (String[][] batchs : cydeoStudent) {
            for (String[] batch : batchs) {
                for (String student : batch) {
                    System.out.println(student);
                }
            }
        }

      /*  String [] names = {"Apple", "Banana", "Grape", "Avocado"}(one of the declaration method.We can NOT USE it by assigning );
          cydeoStudent[0][0] = names ; // It work that way btw.
          cydeoStudent[0][0][3] = "Ayse";
*/
        System.out.println("**");
        System.out.println(cydeoStudent[0][0][3]);
        System.out.println(Arrays.toString(cydeoStudent[0][0]));
        System.out.println(Arrays.deepToString(cydeoStudent[0]));
        System.out.println(Arrays.deepToString(cydeoStudent));
    }
}

