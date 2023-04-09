package sundays_live_sessions.week9;

import java.util.ArrayList;

public class DrinksVending {
    public ArrayList<Drink> allDrinks;

    public DrinksVending() {
        this.allDrinks = new ArrayList<Drink>();
    }

    public DrinksVending(ArrayList<Drink> initializeListOfDrink) {
        this.allDrinks = new ArrayList<Drink>();
        this.allDrinks.addAll(initializeListOfDrink);
    }

    public void stock(ArrayList<Drink> addDrinks) {

        ArrayList<Drink> addedDrinks = new ArrayList<>();

        for (Drink drink : addDrinks) {
            for (Drink each : allDrinks) {
                if (each.name.equals(drink.name)) {
                    drink.quantity++;
                } else {
                    addedDrinks.add(drink);
                }
            }
        }
        allDrinks.addAll(addDrinks);

    }

    public String toString() {
        return "DrinksVending{" +
                "Beverages =" + allDrinks +
                '}';
    }

    public void vend(String drink) {
        String message = "";
        for (Drink each : allDrinks) {
            if (each.name.equalsIgnoreCase(drink)) {
                if (each.quantity == 0) {
                    message = "Sorry " + drink + " is out of stock";
                    break;
                } else {
                    each.quantity--;
                    message = "Price=" + each.price;
                    break;
                }
            } else {
                message = "Sorry " + drink + " not offered";
            }
        }
        System.out.println(message);
    }

}

