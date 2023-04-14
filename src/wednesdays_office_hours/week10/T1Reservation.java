package wednesdays_office_hours.week10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T1Reservation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, would you like to make reservation at our Java restaurant\nPlease enter the year");
        int year = input.nextInt();
        System.out.println("Please enter the month");
        int month = input.nextInt();
        System.out.println("Please enter the day");
        int day = input.nextInt();
        System.out.println("Please enter the time(24h format)");
        int hour = input.nextInt();

        int minute = 0;
        input.close();

        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, 0); // we can pass minute variable as minute parameter

        //System.out.println(dateTime);


        if (dateTime.getYear() != 2023) {
            System.out.println("Sorry we cannot make a reservation for the year " + year);
            System.exit(0);
        }

        if (dateTime.isBefore(LocalDateTime.now())) {
            System.out.println("Sorry this date has already passed");
            System.exit(0);
        }

        if ((dateTime.getMonthValue() == 11 && dateTime.getDayOfMonth() == 23) || (dateTime.getMonthValue() == 12 && dateTime.getDayOfMonth() == 24)) {
            System.out.println("Sorry we are booked on that day");
            System.exit(0);
        }

        boolean validTime = dateTime.getHour() >= 14 && dateTime.getHour() <= 20;
        // 2023/4/13 18:00  thursday 4
        int dayInWeek = dateTime.getDayOfWeek().getValue();
        boolean onWeekend = dayInWeek == 5 || dayInWeek == 6 || dayInWeek == 7; // dateTime.getDayOfWeek().getValue() >= 5;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM/d/yy | h:mm a"); // #1


        if (validTime && onWeekend) {
            System.out.println("Booked for " + dateTime.format(DateTimeFormatter.ofPattern("MMM/d/yy | h:mm a"))); // #2 formatter
            //System.out.println("Booked for " + dateTime.format(DateTimeFormatter.ISO_DATE_TIME)); // #3 ready pattern

        } else {

            if (!validTime) {
                System.out.println("Sorry we only have time from 2pm to 8pm");
            }

            if (!onWeekend) {
                System.out.println("Sorry we only have availability on weekends");
            }

        }

    }
}