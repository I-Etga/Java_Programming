package daily_videos.day24_arrayListContinue_LocalDateTime.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFirstLastCharSame {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        names.removeIf(p-> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length()-1));

        System.out.println(names); // [Canada, Lan, Ebrahim, Farida]
    }
}
