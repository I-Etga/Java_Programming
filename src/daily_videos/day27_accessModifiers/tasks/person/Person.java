package daily_videos.day27_accessModifiers.tasks.person;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numbeOfWings;
    public static int numbeOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numbeOfWings = 0;
        numbeOfHead = 1;
    }

    public static void printPlanetName() {
        System.out.println(planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", isHuman='" + isHuman + '\'' +
                ", numberOfHead='" + numbeOfHead + '\'' +
                ", numberOfWings='" + numbeOfWings + '\'' +
                '}';
    }
}
