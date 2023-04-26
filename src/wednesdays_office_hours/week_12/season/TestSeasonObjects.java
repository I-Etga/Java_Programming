package wednesdays_office_hours.week_12.season;

public class TestSeasonObjects {
    public static void main(String[] args) {

        Season season = new Season(9, -14);
        season.activity();
        System.out.println(season);


        Winter winter = new Winter(9, -14);
        winter.activity();
        System.out.println(winter);

        Fall fall = new Fall(10, 3);
        fall.activity();
        System.out.println(fall);

        Summer summer = new Summer(32, 24);
        summer.activity();
        System.out.println(summer);

        Spring spring = new Spring(18, 7);
        spring.activity();
        System.out.println(spring);


    }
}
