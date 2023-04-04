package daily_videos.day23_arrayListContinue.tasks;

import java.util.ArrayList;

public class ExtractLettersDigitsSpeacials {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        char[] characters = str.toCharArray();

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();

        for (char character : characters) {
            if (Character.isDigit(character)) {
                list1.add(character);
            } else if (Character.isLetter(character)) {
                list2.add(character);
            } else {
                list3.add(character);
            }
        }

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);

    }
}