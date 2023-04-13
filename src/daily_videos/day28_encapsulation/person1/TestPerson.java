package daily_videos.day28_encapsulation.person1;

import java.time.LocalDate;

public class TestPerson {
    public static void main(String[] args) {

        //Person person1 = new Person("Rachel",34,'F', LocalDate.of(2023,5,5)); // instances will be set through setter !! Conditions we've created will be checked.

        //System.out.println(person1); // Birthday can not be after today's date

        Person person2 = new Person("Ross",21,'F',LocalDate.of(2020,1,1));
        System.out.println(person2);

        //person2.setGender('S'); // Gender can be only 'M' or 'F'

        //person2.setName(""); // Employee name can not be empty or blank


    }
}
