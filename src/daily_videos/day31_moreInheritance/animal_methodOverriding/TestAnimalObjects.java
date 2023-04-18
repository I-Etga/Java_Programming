package daily_videos.day31_moreInheritance.animal_methodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {

        Cat cat = new Cat("Emily","Bengle",'F',4,"Small","Gray");

        Dog dog = new Dog("Max","Husky",'M',3,"Large","White");

        Lion lion = new Lion("Simba","African Lion",'M',6,"Large","Yellow",true);

        Eagle eagle = new Eagle("Bella","Amarican Eagle",'F',4,"Medium","Black & White");


        System.out.println("**** *****");

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion); // We've also overridden toString method !!
        System.out.println(eagle);

        //          same eat() method but every child class has overridden it and implemented something unique for it.
        cat.eat(); // Cat Emily is eating cat food

        dog.eat(); //Cat Emily is eating cat food

        lion.eat(); // Lion Simba is eating lion food

        eagle.eat(); // Eagle Bella is eating snake

        System.out.println("**** *****");

        cat.sleep(); // Cat Emily sleeps 12 hours in a day [ sleep method is overridden !!]

        dog.sleep(); // Max is sleeping [not overridden]

        lion.sleep(); // Simba is sleeping [not overridden]

        eagle.sleep(); // Bella is sleeping [not overridden]s



    }
}
