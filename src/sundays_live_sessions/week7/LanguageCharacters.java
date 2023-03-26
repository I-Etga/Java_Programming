package sundays_live_sessions.week7;

import java.util.Arrays;

public class LanguageCharacters {
    public static char[] languageChar(String language) {

        int start = 0;
        int end = 0;

        switch (language) {
            case "English":
                start = 33;
                end = 126;
                break;
            case "Greek":
                start = 884;
                end = 1011;
                break;
            case "Arabic":
                start = 1548;
                end = 1790;
                break;
            case "Japanese":
            case "Chinese":
            case "Korean":
            case "Vietnamese":
                start = 63744;
                end = 64045;
                break;
            case "Braille":
                start = 10240;
                end = 10495;
                break;
        }

        char[] charLanguage = new char[(end - start) + 1];

        for (int i = start, k = 0; i <= end; i++, k++) {
            charLanguage[k] = (char) i;
        }
        return charLanguage;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(languageChar("English")));
        System.out.println(Arrays.toString(languageChar("Greek")));
        System.out.println(Arrays.toString(languageChar("Arabic")));
        System.out.println(Arrays.toString(languageChar("Japanese")));
        System.out.println(Arrays.toString(languageChar("Chinese")));
        System.out.println(Arrays.toString(languageChar("Braille")));
    }
}