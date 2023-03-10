package daily_videos.day04_concatenation.practice;

public class BirthDay {

    public static void main(String[] args) {

        String name = "John";
        int birthDay = 25;
        String birthMonth = "April";
        int birthYear = 1995;

        String result = name + " was born on " + birthMonth + "/" + birthDay + "/" + birthYear;

        System.out.println(result);

    }

}

/*
Create a class called BirthDay and create the following variable
             name, birthDay(int), birthMonth(String), birthYear(int)

             use concatenation to display the birthday of the person

                 if  name = "John"
                     birthDay = 25
                     birthMonth = "April"
                     birthYear = 1995;

                 output:
                     John was born on April/25/1995.
 */