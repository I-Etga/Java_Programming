package daily_videos.day35_polymorphism.transportationTask;

import daily_videos.day34_abstraction_interface.animalTask.Flyable;
import daily_videos.day34_abstraction_interface.animalTask.Swimmable;

public class CydeoCar extends Car implements Flyable, Electric, AutoPilot, Swimmable {
    //One Class can implements multiple interfaces. That's the only way for multiple inheritance in Java.
    public CydeoCar(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }
}
