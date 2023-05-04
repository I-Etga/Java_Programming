package daily_videos.day34_abstraction_interface.animalTask;

public class Parrot extends Animal implements Playable, Flyable {
    // Class can implement different abstract classes !!

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void sleep() {
        System.out.println("Parrot " + getName() + " is eating seeds");
    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {

    }
}
