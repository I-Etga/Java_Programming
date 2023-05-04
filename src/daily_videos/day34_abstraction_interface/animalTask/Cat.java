package daily_videos.day34_abstraction_interface.animalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " is eating cat food");
    }
}
