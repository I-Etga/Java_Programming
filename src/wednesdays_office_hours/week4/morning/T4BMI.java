package wednesdays_office_hours.week4.morning;

public class T4BMI {
    /*
    T4BMI [nested if, multibranch, relational, arithmetic]

	Create a program that will calculate your BMI. Declare and assign the values for a mass (in kilograms) and height (in meters)

	first check if the given values are valid
		- the kilograms needs to be more than 40 and less than 185

		- the height also needs to be more than 1.2 and less than 2.5

		-> if either of those is not met print: "Sorry we cannot calculate the BMI with these metrics"

	if the given values are valid then calculate and print the BMI using the following formula
		BMI = mass / height^2

	use these ranges for BMI for print the result
		Less than 18.5 — Underweight
		From 18.5 to 24.9 — Normal weight
		From 25 to 29.9 — Overweight
		More than or equal to 30 — Obese

	sample data to use:
		mass = 64
		height = 1.65
		-> Normal weight

		mass = 90
		height = 1.8
		-> Overweight

		mass = 50
		height = 1.7
		-> Underweight
     */

    public static void main(String[] args) {

        double mass = 50, height = 1.7;

        if((mass >= 40 && mass <= 185) && (height >= 1.2 && height <= 2.5)){
            // valid values

            double bmi = mass / (height * height);
            String report = "Mass: " + mass + " kg | Height: " + height + "m\nBMI: " + bmi + " - ";

            if(bmi < 18.5){
                report += "Underweight";
                // report = report + "Underweight"
            } else if(bmi >= 18.5 && bmi <= 24.9){
                report += "Normal weight";
            } else if(bmi >= 25 && bmi <= 29.9){
                report += "Overweight";
            } else { // else if(bmi >= 30)
                report += "Obese";
            }

            System.out.println(report);

        } else {
            // invalid value
            System.out.println("Sorry we cannot calculate the BMI with these metrics");
        }

    }
}
