package wednesdays_office_hours.week_14.shopping;

public final class Amazon extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println(getClass().getSimpleName() + " views Cart ");
    }

    @Override
    public void shipItem() {
        System.out.println(getClass().getSimpleName() + " Shipping Item ");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying Item on " + getClass().getSimpleName() );
    }

    @Override
    public void returnItem() {
        System.out.println(getClass().getSimpleName() + " Returning Item");
    }
}
