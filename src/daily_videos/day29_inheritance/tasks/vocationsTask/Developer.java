package daily_videos.day29_inheritance.tasks.vocationsTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Vocation_superClass {

    private String programmingLanguage;

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
        System.out.println(getName() + " is coding");
    }

}
