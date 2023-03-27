package sundays_live_sessions.week7;

import java.util.Arrays;
import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        String[] europa = {"Germany", "Belgium", "France", "Netherlands", "Poland", "Spain", "Italy", "Norway", "Sweden"};

        // #1 first and last char of countries
        for (String country : countries) {
            System.out.print("" + country.charAt(0) + country.charAt(country.length() - 1) + " ");
        }
        System.out.println("-------------");

        // #2 largest and shortest named countries
        int longest = 0;
        int shortest = 100; // try to write the number of the largest country all over the world !!

        String longestCountry = "";
        String shortestCountry = "";

        for (String country : countries) {

            if (country.length() > longest) {
                longest = country.length();
                longestCountry = country;
            }
            if (country.length() < shortest) {
                shortest = country.length();
                shortestCountry = country;
            }
        }
        System.out.println("shortest Country = " + shortestCountry);
        System.out.println("longest Country = " + longestCountry);


        // #2 approach !! shortest-largest(shorter and easier way)

        String small = countries[0];
        String large = countries[0];

        for(String each : countries){
            if(each.length() < small.length()){
                small = each;
            } else if(each.length() > large.length()){
                large = each;
            }
        }

        System.out.println("smallest: " + small);
        System.out.println("largest: " + large);

        System.out.println("-----------");
        // #3 starts with 'C'
        System.out.println("Counties start with \"C\" in this array: ");
        for (String country : countries) {
            if (country.startsWith("c") || country.startsWith("C")) {
                System.out.print(country + " ");
            }
        }
        System.out.println();
        // #4 ends with 's'
        System.out.println("--------");
        System.out.println("Counties ends with \"s\" in this array: ");
        for (String country : countries) {
            if (country.endsWith("s")) {
                System.out.print(country + " ");
            }
        }
        // #5 put counties in order
        System.out.println();
        System.out.println("-----------");

        Arrays.sort(countries); // this is a void method. So we can't assign it to itself of to another array by using sort method!
        System.out.println(Arrays.toString(countries));

        // test

        

    }
}
