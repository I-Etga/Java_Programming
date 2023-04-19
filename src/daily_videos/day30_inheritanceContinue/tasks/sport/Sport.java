package daily_videos.day30_inheritanceContinue.tasks.sport;

import java.util.ArrayList;

public class Sport {

    private String name;
    private int numberOfPlayers;
    private int numberOfReferre;
    private ArrayList<String> rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferre) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferre(numberOfReferre);
        rules = new ArrayList<>(); // I just want to create a empty list !! I'll add Strings innit !!
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers <= 0) {
            System.out.println("Number of Players can not be zero or negative");
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferre() {
        return numberOfReferre;
    }

    public void setNumberOfReferre(int numberOfReferre) {

        if (numberOfReferre <= 0) {
            System.out.println("Number of Referre can not be zero or negative");
            System.exit(1);
        }
        this.numberOfReferre = numberOfReferre;
    }

    public ArrayList<String> getRules() {
        return rules;
    }

    public void setRules(ArrayList<String> rules) {
        this.rules = rules;
    }

    public void addRule(String rule) {
        rules.add(rule);
    }

    public void addRules(ArrayList<String> rules) {
        rules.addAll(rules);
    }

    public void play() {
        System.out.println(getName() + " is played with " + getNumberOfPlayers() + " players");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules=" + rules +
                '}';
    }
}
/*
        2. create the following sub classes of Sport:
                1. Basketball
                2. Baseball
                3. Football
                4. AmericanFootball

            Add any missing variables or methods

            Note: you can search them on google
 */
