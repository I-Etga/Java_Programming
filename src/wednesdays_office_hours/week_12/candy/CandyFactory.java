package wednesdays_office_hours.week_12.candy;

public class CandyFactory {
    public static void main(String[] args) {
        Candy candy = new Candy(350000, true);
        System.out.println(candy);

        Take5 take5 = new Take5(400000, false);
        System.out.println(take5);

        Twix twix = new Twix(1000000, false);
        System.out.println(twix);

        HersheyBar hersheyBar = new HersheyBar(300000);
        System.out.println(hersheyBar);

        HersheyKiss hersheyKiss = new HersheyKiss(600000);
        System.out.println(hersheyKiss);

        System.out.println("------------------------");
        Twix twix1 = new Twix(2, true);
        System.out.println(twix1);
        System.out.println(Candy.countryWithLargestCandyConsume);
        System.out.println(Twix.countryWithLargestCandyConsume);
        System.out.println(twix.containsPeanuts);

        Twix.countryWithLargestCandyConsume = "Canada"; // that affects all the Classes. Because it's static variable !!

        // I am accessing this variables from all the classes just to show they are inherited to all of them
        System.out.println(Candy.countryWithLargestCandyConsume);
        System.out.println(Twix.countryWithLargestCandyConsume);
        System.out.println(HersheyBar.countryWithLargestCandyConsume);
        System.out.println(HersheyKiss.countryWithLargestCandyConsume);

        // hq is not accessible in Candy or Twix
//        Candy.hq;
//        Twix.hq;
        System.out.println(HersheyBar.hq);
        System.out.println(HersheyKiss.hq);

        System.out.println();
        HersheyBar.hq = "Virginia";
        System.out.println(HersheyBar.hq);
        System.out.println(HersheyKiss.hq);

        HersheyBar hersheyBar1 = new HersheyBar(20);
        System.out.println(hersheyBar1);

        HersheyKiss hersheyKiss1 = new HersheyKiss(30);
        System.out.println(hersheyKiss1);

    }


}
