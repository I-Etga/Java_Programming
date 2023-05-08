package daily_videos.day31_inheritanceContinue.tasks.employee;

import daily_videos.day31_inheritanceContinue.tasks.studentTask.Person;

public class EmployeeTestObjects {

    public static void main(String[] args) {

        // #Look at the diagram !! It's important

        // There is only one age condition. [parent class of Employee]
        Person person = new Person("Karen", 17, 'F');
        System.out.println(person);

        // There is additional age condition (setAge() -> I override it !! really import). [parent class of Tester,Developer,Teacher,Driver]
        Employee employee = new Employee("Rachel", 18, 'F', "CA72318", "Cassier", "Migros", 45000);
        System.out.println(employee);


        Tester tester = new Tester("Ibrahim", 24, 'M', "QA9825", "Tester", "DB", 900000);
        System.out.println(tester);


        Developer developer = new Developer("Monica", 26, 'F', "DEV63521", "Developer", "Rewe", 100000, "Java");
        System.out.println(developer); // developer.toString()


        Teacher teacher = new Teacher("Muhtar", 42, 'M', "INS7309", "Instructor", "Cydeo", 150000);
        System.out.println(teacher);


        Driver driver = new Driver("Rashid", 30, 'M', "DR2312", "Driver", "Taxi House", 80000);
        System.out.println(driver);

    }

}
