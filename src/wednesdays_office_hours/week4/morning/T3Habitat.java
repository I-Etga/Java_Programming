package wednesdays_office_hours.week4.morning;

public class T3Habitat {
    /*
    T3Habitat [switch, variables]

	Create a program that will define a String variable of the habitat you want information on. We should get back information about the animals that can be found in those habitats

	use the following data and make creative messages for the outputs
		habitat - animals
		grasslands - goats, bison, badgers, coyotes
		jungle	- snakes, tigers, gorillas, rhinos, toucans
		city	- dogs, cats, gulls, squirrels
		safari - lion, hippo, giraffe, zebras, elephants

		Ex:
			input:
				jungle
			output:
				In the jungle you will be able to find: snakes, tigers, gorillas, rhinos, toucans
     */
    public static void main(String[] args) {

        String habitat = "rainforest", animals = "";

        switch (habitat){
            case "grasslands": animals = "goats, bison, badgers, coyotes"; break;
            case "jungle":
                    animals = "snakes, tigers, gorillas, rhinos, toucans";
                    break;
            case "city":
                animals = "dogs, cats, gulls, squirrels";
                break;
            case "safari":
                animals = "lion, hippo, giraffe, zebras, elephants";
                break;
            default:
                System.out.println("No data for " + habitat);
                // animal = "no data"
        }

        System.out.println("In the " + habitat + " you will able to find: " + animals);

    }
}
