package daily_videos.day34_abstraction_interface.animalTask;

public class Tiger extends Animal implements WildAnimal {
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void sleep() {
        System.out.println("Tiger " + getName() + " is eating");
    }

    @Override
    public void hunt() {

    }
}
