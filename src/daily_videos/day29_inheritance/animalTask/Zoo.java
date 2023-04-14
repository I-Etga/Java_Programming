package daily_videos.day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',4,"Large","White");
        Cat cat = new Cat();
        cat.setInfo("Felicia","Stray",'F',3, "Medium","Black and White");
        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',5,"Large","Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("--------------");

        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.drink();
        tiger.sleep();

        System.out.println("--------------");

        dog.bark();
        //cat.bark(); // it's only for Dog class

        cat.meow();
       // dog.meow(); -> it's only for Cat class

        tiger.hunt();
        //dog.hunt();
        //cat.hunt();

        System.out.println("--------------");

        // Object Class = parents of all classes !!

        //System.out.println(dog.name);
        //System.out.println(dog.color); --> I have to use getter method(instances are private)

        //dog.gender = 'K';
        //dog.age = -100; -->  I have to use setter method(instances are private)

    }

}
