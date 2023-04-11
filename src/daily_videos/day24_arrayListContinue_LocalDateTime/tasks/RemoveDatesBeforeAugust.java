package daily_videos.day24_arrayListContinue_LocalDateTime.tasks;

import daily_videos.day26_statics.Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDatesBeforeAugust {
    public static void main(String[] args) {

        /*  ArrayList<Car> cars = new ArrayList<>(Arrays.asList(new Car("Audi","a3",2021,32000,"blue")));

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("Ankara"));   */

        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(LocalDate.of(2021,5,5),
                LocalDate.of(2015,7,15),
                LocalDate.of(2010,5,8),
                LocalDate.of(2020,10,10),
                LocalDate.of(2029,5,7)));

        dates.removeIf(p -> p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println(dates); // [2021-05-05, 2020-10-10]

    }
}
