package daily_videos.day33_abstraction.employeeTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    // If the child class is abstract class , I don't have to override the abstract method.
    //However, regular class can't have method with no body method(abstract method !!)
    // That's why we have to convert the abstract method to regular method [by overriding -- there is special shortcut > generate ->implement methods]!!

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
