package daily_videos.day24_arrayListContinue_LocalDateTime;

import java.util.*;

public class FrequencyCharacters {
    public static void main(String[] args) {
        String str = "aaabbbcccdddeeebb";

        String result = "";
        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);// So I get the frequency of each element
            if (!result.contains(each)) {
                result += each + "" + frequency;
            }
        }

        System.out.println(result);
    }
}
