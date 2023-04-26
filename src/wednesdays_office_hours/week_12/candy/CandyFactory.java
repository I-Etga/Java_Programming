package wednesdays_office_hours.week_12.candy;

public class CandyFactory {
    public static void main(String[] args) {
        Candy candy = new Candy("Ulker",350000,true);
        System.out.println(candy);

        Take5 take5 = new Take5(400000,false);
        System.out.println(take5);

        Twix twix = new Twix(1000000,false);
        System.out.println(twix);

        HersheyBar hersheyBar = new HersheyBar(300000,true);
        System.out.println(hersheyBar);

        HersheyKiss hersheyKiss = new HersheyKiss(600000,false);
        System.out.println(hersheyKiss);



    }
}
