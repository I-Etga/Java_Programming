package wednesdays_office_hours.week_15;

public class Library {

    public static void getLibraryCard(String city) {
        if (city.equalsIgnoreCase("fairfax") || city.equalsIgnoreCase("mclean")) {
            System.out.println("Library Card Created");
        } else {
            throw new NonResidentException("Library card for " + city + " is not available");
        }


    }

    public  static void borrow(boolean checkedOut) throws FailToCheckoutException {
        if (!checkedOut) {
            throw new FailToCheckoutException("Invalid");
        }

        System.out.println("Enjoy reading");
    }

}
