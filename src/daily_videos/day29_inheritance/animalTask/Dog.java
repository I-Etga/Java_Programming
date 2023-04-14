package daily_videos.day29_inheritance.animalTask;

public class Dog extends Animal{
    //      #Child        #Parent
   /* public void method(){ // the variables come from Animal class with keyword extends !! (But it's the attributes of Dog class now)
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();
        //bark(); Animal class does not have bark() method. So it's not inherited ! So I have to define in order to use !!*/

    public void bark(){
        System.out.println(getName() + " is barking");
    }
}
