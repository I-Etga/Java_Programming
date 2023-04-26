package wednesdays_office_hours.week_12.season;

public class Spring extends Season {
    public Spring(double highestAverageTemp, double lowestAverageTemp) {
        super(highestAverageTemp, lowestAverageTemp);
    }

    @Override
    public void activity() {
        System.out.println("Go outside");
    }
}
