package daily_videos.day26_statics.tasks.person;

public class Person {

    // instances belong to the object/
    public String name;
    public int age;
    public String language;
    public char gender;

    public static boolean isHuman ; // I can initialize it here. But, it does not work for all variables![better choose: static block]
    public static boolean hasNose;
    public static boolean hasWings;
    public static int numberOfHead;
    public static int numberOfEyes ;


    static {  // statics belong to the Class
        isHuman = true;
        hasNose = true;
        hasWings = false;
        numberOfHead = 1;
        numberOfEyes = 2;
    }

        // CONSTRUCTOR CAN NOT CALL #1 ITSELF AND #2 MORE THAN ONE CONSTRUCTOR !!
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

    public Person(String name, String language,int age, char gender) {
        this(name, language, age);
        this.gender = gender;
    }

    public void eat(String food) {
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
                '}';
    }
}