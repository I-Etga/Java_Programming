package daily_videos.day24_arrayListContinue_LocalDateTime.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println(leapYear(1997)); // false
        System.out.println(leapYear(2000)); // true
    }
    public static boolean leapYear(int birthYear){

        return LocalDate.of(birthYear,1,1).isLeapYear();
    }
}