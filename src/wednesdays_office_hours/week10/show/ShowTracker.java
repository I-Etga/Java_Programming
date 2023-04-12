package wednesdays_office_hours.week10.show;

import java.util.ArrayList;

public class ShowTracker {

    public String username;
    public String password;
    public int numberOfShowsWatched;
    public ArrayList<Show> trackedShows;

    public ShowTracker(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public ShowTracker(String username, String password, int numberOfShowsWatched) {
        this(username, password);
        this.numberOfShowsWatched = numberOfShowsWatched;
    }

    public ShowTracker(String username, String password, int numberOfShowsWatched, ArrayList<Show> trackedShows) {
        this(username, password, numberOfShowsWatched);
        this.trackedShows = new ArrayList<Show>(trackedShows);
    }

    public void trackShow(Show show) {

        if (!trackedShows.contains(show)) {
            trackedShows.add(show);
        }
    }

    public ArrayList<Show> filter(String str) {
        ArrayList<Show> filtered = new ArrayList<>(trackedShows);
        filtered.removeIf(p -> !p.audioLanguagesAvailable.contains(str));
        return filtered;
    }

    public ArrayList<Show> filter(boolean a) {
        ArrayList<Show> filtered = new ArrayList<>(trackedShows);
        if (a) {
            filtered.removeIf(p -> !p.isCompleted);
        } else {
            filtered.removeIf(p -> p.isCompleted);
        }

        return filtered;
    }


    public String toString() {
        return "ShowRefactor{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", numberOfShowsWatched=" + numberOfShowsWatched +
                ", trackedShows=" + trackedShows +
                '}';
    }
}
