package daily_videos.day32_finalKeyword;

import java.time.LocalDate;

class CydeoStudent{

    final public void language(){
        System.out.println("Java programming");
    }
}

public class FinalKeyword extends CydeoStudent {

    public FinalKeyword() {
    }

    /* public void language(){ // final methods can not be overridden !!
            System.out.println("Python Programming");
        }*/
    public static void main(String[] args) {


       final char gender = 'M';

        System.out.println(gender);

        // gender = 'F'; // compiler error [final variables are unchangeable]

        System.out.println("-------------");

       final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);

        // dateOfBirth = dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);


        System.out.println("----------");

       final String name = "James";
        //name = null;
        //name = "Daniel";

        System.out.println(name);
    }
}
