package daily_videos.day17_customClass.practice.practice;

public class UniqueCharacters2 {
    public static void main(String[] args) {
        String str = "aabccd";

        String unique = "";
        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);    // j=0 I've selected the first char.
            int frequency = 0;

            /*
                                  BASICALLY
                                    j =0
                    I have selected the first number of my String.
                    Then in the inner for loop;
                            I am going to check if my char is the same another.
                            LEFT to RIGHT all the characters of String.

                            İNNER loops runs until and then reset itself.
                        then outer loops runs once more and of course inner loop .
                                    UNTIL all char is checked.
             */

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += ch;
            }

        }
        System.out.println(unique);
    }
}
