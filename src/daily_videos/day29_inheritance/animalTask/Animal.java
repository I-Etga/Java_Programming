package daily_videos.day29_inheritance.animalTask;

public class Animal { // Parent class should contain only common variables and methods !!

    // Benefit of inheritance --> We don't have to write those 100 line of code in subclasses named Dog,Cat,Tiger thanks to extends keyword ...

    // Even Animal(Parent/Super Class) has a super class. --> Object Class !! it inherits implicitly !! [go to generate and then to Override Methods and see ]

    // private variables and methods CAN NOT BE INHERITED. But getter and setter can be and through those methods we can access and write !!

    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public static boolean isAnimal;

    static {
        isAnimal = true;
    }

    public void setInfo(String name, String breed, char gender, int age, String size, String color) { // So I can check if all the variables set based on condition.
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);

    }


    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return getClass().getSimpleName() + "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
