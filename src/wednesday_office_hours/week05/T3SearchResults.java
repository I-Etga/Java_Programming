package wednesday_office_hours.week05;

public class T3SearchResults {
    public static void main(String[] args) {

        String str = "Total results found:3012. Sort, Filter, Ratings";
        int indexStart = str.indexOf(':') + 1;
        // we add plus 1 because the number starts from the next index

        int indexEnd = str.indexOf('.');


    }
}
/*
T3SearchResults [String, dynamic index]

    Create a program that will have a String in a fixed format showing the results of a search. Based on that given format find the total number of search results and print them.

    Note: make the program as dynamic as possible for different sizes(it could be a number of 10 which is only 2 number digits or 100000 which is 6 number digits)

    Fixed format of the String:
        Total results found: $results. Sort, Filter, Ratings

    ex:
        "Total results found:3012. Sort, Filter, Ratings"
        -> 3012

        "Total results found:25. Sort, Filter, Ratings"
        -> 25

    Q: what is the datatype of the number we are getting in the end?
        Follow up, we will learn how to get this as an integer number in the future
 */
