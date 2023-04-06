package daily_videos.day25_cunstructors;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);

        LocalDateTime ends = LocalDateTime.of(2023,5,18,11,0);

        System.out.println(ends);

    }
}
