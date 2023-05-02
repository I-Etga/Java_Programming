package daily_videos.day33_abstraction.employeeTask;

public class Driver extends Employee {
    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {// shortcut:  generate ->implement methods
        System.out.println(getName() + " is driving ");
    }
}
