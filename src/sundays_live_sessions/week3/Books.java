package sundays_live_sessions.week3;

public class Books {
    /*
    Books [switch, variables]

You are an author writing a new book and want to figure out some information related to the genre

Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.

Use the following format to print the information:
	The $genre genre usually has profits of $profit_amount being sold in $countries_number different countries. The $genre books often have $sequels_number squeals with each book roughly being around $page_length pages.

	if the given genre is not defined print: Sorry we don't have information for the $genre genre

Hint: Use variables for the information rather than printing in each genre

    Sample data for genres:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
     */

    public static void main(String[] args) {

        String genre = "Fantasy";
        int pageLength = 0, profit = 0, sequels = 0, countries = 0;
        boolean isValid = true;

        switch (genre) {
            default:
                isValid = false; // changing the boolean to be false when no case is matched
                break;
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_000;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;
        }

        if(isValid){
            String message = "The " + genre + " genre usually has profits of $" + profit + " being sold in " + countries + " different countries. The " + genre + " books often have " + sequels + " squeals with each book roughly being around " + pageLength + " pages.";
            System.out.println(message);
        } else {
            System.out.println("Sorry we don't have information for the " + genre + " genre");
        }


    }

}
