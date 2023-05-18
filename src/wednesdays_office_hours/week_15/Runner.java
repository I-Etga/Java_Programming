package wednesdays_office_hours.week_15;

public class Runner {


    public static void main(String[] args) {


        Library.getLibraryCard("FairFax");

        try {
            Library.borrow(true);
        } catch (FailToCheckoutException e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY BLOCK RUN");
        }

        System.out.println("CODE AFTER");

        try {
            throw new RuntimeException();
        } finally {
            System.out.println("SECOND FINALLY");
        }

    }

}
