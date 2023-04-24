package wednesdays_office_hours.week_11.country;

public class Country {

    public String name;
    public int population;

    public String continent;


    public static String planet;
    public static double worldPopulation;
    public static double worldCo2Level;

    static {

        planet = "Earth";
        worldPopulation = 7.88;
        worldCo2Level = 417.83;
    }


    public Country(String name, int population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public static void countryInfo(){
        System.out.println(planet);
        System.out.println(worldPopulation + " billion");
        System.out.println(worldCo2Level + " ppm");
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population + " billion " +
                ", continent='" + continent + " per million " + '\'' +
                '}';
    }
}
