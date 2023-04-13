package daily_videos.day28_encapsulation.employee;

public class TestEmployeeObjects {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Khashayar",43,"Developer",45000);

      /*  //employee1.salary = -20000 --> no access private variables outside class !! (We have to use get to read )

        employee1.setSalary(100000);

        System.out.println(employee1.getSalary());

        //employee1.setName("    "); // error: Employee name can not be empty or blank

        System.out.println(employee1.getName()); // print "Unknown".Because name has not been set yet!
        */

        //Employee employee2 = new Employee("Rachel",32,"Developer",-100000); // Salary can not be negative: -100000.0 [set methods check if given arguments are valid or not !]

        System.out.println(employee1); // all the given arguments are valid, then it prints all of them .
    }
}
