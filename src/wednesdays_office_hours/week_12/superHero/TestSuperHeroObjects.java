package wednesdays_office_hours.week_12.superHero;

import java.util.ArrayList;
import java.util.Arrays;

public class TestSuperHeroObjects {
    public static void main(String[] args) {
        //                                                                          way #1 [initialize list without creating a list variable(no variable/ref. name)]
        Marvel spiderMan = new Marvel("Spider Man", "Peter Parker", new ArrayList<String>(Arrays.asList("agility", "spider-sense")));

        //                                                                          way #2 [initialize list by creating a list variable]
        ArrayList<String> powersOfIronMan = new ArrayList<>(Arrays.asList("powered suit of armor", "enhanced strength", "flight"));
        Marvel ironMan = new Marvel("Iron Man", "Tony Stark", new ArrayList<String>(powersOfIronMan));

        Marvel thor = new Marvel("Thor", "Thor Odinson", new ArrayList<String>(Arrays.asList("wields hammer", "controls lightning", "flight")));


        DC wonderWoman = new DC("Wonder Woman", "Diana Prince", new ArrayList<String>(Arrays.asList("Enhanced strength", "speed", "agility", "durability")), "Themyscira");

        DC batMan = new DC("Batman", "Bruce Wayne", new ArrayList<String>(Arrays.asList("master detective", "martial arts", "technical tools")), "Gotham City");
        System.out.println(batMan);

        DC superMan = new DC("Superman", "Clark Kent", new ArrayList<String>(Arrays.asList("super strength", "speed", "invulnerability", "flight")), "Metropolis");


        ArrayList<String> tonyPowers = new ArrayList(Arrays.asList("powered suit of armor", "flight", "enhanced strength"));

        Marvel ironman = new Marvel("Iron Man", "Tony Stark", tonyPowers);

        System.out.println(spiderMan);
        System.out.println(ironman);
        spiderMan.callAvengers();
        ironman.callAvengers();

        spiderMan.protect();

        //spiderMan.superHeroName; the superHeroName is private, so it is not inherited
        System.out.println(spiderMan.getName());
        System.out.println(spiderMan.getRealName());

        spiderMan.setUniverse("Multiverse");
        System.out.println(spiderMan);


    }

}

