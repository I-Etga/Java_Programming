package daily_videos.day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("C02", "Josh");
        map.put("B03", "Nora");
        map.put("A02", "Khashayar");
        map.put("D02", "Abidullah");
        map.put("A03", "Tatiana");
        map.put("A04", "Tatiana");
        map.put("A05", "Tatiana");
        map.put("A06", "Tatiana");
        map.put("A07", "Tatiana");

        System.out.println(map.size()); // How many pairs are stored in map ? --> returns 9
        System.out.println(map);


        System.out.println(map.get("A04"));

        map.put("A04", "Lucy");
        map.put("A06", "Madiyar");

        System.out.println(map);

        System.out.println(map.get("B03")); // returns the value of specified key

        //key is unchangeable. But, value can be changed anytime.
        map.replace("C02", "Aseel");
        map.replace("A07", "Marika");

        System.out.println(map);

        map.remove("A05"); // We use key instead of index number. Because keys are unique/

        System.out.println(map);


        System.out.println(map.containsKey("B03"));// returns true . Because contains key named "B09"
        System.out.println(map.containsKey("H98")); // returns false . Because does NOT contain key named "H98"

        System.out.println(map.containsValue("Lucy"));// returns true . Because it contains value "Lucy"
        System.out.println(map.containsValue("Muhtar"));// returns false . Because it does NOT contain value "Muhtar"

        System.out.println(map.isEmpty()); // returns false . Because it's not empty
        System.out.println(map.equals(map)); // returns true. Because map equals map !!

    /*
         .equals() method comes from originally Object class, and in Map class there is overridden version.
         That overridden equals method checks all keys and values.
         PAIRS AND ORDER MUST be SAME !! Otherwise, it returns false
                    */


        System.out.println(map.isEmpty()); // returns false. Because there are some pairs in map.
        map.clear();
        System.out.println(map.isEmpty()); // true. Because of clear method, map is empty.

        System.out.println(map); // {}


    }
}
/*
                Summary:
                Methods of Map:
        put(key, value): inserts the given key and value to the Map as a pair (entry)
                            can also be used for updating the values of exsiting keys

        size(): returns the total number of pairs

        get(key): returns the value of the specified key

        replace(key, newValue): replaces the value of the specified key with the new value

        remove(key): removes the pair with the matching key from the map

        containsKey(key): returns true if the specified key is included in the map, otherwise returns false

        containsValue(Value): returns true if the specified Value is included in the map, otherwise returns false

 */
