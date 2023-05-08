package daily_videos.day31_inheritanceContinue.tasks.employee;


import daily_videos.day31_inheritanceContinue.tasks.studentTask.Person;

public class Employee extends Person {

    private String id, jobTitle, companyName;
    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, String companyName, double salary) {
        super(name, age, gender);
        setAge(age); // it's overridden version of setAge(). -->If I don't call it, I can't implement the new condition on setting variable !!
        setId(id);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    @Override
    public void setAge(int age) {
        if (age < 18) {
            System.err.println("Age can not be less than 18");
            System.exit(1);
        }
        super.setAge(age); // without it, I can't set it. Because variable is private and belongs to parent class.
    }

    public void work() {
        System.out.println(getName() + " is working");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                "id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
