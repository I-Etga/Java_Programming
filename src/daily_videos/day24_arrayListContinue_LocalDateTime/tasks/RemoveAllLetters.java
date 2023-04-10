package daily_videos.day24_arrayListContinue_LocalDateTime.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllLetters {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        // remove/-all method . Do not use in loop. You get wrong result. Because size of list is dynamic !
        //             p stands for each ( Character each : list )

        list.removeIf(p -> Character.isLetter(p));

        System.out.println(list);

    }

}
