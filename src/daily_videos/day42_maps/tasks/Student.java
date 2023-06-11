package daily_videos.day42_maps.tasks;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {

        Map<String, int[]> students = new HashMap<>();

        students.put("Ahmet", new int[]{10, 20, 50, 50, 10});
        students.put("Mehmet", new int[]{10, 20, 50, 50, 10});
        students.put("Ayca", new int[]{10, 20, 50, 50, 10});
        students.put("Ravza", new int[]{10, 20, 50, 50, 10});
        students.put("Rachel", new int[]{10, 20, 50, 50, 10});


        for (Map.Entry<String, int[]> stringEntry : students.entrySet()) {
            System.out.println(stringEntry.getKey() + " " + stringEntry.getValue());

        }

    }
}

/*
1. Create a map that can contain the student name (String) and
student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
        1.1 add at least 5 pairs into the map
        1.2 Write a program that can display each student name and scores
 */
