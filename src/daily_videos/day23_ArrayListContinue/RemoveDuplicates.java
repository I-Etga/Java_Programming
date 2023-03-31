package daily_videos.day23_ArrayListContinue;

import java.util.ArrayList;
public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Barney");// index: 0
        studentsList.add("Rachel");//1
        studentsList.add("Rachel");//2
        studentsList.add("Ross"); //3
        studentsList.add("Ross"); //4
        studentsList.add("Amy"); //5
        studentsList.add("Rachel"); //6

        ArrayList<String> nonDup = new ArrayList<>();
        System.out.println(studentsList); // before using for loop [Barney, Rachel, Rachel, Ross, Ross, Amy, Rachel]

        for (String each : studentsList) {
            //nonDup.add(each); // BEFORE if statement, it prints all the students even if they're duplicates.
            if (nonDup.contains(each)) {
                continue;
            }
            nonDup.add(each); // but AFTER the if statement it is only printed ONCE even if they are duplicates.
        }
        studentsList = nonDup; // now we assign non-Dup version to previous version. (So we will no longer get old arraylist)
        // Our previous array does NOT duplicate name anymore !!

        System.out.println(studentsList); // after using for loop(+contains method) !! [Barney, Rachel, Ross, Amy]
    }
}
