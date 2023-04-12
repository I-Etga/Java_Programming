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
        trackedShows = new ArrayList<>();
    }

    public ShowTracker(String username, String password, int numberOfShowsWatched) {
        this(username, password);
        this.numberOfShowsWatched = numberOfShowsWatched;
    }

    public ShowTracker(String username, String password, int numberOfShowsWatched, ArrayList<Show> trackedShows) {
        this(username, password, numberOfShowsWatched);
        this.trackedShows.addAll(trackedShows);//new ArrayList<Show>(trackedShows); [bad practice. New obj in the first constructor (line15)]
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

    public ArrayList<Show> filter(boolean isFinished) {
        ArrayList<Show> filtered = new ArrayList<>(trackedShows);
        if (isFinished) {
            filtered.removeIf(p -> !p.isCompleted);
        } else {
            filtered.removeIf(p -> p.isCompleted);
        }

        return filtered;
    }


    public String toString() {
        return "Logged into " + username + " | Number of shows tracked: " + numberOfShowsWatched + "\nShows: " + trackedShows;
    }
}
