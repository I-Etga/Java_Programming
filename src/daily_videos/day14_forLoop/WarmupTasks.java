package daily_videos.day14_forLoop;

public class WarmupTasks {
    public static void main(String[] args) {

        String str3 = combine("java", "apple");

        System.out.println(str3);
    }

    public static String combine(String str1, String str2) {
        String result;

        /*      approach #1
        how to get return as a charAt(char) method
                using concatenation
        ""+ str1.charAt() >String <->same result but char<str1.charAt()

                 approach #2
                 str.substring(index)
         */
                    //returns the first char of the second word as string!!
        if (str1.endsWith("" + str2.charAt(0))) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }
        return result;
    }
}
