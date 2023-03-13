package daily_videos.day15_LoopsContinue;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            /*
             if i's value reaches 6, break exits the loop
            So it prints until 6(not inclusive)
             */
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("****************");

        for (char i = 'A'; i < 'Z'; i++) {
            System.out.println(i); // prints A-Z
            /*
             it will be terminated right away.
             The codes come after break WON'T GET EXECUTED.
             but the codes come before break will get executed.
             (even if condition is true)/- in this case 'J' will be printed.
             */
            if (i == 'J') {
                System.out.println("Loop is terminated!");
                break;
                // System.out.println("Loop is terminated!)--[compiler give error!]
            }
        }


        System.out.println("************");

        for (; ; ) {//Without break statement this for loop is infinite.
            System.out.println("Hello");
            break;
            /*
            So if I write a code after break,
            Compiler fails. (unreachable statement)
            I have to remove or turn it comment
            System.out.println("World");
             */
        }
    }
}
