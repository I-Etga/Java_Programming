package sundays_live_sessions.week9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Holidays {
    public static ArrayList<String> holidaysFormatted() {

        // DateTimeFormatter returns String. So if we want our methods returns formatted date , we have to adjust object type arraylist.
        // That method is not good practice, but I want to see what's the difference !
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM,yy,d");

        ArrayList<String> holidays = new ArrayList<>();
        holidays.addAll(Arrays.asList(LocalDate.of(2023, 1, 1).format(df),
                LocalDate.of(2023, 1, 16).format(df),
                LocalDate.of(2023, 2, 20).format(df),
                LocalDate.of(2023, 4, 9).format(df),
                LocalDate.of(2023, 4, 16).format(df),
                LocalDate.of(2023, 5, 29).format(df),
                LocalDate.of(2023, 6, 19).format(df),
                LocalDate.of(2023, 7, 4).format(df),
                LocalDate.of(2023, 9, 4).format(df),
                LocalDate.of(2023, 10, 9).format(df),
                LocalDate.of(2023, 11, 10).format(df),
                LocalDate.of(2023, 11, 23).format(df),
                LocalDate.of(2023, 12, 25).format(df)
        ));

        return holidays;
    }

    public static ArrayList<LocalDate> holidays() {
        ArrayList<LocalDate> holidays = new ArrayList<>();
        holidays.addAll(Arrays.asList(LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 16),
                LocalDate.of(2023, 2, 20),
                LocalDate.of(2023, 4, 9),
                LocalDate.of(2023, 4, 16),
                LocalDate.of(2023, 5, 29),
                LocalDate.of(2023, 6, 19),
                LocalDate.of(2023, 7, 4),
                LocalDate.of(2023, 9, 4),
                LocalDate.of(2023, 10, 9),
                LocalDate.of(2023, 11, 10),
                LocalDate.of(2023, 11, 23),
                LocalDate.of(2023, 12, 25)
        ));

        return holidays;
    }

    public static ArrayList<LocalDate> winterHolidays() {
        ArrayList<LocalDate> winterHolidays = new ArrayList<>();
        winterHolidays.addAll(holidays());
        winterHolidays.removeIf(p -> p.getMonthValue() == 12 || p.getMonthValue() > 2);

        return winterHolidays;
    }

    public static ArrayList<LocalDate> springHolidays() {
        ArrayList<LocalDate> springHolidays = new ArrayList<>();
        springHolidays.addAll(holidays());
        springHolidays.removeIf(p -> p.getMonthValue() < 3 || p.getMonthValue() > 5);

        return springHolidays;
    }

    public static ArrayList<LocalDate> summerHolidays() {
        ArrayList<LocalDate> summerHolidays = new ArrayList<>();
        summerHolidays.addAll(holidays());
        summerHolidays.removeIf(p -> p.getMonthValue() < 5 || p.getMonthValue() > 8);

        return summerHolidays;
    }

    public static ArrayList<LocalDate> autumnHolidays() {
        ArrayList<LocalDate> autumnHolidays = new ArrayList<>();
        autumnHolidays.addAll(holidays());
        autumnHolidays.removeIf(p -> p.getMonthValue() < 9 || p.getMonthValue() > 11);

        return autumnHolidays;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What month do you want to check the dates for? (num)");
        //int inputMonth = input.nextInt();
        int inputMonth = 4;

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM - d, y");

        for (LocalDate eachDate : holidays()) { // iterates through all the LocalDate objects
            if (eachDate.getMonthValue() == inputMonth) {
                System.out.println(eachDate.format(DateTimeFormatter.ofPattern("MMMM d, yy")));
//                System.out.println(eachDate.format(DateTimeFormatter.ofPattern("MMM d, yyyy")));
//                System.out.println(eachDate.format(DateTimeFormatter.ofPattern("MM/d/yy")));
            }
        }

        // EXTRA EXAMPLES
        System.out.println("--------------------------------------------");
        // Give all the holidays after the given month

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy"); // used for these examples

        int afterMonthInput = 6;
        for (LocalDate eachDate : holidays()) {
            if (eachDate.isAfter(LocalDate.of(2023, afterMonthInput, 1))) {  // or if(eachDate.getMonthValue() >= afterMonthInput){
                System.out.println(eachDate.format(formatter));
            }
        }

        System.out.println("--------------------------------------------");
        // Give all the holidays left in the year

        LocalDate today = LocalDate.now();

        for (LocalDate eachDate : holidays()) {
            if (eachDate.isAfter(today)) {
                System.out.println(eachDate.format(formatter));
            }
        }

        System.out.println("--------------------------------------------");
        // Give the dates before and after each holiday

        for (LocalDate eachDate : holidays()) {
            System.out.println("\nBefore: " + eachDate.minusDays(1).format(formatter));
            System.out.println("Holiday: " + eachDate.format(formatter));
            System.out.println("After: " + eachDate.plusDays(1).format(formatter));
        }

        System.out.println("----------");

        System.out.println("Holidays in Summer");
        for (LocalDate holidaysInSummer : holidays()) {
            // We can print holidays based on seasons that way.Or we can create return methods and use them[same principle].
            if (holidaysInSummer.getMonthValue() > 5 && holidaysInSummer.getMonthValue() < 9) {
                System.out.println(holidaysInSummer.format(formatter));
            }

        }
        System.out.println("-----------");
        // #2 with custom method
        System.out.println("Holidays in Winter[custom method]");
        for (LocalDate winterHoliday : winterHolidays()) {
            System.out.println(winterHoliday.format(formatter));
        }

        System.out.println("----");
        System.out.println("Holidays in Spring");
        for (LocalDate date : springHolidays()) {
            System.out.println(date.format(formatter));
        }
    }
}

