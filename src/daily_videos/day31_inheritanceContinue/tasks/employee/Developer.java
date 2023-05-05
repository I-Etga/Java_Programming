package daily_videos.day31_inheritanceContinue.tasks.employee;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String id, String jobTitle, String companyName, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, companyName, salary);
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
        System.out.println(getJobTitle() + " is coding in " + programmingLanguage);
    }
}

