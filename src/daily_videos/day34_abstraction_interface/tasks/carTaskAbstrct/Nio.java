package daily_videos.day34_abstraction_interface.tasks.carTaskAbstrct;

import java.time.LocalDate;

public class Nio extends Car implements AutoPark, AutoPilot {
    //A class can extend only one other class,implement any number of interfaces.
    //As you can see , interface can extend any number of interfaces.

    public Nio(String make, String model, double price, String color, LocalDate year) {
        super(make, model, price, color, year);
    }

    /*  Nio public class and can have no abstract method !![no body method]
          ---> So I have to implement abstract methods if I extend an Abstract Class or implement interface !!
          Class can implement multiple interfaces
                       */

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void autoPark() {

    }
}
