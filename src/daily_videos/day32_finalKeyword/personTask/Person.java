package daily_videos.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;

    private final int age; // if I initialize that every object of that class have the same age variable and I can not change it !!
    private final LocalDate dateOfBirth;

    public Person(String name, char gender, LocalDate dateOfBirth) { // without constructor, final variables give error.Because final variables have to be set BEFORE the object's created.
        setName(name);
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender. Gender can be only 'M' OR 'F' ");
            System.exit(1);
        }
        this.gender = gender;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();

        this.dateOfBirth = dateOfBirth;
    }

    private static final int numberOfHead;

    static {
        numberOfHead = 1;
    }



    //Final variables can't have set method. Because finals are unchangeable !!

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) { // Generator gives only one option which is the non-final instance variable.
        this.name = name;
    }
    /*
    public void setGender(char gender){ // You can not generate setter for the final variables.
        this.gender = gender;
    }*/


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }


    public final void breath() { // to make sure that this implementation will not change for any sub class
        System.out.println(name + " is breathing");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
