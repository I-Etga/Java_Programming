package daily_videos.day34_abstraction_interface.tasks.carTaskAbstrct;

import java.time.LocalDate;

public class Tesla extends Car implements AutoPilot, AutoPark {
    public Tesla(String make, String model, double price, String color, LocalDate year) {
        super(make, model, price, color, year);
    }

    /*  Tesla concrete class and can have no abstract method !![no body method]
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
