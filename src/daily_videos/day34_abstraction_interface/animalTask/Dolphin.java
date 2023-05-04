package daily_videos.day34_abstraction_interface.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable {
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin " + getName() + " is eating fish");
    }

    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}
