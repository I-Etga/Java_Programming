package daily_videos.day24_arrayListContinue.tasks;

import daily_videos.day05_operators.ShorthandOperators;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDatesBeforeAugust {
    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(LocalDate.of(2021,5,5),
                LocalDate.of(2015,7,15),
                LocalDate.of(2010,5,8),
                LocalDate.of(2020,10,10)));


        dates.removeIf(p -> p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(dates); // [2021-05-05, 2020-10-10]

    }
}
