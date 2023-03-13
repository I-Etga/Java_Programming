package sundays_live_sessions.week5;

public class Runner {
    public static void main(String[] args) {

        // calling the method:
        // ClassName.method()

        System.out.println(CurrencyConverter.convertFromDollar("yen", 50));

        System.out.println(CurrencyConverter.convertFromDollar("won", 1000));

        double res = CurrencyConverter.convertFromDollar("won", 1000);

        System.out.println("-------------------------");

        MultiplicationTable.multiplicationTable(5);

        System.out.println("-------------------------");

        MultiplicationTable.multiplicationTable(6, 15);

    }
}
