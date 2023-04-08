package daily_videos.day24_arrayListContinue.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllLetters {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        // remove/-all method . Do not use loop. You get wrong result. Because size of list is dynamic !
        //             p stands for each ( Character each : list )
        list.removeIf(p -> Character.isLetter(p));

        System.out.println(list);

    }

}

/*
3. Write a program that can remove all the letters from an arrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$',  '1', '2', '@', '!', '3', '4']
 */