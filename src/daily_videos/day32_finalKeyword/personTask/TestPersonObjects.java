package daily_videos.day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person = new Person("Daniel", 'M', LocalDate.of(1991, 1, 25));

        System.out.println(person);

        //person.setAge(34) we can't generate setter method for the final variables !!

        System.out.println("-----------");

        Employee employee = new Employee("Emily", 'F', LocalDate.of(1989, 2, 5), "Accountant", 900000);

        // We have only three set methods. Because only these variables are not final !!
        employee.setSalary(100000);
        employee.setName("Karim");
        employee.setJobTitle("Developer");

        System.out.println(employee);

        employee.breath();
    }
}
