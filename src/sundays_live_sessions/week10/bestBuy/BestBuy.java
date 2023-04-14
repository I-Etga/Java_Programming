package sundays_live_sessions.week10.bestBuy;

public class BestBuy {
    public String address;
    public double grossIncome;
    public double expenses;

    public static String ceo;
    public static String hq;
    public static double revenue;

    static {
        ceo ="Corie Barry";
        hq = "Richfield, Minnesota";
        revenue = 51_760_000_000.0;
    }

    public BestBuy(String address, double grossIncome, double expenses) {
        this.address = address;
        this.grossIncome = grossIncome;
        this.expenses = expenses;
        reportProfits(); // that will be automatically applied as soon as the object is created.
    }

    public void reportProfits() {
        revenue += (grossIncome - expenses);
    }

    public String toString() {
        return "BestBuy{" +
                "address='" + address + '\'' +
                ", grossIncome=" + grossIncome +
                ", expenses=" + expenses +
                ", revenue=" + revenue +
                '}';
    }
}

