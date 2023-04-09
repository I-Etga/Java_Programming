package sundays_live_sessions.week9;

public class Hobby {
   public String name;
   public double annualCost ;
   public  boolean isOutdoors,requiresOthers;

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name,annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        String place = "";
        if(isOutdoors){
             place = "outside";
        }else {
            place = "inside";
        }
        System.out.println("Doing " + name + " " + place);
    }

    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}