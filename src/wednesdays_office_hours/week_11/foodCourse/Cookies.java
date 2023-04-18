package wednesdays_office_hours.week_11.foodCourse;

public class Cookies extends FoodCourse {

    private int numberOfCookies;

    public Cookies(String name, double price, int numberOfCookies) {
        super(name, price);
        this.numberOfCookies = numberOfCookies;
    }

    public int getNumberOfCookies() {
        return numberOfCookies;
    }

    public void setNumberOfCookies(int numberOfCookies) {
        this.numberOfCookies = numberOfCookies;
    }


}
