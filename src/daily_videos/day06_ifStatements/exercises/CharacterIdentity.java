package daily_videos.day06_ifStatements.exercises;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {

            /*

        // CHECK THE ASCII  TABLE OUT BEFORE DOING THIS TASK.
                48-57 DIGITS ex: 48-0 ,57-9
                65-90 UPPERCASE LETTERS
                97-122 LOWERCASE LETTERS
                 we can say special characters rest of the things we counted above.
             */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        int asciiValue = (int)scanner.next().charAt(0);

        String result = "";

        boolean isAlphabeticChar = asciiValue >=65 && asciiValue <= 90 || asciiValue >=97 && asciiValue <= 122;
        boolean isDigit = asciiValue >=48 && asciiValue <= 57;
        boolean isSpecialChar = !isAlphabeticChar && !isDigit;
                        //there is an another and easier way!!. LOOK AT DAY 10-DigitLetterSpecialChar !!

        if (isDigit){
            result = "Digit";
        } else if (isAlphabeticChar) {
            result = "Alphabetic Character";
        }else{
            result = "Special Character";
        }

        System.out.println(result);
    }
}
