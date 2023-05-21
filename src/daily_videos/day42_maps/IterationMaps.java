package daily_videos.day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IterationMaps {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null key & null values
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Jimmy", 78000);
        map.put("Breanna", 98000);

        System.out.println(map);

        System.out.println("***** *****");

        // Iterating the map by the keys
        // Until we learn lambda expression, we can use it in order to iterate keys
        for (String eachKey : map.keySet()) {
            //map.replace(eachKey,  map.get(eachKey) * 2 ); // It's Integer.That's why I can multiply it by 2
            //         gives current key ---get gives value of current key
            System.out.println(eachKey);
        }
        // If we want to update a value of a key, it's better to use replace method.
        // put method work as well, but its main aim is inserting pairs. So it's slower comparing to replace !!

        System.out.println("***** values method *****");

        // Iterating the map by values
        // return type --> Collection

        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);
        }

        System.out.println("*****  entrySet method *****");

        // Iterating the map by entries/pairs
        // There is a shortcut. --> map.entrySet().for + enter

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }

        System.out.println("*****  entrySet--> getKey(),getValue(),setValue() methods *****");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey(); // get key returns String here
            Integer eachValue = eachEntry.getValue();
            eachEntry.setValue(eachValue + 10000); // change the value of current key !!
            //  System.out.println(eachKey +" : "+eachValue);
        }


        System.out.println(map);

    }

}
