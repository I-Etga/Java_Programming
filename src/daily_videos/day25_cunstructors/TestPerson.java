package daily_videos.day25_cunstructors;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Monica Geller", 'F', LocalDate.of(1987, 05, 12), false, true);

        System.out.println(person1);
    }
}
