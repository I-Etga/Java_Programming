package daily_videos.day04_concatenation;

public class EmployeeInfo {
    public static void main(String[] args) {

        String name = "Daniel";
        int age = 28;
        String gender = "Male";
        String company_name = "Google Inc";
        String jobTitle = "Software Developer";
        int salary = 90_000;

        System.out.println("\t" + name + " is " + age + " years old, gender is " + gender );
        System.out.println("\t" + name + " works at " + company_name + " as a " + jobTitle );
        System.out.println("\t" + name + " makes $" + salary + " per year." );
    }
}
