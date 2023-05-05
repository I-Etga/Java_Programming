package daily_videos.day33_abstraction.employeeTask;

public class Developer extends Employee {

    // If I don't want to override the abstract method, I have to convert my regular class to abstract class.
    // But I can't create any object of abstract class. So that makes any sense for a child class !!
    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);
        this.programmingLanguage = programmingLanguage;
    }

    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in " + programmingLanguage);
    }

    @Override
    public String toString() {// shortcut:  generate ->implement methods
        return super.toString().replace("}", "") +
                "programming language=" + programmingLanguage + "}";
    }
}
