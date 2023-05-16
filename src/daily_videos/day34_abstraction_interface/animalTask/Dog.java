package daily_videos.day34_abstraction_interface.animalTask;

public class Dog extends Animal implements Playable {
    // We use implements keywords to implement the interface to this Class.


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void sleep() {
        System.out.println("Dog " + getName() + " is eating dog food");
    }

    /*  After implements keyword, I get compiler error.
        Our Class is regular class, not abstract. In regular Classes every method MUST have body in regular class.
        I don't want to make my Class abstract, because that would make NO sense. I want to create objects.
        So I implement/override the abstract methods of interface in regular Class [there is a shortcut: generate-> implements methods]

    */


    @Override
    public void play() {

    }
}
