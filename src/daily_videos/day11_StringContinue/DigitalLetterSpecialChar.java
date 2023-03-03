package daily_videos.day11_StringContinue;

import java.util.Scanner;

public class DigitalLetterSpecialChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word");
        String userWord = scanner.nextLine();

        /*
                             only /nextLine can read pressing enter.
                          So if you want to get empty string, you have to use nectLine() not next() !!

         */
        // int asciiValue = (int) firstLetter; (Necessary for the second(old) method-read below)

        String result = "";

        /*
                    There are two types of solutions.
                    1-  Characters behave as a number WITH RELATIONAL OPERATORS according to the Ascii Table.
                    2- Find the range of letter in upper and lower cas, digits and special character.
                               Get the asciiValue of the char and compare !
                                    int asciiValue = (int) firstLetter

                    First one is so much easier !!
         */

        /*
                We should check first if string is totally empty or not.(Space is a character and holds index!!)
                            If the String is empty .length()=0 and index does NOT EXIST.
                                        SO WE CAN'T USE THOSE METHODS.
         */

        if (userWord.length() >= 1) {
            /*
                         I declare the char (using index-charAt()) inside if statement
                         Because if the String is empty, the program fails !!
             */
            char firstLetter = userWord.charAt(0);
           /*
            boolean isUpperCase = firstLetter >= 'A' && firstLetter <= 'Z';  //asciiValue >= 65 && asciiValue <= 90;
            boolean isLowerCase = firstLetter >= 'a' && firstLetter <= 'z';//asciiValue >= 97 && asciiValue <= 122;
            boolean isDigit = firstLetter >= '0' && firstLetter <= '9';//asciiValue >= 48 && asciiValue <= 57;
                        We don't need to declare booleans in such short cases !!
            */
            if (firstLetter >= '0' && firstLetter <= '9') {
                result = "Digit";
            } else if (firstLetter >= 'A' && firstLetter <= 'Z') {
                result = "The first character is in uppercase";
            } else if (firstLetter >= 'a' && firstLetter <= 'z') {
                result = "The first character is in lowercase";
            } else {
                result = "The first character is a special character";
            }
        } else {
            System.out.println("String is empty");
        }
        System.out.println(result);

        scanner.close();
    }
}
