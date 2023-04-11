package daily_videos.day28_encapsulation.person;

public class Person {

    // instances belong to the object/
    public String name; // If I create that variable static, all object's names will be last objects name.
    public int age;
    public String language;
    public char gender;

    public static String planet;
    public static boolean isHuman; // I can initialize it here. But, it does not work for all variables![better choose: static block]
    public static boolean hasNose;
    public static boolean hasWings;
    public static int numberOfWings;
    public static int numberOfHeads;

    static {  // statics belong to the Class
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfHeads = 1;
        numberOfWings = 0;
    }

    // CONSTRUCTOR CAN NOT CALL #1 ITSELF AND MORE THAN #2 ONE CONSTRUCTOR !!
    public Person(String name) { // Allows us to create Person object just by setting name
        this.name = name;
    }

    public Person(String name, int age) {// Allows us to create Person object just by setting name and age
        this(name);
        this.age = age;
    }

    public Person(String name, String language) {  // Allows us to create Person object just by setting name and language
        this(name);
        this.language = language;
    }

    public Person(String name, int age, char gender) {// Allows us to create Person object just by setting name,age,gender
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, String language, int age) {// Allows us to create Person object just by setting name,age,language
        this(name, language);
        this.age = age;

    }

    public Person(String name, int age, String language, char gender) {// Allows us to create Person object just by setting name,age,language,gender
        this(name, age, gender);
        this.gender = gender;
    }

    // NOW METHODS (instances methods accepts static variables BUT static methods accepts ONLY STATICS!!)
    // HOWEVER, static is so much faster. So I should use static method, if I  use only static variables!
    public static void printPlanetName() {
        System.out.println( "Planet name is " + planet);
    }

    public void eat(String food) { // must be instance method. Because we use instances(name) in this method !
        System.out.println(name + " eats " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " drinks " + drink);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", language='" + language + '\'' +
                ", gender=" + gender +
                ", planet=" + planet +
                '}';
    }
}