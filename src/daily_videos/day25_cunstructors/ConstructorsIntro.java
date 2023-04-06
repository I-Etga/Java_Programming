package daily_videos.day25_cunstructors;

public class ConstructorsIntro {
        //Constructor only get executed when  object is created.
    public ConstructorsIntro() {
        System.out.println("Object is created by using no argument constructor");
    }
    //overloading method
    public ConstructorsIntro(int a) {
        System.out.println("Object is created by using int argument constructor");
    }

    public void add() {

    }

    public static void main(String[] args) {

        new ConstructorsIntro();
        // everytime I use new ConstructorsIntro() , it will be executed. (automatically)

        ConstructorsIntro obj1 = new ConstructorsIntro(10);
        ConstructorsIntro obj2 = new ConstructorsIntro(10);
        ConstructorsIntro obj3 = new ConstructorsIntro(10);

        //CunsructorsIntro obj4 = new CunsructorsIntro("Java"); -compiler error (no such a constructor with string arg)


    }
}

/*
 public CunsructorsIntro(int a) {
        System.out.println("Object is created by using default constructor");
    }

    If we at the first beginning define that ONE or BOTH of constructor w/ or w/o parameter,
    compiler does NOT define automatically constructor.

    In case we don't define any constructor , then compiler defines default constructor !
 */
