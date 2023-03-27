package daily_videos.day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";

        System.out.println(str);

        String[] words = str.split(" "); // split is a String method !!

        System.out.println(Arrays.toString(words));

        str = "";
                    // this is how we can remove extra spaces in array
        for (String each : words) {
            if(!each.isEmpty()){
                str += each + " ";
            }
        }
        str = str.trim(); // to remove the last space
        System.out.println(str);
    }
}
