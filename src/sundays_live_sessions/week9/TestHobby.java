package sundays_live_sessions.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class TestHobby {
    public static void main(String[] args) {
        Hobby hobby1 = new Hobby("Tennis", 350, false, true);

        System.out.println(hobby1);// toString() method is called implicitly!
        hobby1.doIt();

        System.out.println("*****");
        Hobby hobby2 = new Hobby("Football",400,true,true);
        Hobby hobby3 = new Hobby("Swimming",800,false,false);


        ArrayList<Hobby> hobbies = new ArrayList<>();
        hobbies.addAll(Arrays.asList(hobby1,hobby2,hobby3));

        for (Hobby hobby : hobbies) {
            hobby.doIt();
        }

        System.out.println("*****");

        ArrayList<Hobby> hobbies1 = new ArrayList<>();
        hobbies1.addAll(hobbies);

        hobbies1.removeIf(p-> p.isOutdoors);

        System.out.println("*****");

        ArrayList<Hobby> hobbies2 = new ArrayList<>();
        hobbies2.addAll(hobbies);

        hobbies2.removeIf(p->p.requiresOthers);

        System.out.println("*****");
        ArrayList<Hobby> hobbies3 = new ArrayList<>();
        hobbies3.addAll(hobbies);
        hobbies3.removeIf(p-> p.annualCost>500);

        System.out.println(hobbies1);// [hobbies inside]
        System.out.println(hobbies2);  // [hobbies don't require other people]
        System.out.println(hobbies3); // [hobbies cost annually less than $500]
    }
}
