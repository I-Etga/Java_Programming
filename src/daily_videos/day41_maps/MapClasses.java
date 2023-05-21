package daily_videos.day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        // Map<Data type, Data type> ref.name = obj. type of map

        System.out.println("***** #1 HashMap *****");

        Map<String, Integer> hashMap = new HashMap<>(); // random order, accept null key & null values
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        //hashMap.put("Daniel", 80000); //"Daniel" key exist. So value will be updated !! new key won't be created !!
        hashMap.put("Arron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null); // 'null' value can be duplicated !! but null key can NOT !!
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000); // ONLY ONE NULL KEY will be accepted. So value of null key changes/is updated two times with put method.

        System.out.println("hashMap = " + hashMap);

        System.out.println("***** #2 LinkedHashMap *****");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // INSERTION order, accepts null key  & null values
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        linkedHashMap.put("Arron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);
        // insertion order --> first added pair will be ordered first and last one will be ordered last!

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("***** #3 TreeMap *****");

        Map<String, Integer> treeMap = new TreeMap<>(); // SORTED order, does not accept null key, accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        treeMap.put("Arron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null); // value CAN be NULL in treeMap
        // treeMap.put(null, 120000); KEY can NOT be NULL in treeMap. Otherwise, [NullPointerException]
        //  treeMap.put(null, 110000);
        // treeMap.put(null, 100000);

        System.out.println("treeMap = " + treeMap);


        System.out.println("***** #4 HashTable *****");

        Map<String, Integer> hashtable = new Hashtable<>(); // random order, does NO accept NULL KEY & null VALUES, Synchronized
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        // map1.put("Daniel", 80000);
        hashtable.put("Arron", 78000);
        // hashtable.put("Chris", null); Value in Hashtable can NOT be NULL. Otherwise, [NullPointerException]
        // hashtable.put("Breanna", null); Value in Hashtable can NOT be NULL. Otherwise, [NullPointerException]
        // hashtable.put(null, 120000); Key in Hashtable can NOT be NULL. Otherwise, [NullPointerException]
        // hashtable.put(null, 110000); Key in Hashtable can NOT be NULL. Otherwise, [NullPointerException]

        try {
            hashtable.put("Diana", 100000); // unchecked exception. [only way to handle --> try/catch block]
        } catch (RuntimeException e) { //It's the parent of all unchecked exceptions
            e.printStackTrace(); //showhs what's the problem
        }
        /*
                    Thanks to try/catch block we fix the problem.[by not adding the unacceptable pair !!]
                    Program ends with code(0). Without try/catch it would end with code(1)

         */


        System.out.println("hashtable = " + hashtable);


    }

}

/*
pair: name & salary
Daniel = 95000
Emily = 100000
Bella = 85000
 */
