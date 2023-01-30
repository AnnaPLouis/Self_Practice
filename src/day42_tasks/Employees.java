package day42_tasks;

import java.util.*;

public class Employees {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        Integer minSalary = Integer.MAX_VALUE;

        Integer maxSalary = Integer.MIN_VALUE;

        for (Integer eachValue : map.values()) {

            if (eachValue < minSalary){
                minSalary = eachValue;
            }

            if (eachValue > maxSalary){
                maxSalary = eachValue;
            }

        }

        System.out.println("Minimum salary is " + minSalary);
        System.out.println("Maximum salary is " + maxSalary);

        System.out.println("-------------------------");

        int count = 0;

        for (Integer eachValue : map.values()) {

            if (eachValue >= 120000 && eachValue<= 150000){
                count++;
            }

        }

        System.out.println("Number of employees has the salary between 120k ~ 150K: " + count);

        System.out.println("----------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            if(eachEntry.getValue() < 118000){
                System.out.println(eachEntry.getKey());
            }

        }

        System.out.println("----------------------------");

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {

            if (eachEntry.getValue()<120000){
                eachEntry.setValue(eachEntry.getValue()+10000);
            }

        }

        System.out.println(map);




















    /*



    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K

         */
    }
}
