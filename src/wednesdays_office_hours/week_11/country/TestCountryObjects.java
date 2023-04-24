package wednesdays_office_hours.week_11.country;

public class TestCountryObjects {
    public static void main(String[] args) {
        Country germany = new Country("Germany",80000000,"Europa");

        System.out.println(germany);

        Country turkey = new Country("Turkey",82000000,"Turkey");

        System.out.println(turkey);


        System.out.println("***** *****");

        turkey.population = 83000000;

        germany.name = "Deutschland";

        System.out.println(germany);
        System.out.println(turkey);

        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation);
        System.out.println(Country.worldCo2Level);
        System.out.println();
        Country.countryInfo();

        //Country.name; name is an instance variable so it cannot be accessed in a static way

        Country us = new Country("US", 350, "North America");
    }
}
