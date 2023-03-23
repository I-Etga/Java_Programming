package wednesdays_office_hours.week7;

public class Recipe {
      /*
T4Recipe [object type]
    Create a class called Recipe
    declare these instance variables:
        name, ingredients, serving size, cost
    */
    String name;
    String ingredients;
    int servingSize;
    double cost;

    /*
    create a setInfo() method to initialize these variables
    */

    public void setInfo(String name, String ingredients, int servingSize, double cost){
        this.name = name;
        this.ingredients = ingredients;
        this.servingSize = servingSize;
        this.cost = cost;
    }

    /*
    create a method called costPerPerson that will return a double. Calculate the amount each person would need to pay to make this recipe - use the serving size and cost values
    */

    public double costPerPerson(){
        return cost / servingSize;
    }

    /*
    create a toString() that shows the information in the following format:
        Recipe for $name will require these ingredients:
                $all_ingredients
        This dish will serve $serving_size and cost a total of $ $cost to make
    create a class called ObjectTester and create some Recipe objects
     */

    public String toString(){
        return "Recipe for " + name + " will require these ingredients: \n\t" + ingredients + "\nThis dish will serve " + servingSize + " people and cost a total of " + cost;
    }
}
