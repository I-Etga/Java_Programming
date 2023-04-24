package daily_videos.day31_InheritanceContinue.animal_methodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override // After that statement , if the compiler does not give error, then it means it, we have override the method successfully !!
    public void eat(){
        System.out.println("Cat " + getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " sleeps 12 hours in a day" );
    }

    //@Override --> gives error because it's a unique method !!
    public void scratch(){
        System.out.println("Cat " + getName() + " is scratching" );
    }

    /*
    If you call the Cat object, then hat eat method will get executed.
    However, if we call the Animal object, then the eat method of Animal obj will get executed !!

    #1 same TYPE , same PARAMETERS , same NAME
    #2 static, final , private NOT ALLOWED
    #3 access modifier of the overridden method needs to be same of more visible !! for example: public -> must be public --> Because it's the most visible access modifier !!

    ** if the parameters are different, name is same --> OVERLOADING !!
     */


}
