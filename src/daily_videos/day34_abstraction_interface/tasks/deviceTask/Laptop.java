package daily_videos.day34_abstraction_interface.tasks.deviceTask;

public class Laptop extends Computer implements Downloadable {
    public Laptop(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is turning off");
    }

    @Override
    public void downloadApp() {
        System.out.println("Laptop app downloading");
    }
}

/*

abstraction : abstract class & interface [there is no another option]

abstract methods in an interface

#1 abstract class implements interface --> do I have to implement those abstract methods ? NO
Because abstract classes can have abstracts methods.

#2 interface extends interface --> do I have to implement those abstract methods ? NO
Because implement can have abstracts methods.

#3 concrete/regular classes extends abstract class or/and interface with abstract methods in it --> do I have to implement those abstract methods ? YES
Because concrete class can NOT have abstracts methods.
We have to implement those abstract methods in order to do inheritance/


 */