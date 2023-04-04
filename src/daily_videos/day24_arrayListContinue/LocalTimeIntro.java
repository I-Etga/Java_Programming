package daily_videos.day24_arrayListContinue;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime starting_time = LocalTime.of(10,30);

        System.out.println(starting_time);

        LocalTime right_now = LocalTime.now();

        System.out.println(right_now); //24h format

        System.out.println("***********");

        LocalTime time1 = LocalTime.of(23,59,59);
        // I could give maximum 23 for hour and 59 for minute and second.Otherwise, I get exception.

        time1 = time1.plusHours(1); // 00:59:59
        System.out.println(time1);

        time1 = time1.plusMinutes(45); // 01:44:59
        System.out.println(time1);

    }
}
