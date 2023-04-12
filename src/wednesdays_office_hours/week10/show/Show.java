package wednesdays_office_hours.week10.show;

import java.util.ArrayList;

public class Show {

    public String name;
    public int seasons;
    public boolean isCompleted;
    public ArrayList<String> audioLanguagesAvailable;


    public Show(String name, int seasons, boolean isCompleted) {
        this.name = name;
        this.seasons = seasons;
        this.isCompleted = isCompleted;
    }

    public Show(String name, int seasons, boolean isCompleted, ArrayList<String> audioLanguagesAvailable) {
        this.name = name;
        this.seasons = seasons;
        this.isCompleted = isCompleted;
        this.audioLanguagesAvailable = new ArrayList<>(audioLanguagesAvailable);
    }

    public String completed(boolean isCompleted) {
        String message = "";
        if (isCompleted) {
            message = "finished";
        } else {
            message = "ongoing";
        }
        return message;
    }

    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                ", seasons=" + seasons +
                ", isCompleted=" + completed(isCompleted) +
                ", audioLanguagesAvailable=" + audioLanguagesAvailable +
                '}';
    }
}

