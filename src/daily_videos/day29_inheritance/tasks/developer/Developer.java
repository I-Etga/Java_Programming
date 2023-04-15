package daily_videos.day29_inheritance.tasks.developer;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {

    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private double salary;

    private String programmingLanguage;

    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary, String programmingLanguage) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("Gender can be only 'M' or 'F' ");
            System.exit(1);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid age. Age can not be negative");
            System.exit(1);
        }

        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Age must be between 18 and 65");
            System.exit(1);
        }
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary can not be negative");
            System.exit(1);
        } else {
            this.salary = salary;
        }
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

        if (languages.contains(programmingLanguage)) {
            this.programmingLanguage = programmingLanguage;
        } else {
            System.out.println("Programming Language can be only one of them: \"Java\", \"JavaScript\", \"Python\", \"Ruby\", \"C#\", \"C++\", \"Swift\"");
            System.exit(1);
        }
    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
