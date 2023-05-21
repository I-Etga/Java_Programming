package daily_videos.day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("---------------------------------------------");
        // how many female & male employees in the map?

        int countMaleEmployee = 0;
        int countFemaleEmployees = 0;

        /*
        // It works but not the best solution for this task!!

        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployee++;
            }else{
                countFemaleEmployees++;
            }
        }
        */

        // shortcut: employeeValues.for + enter
        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")) {
                countFemaleEmployees++;
            } else {
                countMaleEmployee++;
            }
        }

        System.out.println("Male Employees: " + countMaleEmployee);
        System.out.println("Female Employees: " + countFemaleEmployees);

        System.out.println("---------------------------------------------");
        // display the names of all the female employees

        /*
        for (String name : employeeMap.keySet()) {
            String gender =employeeMap.get(name);
            if(gender.equals("F")){
                System.out.println(name);
            }
        }

         */

        // !!! If I don't iterate the map through entrySet(), I can't get and set the values !!
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")) {
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("---------------------------------------------");
        // update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("M")) {
                eachEntry.setValue("Male");
            } else {
                eachEntry.setValue("Female");
            }
        }

        System.out.println(employeeMap);


    }

}
