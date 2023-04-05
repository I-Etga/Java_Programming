package wednesdays_office_hours.week9;

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
            String[] nameTitle = name.split(" ");

            String title = nameTitle[0];

            switch (nameTitle[0].toLowerCase()) {
                case "jedi":
                    if (!jediOrder.contains(title)) {
                        jediOrder.add(title);
                    }
                    break;
                case "officer":
                case "imperial":
                case "trooper":
                    if (!galacticEmpire.contains(title)) {
                        galacticEmpire.add(title);
                    }
                    break;
                case "rebel":
                case "alliance":
                    if (!rebelAlliance.contains(title)) {
                        rebelAlliance.add(title);
                    }
                    break;
            }
        }

        System.out.println("jedi Order: " + jediOrder);
        System.out.println("Galactic Empire: " + galacticEmpire);
        System.out.println("Rebel Alliance: " + rebelAlliance);
    }
}
