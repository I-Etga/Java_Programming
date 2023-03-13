package wednesdays_office_hours.week4.morning;

public class T2BackingContest {
    /*
    T2BakingContest [multibranch, logical, arithmetic, relational]

You are in a baking contest and our cookies will be rated by 3 judges.

	Create a program that will define 3 scores for your cookies. Calculate the average score you earned.
	Then also define two other people's final score and determine which place you earned int the baking contest

		you can earn either: First place, Second place, or Third place

		Ex:
			input:
				your score = 8.5, 7.9, 8.3
				other people score = 8.5 and 7.9

				output: Congratulations you earned Second place with a score of: 8.2
					-> don't worry about decimal formatting

     */

    public static void main(String[] args) {

        double judge1 = 8.5, judge2 = 7.9, judge3 = 8.3;
        double myScore = (judge1 + judge2 + judge3) / 3; // we divide by 3 because we had 3 scores
        double person1 = 7.5, person2 = 7.4;
        String place;

        if (myScore > person1 && myScore > person2) {
            place = "First";
        } else if (myScore < person1 && myScore < person2) { // checking if we lost to both
            place = "Third";
        } else {
            place = "Second";
        }

        System.out.println("Congratulations you earned " + place + " place with a score of: " + myScore);

        // we assume all the score are unique, so we didn't handle any condition when the scores the equals
//        if(myScore > person1 && myScore > person2){
//            System.out.println("Congratulations you earned First place with a score of: " + myScore);
//        } else if(myScore < person1 && myScore < person2){
//            System.out.println("Congratulations you earned Third place with a score of: " + myScore);
//        } else {
//            System.out.println("Congratulations you earned Second place with a score of: " + myScore);
//        }

//        if(myScore > person1 && myScore > person2){
//            System.out.println("Congratulations you earned First place with a score of: " + myScore);
//        } else if((myScore > person1 && myScore < person2) || (myScore < person1 && myScore > person2)){
//            System.out.println("Congratulations you earned Second place with a score of: " + myScore);
//        } else {
//            System.out.println("Congratulations you earned Third place with a score of: " + myScore);
//        }


    }
}
