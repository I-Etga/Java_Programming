package daily_videos.day27_accessModifiers.staticContinue;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    // We can initalize the schoolName here(= "Cydeo School";), but it's NOT possible all variable.
    // Because in order to initialize that kind of variable, we have to use block of code(multiple steps).
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        /*
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";

         What is the disadvantages of the initialization of static in Constructor ?

         If you create 15 objects of CydeoStudent , static variables are also 15 times initialized!
         But we just want to set them only once ! That's enough because they're static variable.
         */

    }

    static { // static block get executed first and only once.
        // Regardless of how many objects we create, those two static variables will be set only once.
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
