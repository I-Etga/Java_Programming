package daily_videos.day30_inheritanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee {
    public Teacher(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary); // comes automatically, when we generate constructor !
    }

    public void teach() {
        System.out.println(getName() + " is teaching");
    }
}
