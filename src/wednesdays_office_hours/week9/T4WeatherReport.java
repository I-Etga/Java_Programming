package wednesdays_office_hours.week9;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T4WeatherReport {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");

        ArrayList<Double> temperatures = new ArrayList<>(Arrays.asList(62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5));

        Collections.sort(temperatures);//[42.3, 43.0, 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1, 68.9, 77.3]]

        temperatures.remove(0);// [43.0, 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1, 68.9, 77.3]
        temperatures.remove(0);//[44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1, 68.9, 77.3]

        temperatures.remove(temperatures.size() - 1);//[44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1, 68.9]
        temperatures.remove(temperatures.size() - 1);//[44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1]

        // #1 solution 1 min/max --> Collections.sort(list)
        double minTemp = temperatures.get(0); // after sort method, first element of list will be the minimum
        double maxTemp = temperatures.get(temperatures.size() - 1); // / after sort method, last element of list will be the maximum

        // #3 solution max/min method of Collections !!

        double maxT = Collections.max(temperatures);//[62.1]
        double minT = Collections.min(temperatures);//[44.8]

        double sumOfTemperature = 0;

        for (Double temperature : temperatures) {
            sumOfTemperature += temperature;
        }

        double averageTemp = sumOfTemperature / temperatures.size();

        /* DO NOT FORGET !! Decimal Format returns String ! I need averageTemp in next line as double. SO I can't use df now !
                        That's why if we want to use the variables in math operations we should use
                                format method from  my custom class MathUtil class instead of Decimal format.

                               DF--> returns string , (custom) MathUtil.format(double) -return double */
        //                  array[index]
        double medianTemp = temperatures.get(temperatures.size() / 2);

        String prediction = (int) (averageTemp - 5) + " - " + (int) (averageTemp + 5);


        System.out.println("maxTemperature = " + maxT);
        System.out.println("minTemperature = " + minT);
        System.out.println("medianTemp = " + medianTemp);
        System.out.println("mean = " + df.format(averageTemp));
        System.out.println("prediction = " + prediction);

        // df.format(averageTemp); returns String
        //double a = 5.5 + 6.7 + df.format(averageTemp);

    }
}

      /*
         //#2 solution 2 min/max --> old version for/for each loop
        double maxTemperature = temperatures.get(0);
        double minTemperature = temperatures.get(0);

         After using sort method we know the element at index[0] is the minimum and at index[list.size()-1] is maximum.
         So We do NOT need for/for each loop to find min and max.

            I don't have to use that code block. I've learnt methods(min and max) of Collections. (line 31-32)

        for (Double temperature : temperatures) {
            sumOfTemperature+= temperature;
            if(temperature > maxTemperature){
                maxTemperature = temperature;
            }
            if(temperature < minTemperature){
                minTemperature = temperature;
            }
        }
        */