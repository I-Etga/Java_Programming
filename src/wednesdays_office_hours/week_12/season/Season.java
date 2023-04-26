package wednesdays_office_hours.week_12.season;

public class Season {
    public String name;
    public double highestAverageTemp, lowestAverageTemp;

    public Season(double highestAverageTemp, double lowestAverageTemp) {
        this.name = getClass().getSimpleName();
        this.highestAverageTemp = highestAverageTemp;
        this.lowestAverageTemp = lowestAverageTemp;
    }

    public void activity() {
        System.out.println("Do an activity");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverageTemp=" + highestAverageTemp +
                ", lowestAverageTemp=" + lowestAverageTemp +
                '}';
    }
}
