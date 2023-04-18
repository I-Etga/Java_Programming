package sundays_live_sessions.week_10.books;

public class EBook extends Book{

    private double size;
    private boolean onKindle;

    public void open(){

    }

    public EBook(double size, boolean onKindle) {
        setSize(size);
        setOnKindle(onKindle);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isOnKindle() {
        return onKindle;
    }

    public void setOnKindle(boolean onKindle) {
        this.onKindle = onKindle;
    }
}