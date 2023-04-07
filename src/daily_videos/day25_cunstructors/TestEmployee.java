package daily_videos.day25_cunstructors;

import java.time.LocalDate;

public class TestEmployee {

    public static void main(String[] args) {

        // Do NOT forget that every object have own memory(instance variables and methods). So e2 does not affect e1 !!
        Employee e1 = new Employee("Ted Mosby", "Developer", 45, 'M', 95000, LocalDate.of(2022, 12, 01));

        System.out.println(e1);

        Employee e2 = new Employee("Barney Stinson", "Tester", 45, 'M', 110000, LocalDate.of(2020, 6, 8));

        System.out.println(e2);


    }

}
