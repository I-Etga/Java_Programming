package wednesdays_office_hours.week9;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class T3StarWarsFactions {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Jedi Yoda", "officer Versio", "officer Brunson",
                "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine",
                "Rey Jedi", "Rook Alliance", "imperial Terex"));

        ArrayList<String> jediOrder = new ArrayList<>();
        ArrayList<String> galacticEmpire = new ArrayList<>();
        ArrayList<String> rebelAlliance = new ArrayList<>();

        for (String name : names) {
            name = name.toLowerCase();

            if (name.contains("jedi")) {
                jediOrder.add(StringUtility.capatilize(name.replace("jedi", "").trim()));
            } else if (name.contains("imperial") || name.contains("trooper") || name.contains("officer")) {
                galacticEmpire.add(StringUtility.capatilize(name.replace("imperial", "").replace("trooper", "").replace("officer", "").trim()));
            }
            if (name.contains("rebel") || name.contains("alliance")) {
                rebelAlliance.add(StringUtility.capatilize(name.replace("rebel", "").replace("alliance", "").trim()));

            }
        }
        System.out.println("jedi : " + jediOrder);
        System.out.println("Galactic Empire: " + galacticEmpire);
        System.out.println("Rebel Alliance: " + rebelAlliance);

    }
}
