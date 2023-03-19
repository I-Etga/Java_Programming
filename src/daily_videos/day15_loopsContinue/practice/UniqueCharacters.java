package daily_videos.day15_loopsContinue.practice;

public class UniqueCharacters {
    public static void main(String[] args) {

        //  Approach I

        String str = "AABCCD";
        //out : bd

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += ch;
            }
        }
        System.out.println(unique);

        System.out.println("*******************");

        //  Approach II

        str = "AABCCDEFFG";
        String unique1= "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                unique1+=ch;
            }
        }
        System.out.println(unique1);
    }
}
