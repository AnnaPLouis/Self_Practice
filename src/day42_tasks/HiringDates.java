package day42_tasks;

import java.time.*;

import java.util.*;

public class HiringDates {

    public static void main(String[] args) {


        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));


        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {

            if (eachEntry.getValue().isBefore(LocalDate.of(2015,1,1))){

                System.out.println(eachEntry.getKey());
            }

        }

        System.out.println("--------------------------");


        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {

            if (eachEntry.getValue().isEqual(LocalDate.of(2020,5,15))){

                System.out.println(eachEntry.getKey());
            }

        }

        System.out.println("--------------------------");



        int count = 0;

        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {

            if (eachEntry.getValue().isAfter(LocalDate.of(2014,12,31))){

                count++;
            }

        }

        System.out.println("Number of people who were hired after 2014: "+count);


        System.out.println("--------------------------");


        for (Map.Entry<String, LocalDate> eachEntry : map.entrySet()) {

            System.out.println(eachEntry.getKey() + " : " +eachEntry.getValue());
        }










        /*

        3.3 How many people were hired after 2014?
    Hint: You can use isAfter method of LocalDate

        3.4 Display the name and hire date of the employee


         */
    }
}
