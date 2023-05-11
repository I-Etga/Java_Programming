package daily_videos.day37_exceptions;

import java.util.ArrayList;

public class ErrrorExample {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        while(true){ // infinite loop
            pizzas.add(  new Pizza('S', 2, 3) );
        }
/*
        OutOfMemoryError is not exception.
        If we had unlimited memory, we wouldn't get that error !!


        */


    }
}
