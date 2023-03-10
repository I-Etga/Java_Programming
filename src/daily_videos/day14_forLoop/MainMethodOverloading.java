package daily_videos.day14_forLoop;

public class MainMethodOverloading {
            // ********ONLY THE REAL MAIN METHOD CAN JAVA FILE RUNNABLE ******
    public static void main(String[] args) {
        /*
                 if you want to see which the real main method is;
                look at the green run symbol right after number of line!

                the real main method is s system method.
                but the others are custom methods.

        You can overload main method as much as you want. But you are NOT supposed to do that.
            Because even if you overload main method, YOU CANT USE EXCEPT THE ORIGINAL ONE !!

            S0, it's not impossible or illegal BUT there is no point of it/ completely useless !!
         */
        System.out.println("A");

        // you can call the custom main methods anyway !
        main(new int[]{25}); //B
        main(new double[]{2.05}); //C
        main(new boolean[]{true}); //D

    }

    public static void main(int[] args) {
        System.out.println("B");
    }

    public static void main(double[] args) {
        System.out.println("C");
    }

    public static void main(boolean[] args) {
        System.out.println("D");
    }
}
