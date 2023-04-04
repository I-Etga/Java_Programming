package daily_videos.day24_arrayListContinue;

import java.time.LocalDate;
import java.time.LocalTime;

public class Person {

    public String name ;
    public  int age ;
    public char gender;
    public LocalDate dateOfBirth ;


    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        age = LocalDate.now().getYear()-dateOfBirth.getYear();
        // We do NOT have local variable named age (inside setInfo method ). So we don't have to use this.age = ...
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}



