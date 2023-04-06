package daily_videos.day25_cunstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM-dd-yy,EEEE");
        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df));

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm a");

        LocalTime time1 = LocalTime.of(17,5);

        System.out.println(time1.format(tf));


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE  MMM/dd/y  hh:mm a");

        // In pattern, Only certain letters for format can be used !!
        // But we can use any characters. Ex: space , : ^ & =

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf)); // 04/06/2023  03:27 AM
    }
}
