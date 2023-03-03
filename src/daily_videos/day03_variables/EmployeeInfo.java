package daily_videos.day03_variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        String employeeName = "Etga";
        int age = 29;
        char gender = 'M';
        String companyName = "Cydeo",
                employeeId = "A19",             // how to declare more than one value from the same data Type at once.
                jobTitle = "Java Developer";
        int salary = 100000;
        boolean isFullTime = true;


        System.out.println(employeeName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(companyName);
        System.out.println(employeeId);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(isFullTime);


        System.out.println("*************");
                // soutv ---> this is the shortcut of the printing variable.

        System.out.println("employeeName = " + employeeName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("companyName = " + companyName);
        System.out.println("employeeId = " + employeeId);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);



    }
}
