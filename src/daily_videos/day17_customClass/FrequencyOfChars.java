package daily_videos.day17_customClass;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "aabccd";

        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            /*
            this is actually prevent repetition.
            if in the first loop, there comes already counted char;
                    then it ignores it. Because already counted !!
                    Otherwise, result will be duplicated which is wrong.
             */

            if (result.contains("" + ch)) { // if the character is already included in the result.
                continue;
            }
            result += ch + "" + count;
        }
        System.out.println(result);
    }
}
