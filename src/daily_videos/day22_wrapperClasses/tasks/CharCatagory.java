package daily_videos.day22_wrapperClasses.tasks;

import daily_videos.day03_variables.Char;

import java.util.Arrays;

public class CharCatagory {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        char[] chars = str.toCharArray();

        System.out.println(chars);

        System.out.println(Arrays.toString(chars)); //[W, o, o, d, e, n,  , S, p, o, o, n]

        String letter = "";
        String digits = "";
        String specialChars = "";
/*
                        #1   Old Version

        for (char ch : chars) {
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                letter += ch;
            } else if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else {
                specialChars += ch;
            }
        }*/

        //    #2 New Version ( Wrapper classes methods (Character))

        for (char ch : chars) {
            if (Character.isLetter(ch)) {
                letter += ch;
            } else if (Character.isDigit(ch)) {
                digits += ch;
            } else { //#2 alternative of else : else if(!Character.isLetterOrDigit(ch))
                specialChars += ch;
            }
        }

        System.out.println("letter = \"" + letter + "\"");
        System.out.println("digits = \"" + digits + "\"");
        System.out.println("specialChars = \"" + specialChars + "\"");
    }
}

