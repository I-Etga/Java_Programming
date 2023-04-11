package daily_videos.day24_arrayListContinue_LocalDateTime.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountryName {
    public static void main(String[] args) {
        ArrayList<String> countryNames = new ArrayList<>(Arrays.asList("Germany","United States of America","Turkey","France","Liechtenstein","UK","Belgium","Spain","Sweden","Syria","Egypt"));


        countryNames.removeIf(each-> each.length() >= 10); // to be deleted : USA,Liechtenstein

        System.out.println(countryNames); // [Germany, Turkey, France, UK, Belgium, Spain, Sweden, Syria, Egypt]
    }
}
