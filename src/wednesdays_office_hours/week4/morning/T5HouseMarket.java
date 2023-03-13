package wednesdays_office_hours.week4.morning;

public class T5HouseMarket {
    /*
    T5HouseMarket [switch, variables]

You are buying a new house and need to collect information about the houses in a specific neighborhoods.

	Create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts near by(out of 5), if it is a gated community or not, and if pets are allowed

	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts near by is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed

		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible
			Data to use:

		name - Hills
		average price - 89,000
		rating - 4.0
		gated - no
		allow pets - yes

		name - Oaks
		average price - 75,000
		rating - 3.5
		gated - no
		allow pets - yes

		name - Highland
		average price - 150,000
		rating - 4.5
		gated - yes
		allow pets - no

		name - Canyon
		average price - 201,000
		rating - 4.8
		gated - yes
		allow pets - yes
     */

    public static void main(String[] args) {

        String name = "Islands";
        double avgPrice = 0, ratingForSchools = 0;
        boolean isGated = false, allowsPets = false;

        switch (name){
            case "Hills":
                avgPrice = 89_000;
                ratingForSchools = 4.0;
                isGated = false;
                allowsPets = true;
                break;
            case "Oaks":
                avgPrice = 75_000;
                ratingForSchools = 3.5;
                isGated = false;
                allowsPets = true;
                break;
            case "Highland":
                avgPrice = 150_000;
                ratingForSchools = 4.5;
                isGated = true;
                allowsPets = false;
                break;
            case "Canyon":
                avgPrice = 201_000;
                ratingForSchools = 4.8;
                isGated = true;
                allowsPets = true;
                break;
        }

        if(avgPrice != 0){
            String report = "The houses in the " + name + " on average value at $" + avgPrice + ". This neighborhood is " + (isGated ? "gated" : "not gated") + " and the rating of the schools distracts near by is " + ratingForSchools + " out of 5. For the pet owners " + (allowsPets ? "you are in luck, pets are allowed" : "sorry pets are not allowed");

            System.out.println(report);
        } else {
            System.out.println("No data for " + name);
        }


    }

}
