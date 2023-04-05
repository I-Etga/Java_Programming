package daily_videos.day24_arrayListContinue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person = new Person();

        person.setInfo("Jannice", 'F', LocalDate.of(1978, 4, 12));

        System.out.println(person); // toString method is called implicitly !


        Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
        people[0].setInfo("Jannice", 'F', LocalDate.of(1978, 4, 12));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(person));

        for (Person person1 : studentList) {
            System.out.println(person1.name + " " + person1.age);
        }

        //remove all the person object that has the age > 55
    }
}
