package daily_videos.day28_encapsulation.employee;

public class Employee {
    //Encapsulation is only for private && instances !!

    private String name;
    private int age;
    private String jobTitle;
    private double salary;

    // For private instances constructor must contains set methods of that private instances !! Otherwise, we get error !
    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        // this.age = age; -> We can use this statement instead of setAge(age), if there is no additional code inside setAge method!!
        setAge(age); // age <16
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    // get and set methods must be PUBLIC. Otherwise, we can not access the variables.
    // That's the main goal of getter and setter (there is no point of making them private)
    // ** We don't have to call setMethod always. Because constructor also must be public. And that allows use to access private variables in the class.

    public String getName() {
        if (name == null) {
            name = "Unknown";   //#1
            //return "Unknown"; #2
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Job title of the employee can not be empty !");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() { // if I want to read salary(private) , this is the only way
        return salary;
    }

    public void setSalary(double salary) { // if I want to read salary(private) , this is the only way

        if (salary < 0) {
            System.err.println("Salary can not be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
