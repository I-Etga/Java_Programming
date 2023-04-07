package daily_videos.day25_cunstructors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {


    public String name, jobTitle;
    public int age;
    public char gender;
    public double salary; // public static double salary; (because of static all employees has same salary !!)
    public LocalDate hired_Date;

    public Employee(String name, String jobTitle, int age, char gender, double salary, LocalDate hired_Date) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hired_Date = hired_Date;

        /*

        If I use void setInfo method I would have to call that method every single time I created object.
        But constructor gets executed right away with creating a new object. No need another set method.

         We use constructor with parameter. So this is from now on mandatory to pass argument.
         Otherwise, we can't create any objects from this class.

         allows us to set all the instance variables of the object as soon as the object ıs created.*/
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", hired_Date=" + hired_Date.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }// allows us to print the object when it's passed in the print statement
}
