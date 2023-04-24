package daily_videos.day31_InheritanceContinue.animal_methodOverriding;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    // What's the point of Overriding ? --> LESS MEMORY USAGE !!
    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating dog food");
    }


    public void bark(){
        System.out.println("Dog " + getName() + " is barking");
    }
}
