package daily_videos.day23_arrayListContinue;

import java.util.ArrayList;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<String> studentsList = new ArrayList<>();

        studentsList.add("Barney");// index: 0
        studentsList.add("Rachel");//1
        studentsList.add("Rachel");//2
        studentsList.add("Ross"); //3
        studentsList.add("Ross"); //4
        studentsList.add("Amy"); //5
        studentsList.add("Rachel"); //6


        // #1 approach nested loop

        for (String student : studentsList) {
            int count = 0;
            for (String st : studentsList) {
                if (student.equals(st)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(student + " ");
                //break; -->returns only the first unique element
            }
        }
        System.out.println();
        // #2 approach indexOf() == lastIndexOf()
        //If the index of an element is the same as the last index of that element, it means it is unique.

        for (String student : studentsList) {
            if (studentsList.indexOf(student) == studentsList.lastIndexOf(student)) {
                System.out.print(student + " ");
                //break; --> returns only the first unique element
            }
        }

    }
}
