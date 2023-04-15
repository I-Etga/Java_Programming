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
                    break;
                } else {
                    addedDrinks.add(drink);
                }
            }
        }
        allDrinks.addAll(addDrinks);
    }
        /*  !! new version solution !!
        // Normally continue skips the inner loop. That way, we can skip next iterate(each) in outer loop !!
        outer: for (Drink each : newDrinks) { // each is the new Drinks

            for (Drink vending : allDrinks) { // vending is the existing drinks
                if (vending.name.equalsIgnoreCase(each.name)) {
                    vending.quantity += each.quantity;
                    continue outer; // if this runs the drink will not be duplicated in our vending
                }
            }

            allDrinks.add(each); // if the Drink is not in the machine already it will be added

        }
         */

    public void stock2(ArrayList<Drink> addDrinks) {

        for (Drink each : addDrinks) { // each is the new Drinks
            boolean drinkAdded = false;
            for (Drink vending : allDrinks) { // vending is the existing drinks
                if (vending.name.equalsIgnoreCase(each.name)) { // if the Drink exist in the ArrayList the quantity of the Drink will be updated
                    vending.quantity += each.quantity;
                    drinkAdded = true; // for the if statement below.
                    break;
                }
            }

            // if the boolean drinkAdded is true -> !true -> false, so if the quantity was updated above it will not run this code to add a Drink
            if (!drinkAdded) { // if the Drink does not exist in the ArrayList it will be added in
                allDrinks.add(each);
            }
        }
    }


    public double vend(String drink) {
        String message = "";
        for (Drink each : allDrinks) {
            if (each.name.equalsIgnoreCase(drink)) {
                if (each.quantity <= 0) {
                    message = "Sorry " + drink + " is out of stock";
                    return -1;
                } else {
                    each.quantity--;
                    return each.price;
                }
            }
        }
        System.out.println("Sorry " + drink + " not offered");
        return -2;
    }

    public String toString() {
        String output = "";
        for (Drink each : allDrinks) {
            output += each + "\n";
        }
        return output;
    }

}

