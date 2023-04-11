package daily_videos.day27_accessModifiers.staticContinue;

public class InstanceInitializationBlock {

    public String name;
    public  int age;
/*
    {   // initializationBlock
        //it gets executed for every single object
        name= "James"; // default name
        age = 20; // default age
    }
    However this is not a good practice ! We should use only we need default values.
    */

    public InstanceInitializationBlock(String name, int age) { // the best way to initialize the instances variables.
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James",25);


        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aeron",28);

        System.out.println(obj1.name);
    }
}
