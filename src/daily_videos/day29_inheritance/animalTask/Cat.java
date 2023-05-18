package daily_videos.day29_inheritance.animalTask;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating " );
    }

    @Override
    public void drink() {
        System.out.println("Cat " + getName() + " is drinking water " );
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " is sleeping " );
    }

    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    public void scratch(){
        System.out.println(getName() + " is scratching ");
    }

}
