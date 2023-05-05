package daily_videos.day34_abstraction_interface.animalTask;

public class Duck extends Animal implements Playable, Swimmable,Flyable {
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void sleep() {
        System.out.println("Duck " + getName() + " is eating worm");
    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
