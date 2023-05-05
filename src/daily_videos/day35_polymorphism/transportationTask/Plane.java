package daily_videos.day35_polymorphism.transportationTask;

import daily_videos.day34_abstraction_interface.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {
    public Plane( String model, String color, int year, double price) {
        super(model, color, year, price);
    }


       /*   As you can see , abstract classes can have abstract methods[methods have no body].
        So I don't implement abstract methods which are inherited from Transportation abstract class.*/

    public void land(){
        System.out.println("Plane " + getMake() + " " + getModel() + " " + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is flying");
    }
}
