package daily_videos.day27_accessModifiers.tasks.dog;

public class Dog {

    public String name;
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;
    public boolean isFriendly;
    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;

    public Dog(String name, String breed, String size, char gender, int age, String color, boolean isFriendly) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
        this.isFriendly = isFriendly;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void play() {
        System.out.println(name + "is playing");
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isFriendly=" + isFriendly +
                ", numberOfLegs=" + numberOfLegs +
                ", numberOfWings=" + numberOfWings +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
