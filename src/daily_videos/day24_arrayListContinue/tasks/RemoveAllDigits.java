package daily_videos.day24_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDigits {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        // I am going to use isDigit which special method for Character of Wrapper Class!
        // Arraylist & REMOVE/-ALL !! BE CAREFUL


        //            p stands for each ---> (Character each : list) !! It's really important (iterate automatically)
        list.removeIf(p-> Character.isDigit(p));

        System.out.println(list); // [$, A, B, C, D, @, !] It worked

    }
}
