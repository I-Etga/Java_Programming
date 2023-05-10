package wednesdays_office_hours.week_14.movies;

public abstract class StreamingSite implements PlayMovie, HasSubscription {


    public String url;
    public int subscriptionAmount,moviesAvailable;

    public StreamingSite(String url, int subscriptionAmount, int moviesAvailable) {
        this.url = url;
        this.subscriptionAmount = subscriptionAmount;
        this.moviesAvailable = moviesAvailable;
    }

    public abstract void pause();
}
