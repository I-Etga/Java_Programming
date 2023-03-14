package daily_videos.day16_loopsContinue;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (; condition;){
            System.out.println("Hello Cydeo --- For Loop");
        }

        System.out.println("----------\n");

        while (condition){
            System.out.println("Hello Cydeo --- While Loop");
        }

        System.out.println("-----------\n");

        System.out.println("DoWhile is false even in the very beginning!\n");

        do {
            System.out.println("Hello Cydeo --- DoWhile Loop*While condition is false\n");
        }while (condition);

        System.out.println(" ***DoWhile true at least once****\n");

        int i = 5;
        do {
            System.out.println("Hello Cydeo --- DoWhile Loop*While ");
            i--;
        }while (i>0);

        /*
                As you can see, unlike for and while loops;
        doWhile loops GET EXECUTED AT LEAST ONCE even condition of while is false!
                        ##regardless of while condition##

       It runs until while condition is false. Then DoWhile loop stops running !!

         */






    }
}
