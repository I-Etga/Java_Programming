package daily_videos.day30_inheritanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class Student extends Person {

    private char grade;
    private String studentId;

    public void study() {

    }

    /*
    If there is no created constructor with parameter, compiler puts a default constructor in superClass.
    And in subclass we don't have to create or call constructor.

    But If we create constructor with parameter in superClass, then we MUST call superClass constructor in subclass.
    -- > through super keyword !!

    When we generate constructor with shortcut, intelliJ call the superClass constructor automatically !!(line 24)

    */
    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB); // comes automatically !! super class constructor
        this.grade = grade;
        this.studentId = studentId;
    }
}
