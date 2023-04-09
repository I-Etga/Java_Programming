package daily_videos.day24_arrayListContinue_LocalDateTime;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);

        LocalDate birthday = LocalDate.of(2000,5,25);

        System.out.println(birthday);


        System.out.println(today.getYear()); // 2023 (current year)

        System.out.println(today.getMonth());// It prints now April. But, if I run next month, it prints may.

        System.out.println(today.getMonthValue()); // number of current month (now April so 4)


        System.out.println(today.getDayOfWeek());
        System.out.println(birthday.getDayOfWeek()); // 05.25.2000 thursday !
        System.out.println(birthday.getDayOfMonth()); // 25th day of month
        System.out.println(birthday.getDayOfYear()); // 05.25.2000 thursday ! It's 146th day of year

        System.out.println(today.getDayOfYear()); // today is 94th day of year (4/4/2023)



        today.plusYears(1); // It'll return new localdate object. It does not change our old object.
        // Because it's immutable. We have to assign it to our old object back. (same principle with Strings)

        System.out.println(today); // 2023-04-04

        today = today.plusYears(1); // [2024-04-04]
        System.out.println(today);

        System.out.println("*********");

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate = graduationDate.plusYears(2);  // 2027-06-04(graduationDate is updated after re-assigning)

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7); // 2028-01-04

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7); // 2028-02-22
        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(94);
        System.out.println(graduationDate);

        System.out.println("*********");

        LocalDate yourBirthday = LocalDate.of(2005,4,1);

        yourBirthday = yourBirthday.minusYears(2).minusMonths(3); // 2003-01-01
        System.out.println(yourBirthday);

        System.out.println("*********");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1994,7,7);

        boolean b1 = birthday1.equals(birthday2);
        System.out.println(b1);

        System.out.println("*********");

        LocalDate grad_date = LocalDate.of(2023,1,1);

        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31))); // false
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31))); // true

        System.out.println("*********");

        System.out.println(LocalDate.of(2024,6,16).isLeapYear()); // true
        // leap year means February has 29 days !!



    }
}
