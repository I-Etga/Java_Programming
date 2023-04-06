package daily_videos.day23_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed", "Ahmed" ,"Ahmed"));

        students.removeAll(Arrays.asList("Ahmed")); // has to be collection !!
        // students.remove("Ahmed"); // It removes only the first "Ahmet"


        System.out.println(students);
    }
}
