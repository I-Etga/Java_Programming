package daily_videos.day24_arrayListContinue_LocalDateTime.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllSpecialChars {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> !Character.isLetterOrDigit(p));

        System.out.println(list); // [A, B, 1, 2, C, D, 3, 4]

    }
}