package daily_videos.day23_ArrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        students.removeAll(Arrays.asList("Ahmed")); // has to be collection !!

        System.out.println(students);

    }
}
