package wednesdays_office_hours.week_14.movies;

public abstract class StreamingSite implements PlayMovie, HasSubscription {


    public String url;
    public double subscriptionAmount;
    public int moviesAvailable;

    public StreamingSite(String url, double subscriptionAmount, int moviesAvailable) {
        this.url = url;
        this.subscriptionAmount = subscriptionAmount;
        this.moviesAvailable = moviesAvailable;
    }

    public abstract void pause();
}
