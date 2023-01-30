package day42_tasks;

import java.util.*;

public class JavaTopics {


    public static void main(String[] args) {


        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 4.0);
        unit1.put("Escape Sequences", 2.0);
        unit1.put("Primitives", 4.0);
        unit1.put("Operators", 6.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 9.5);
        unit6.put("OOP Polymorphism", 7.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);

        List<Map<String, Double>> list = new ArrayList<>();

        list.addAll(Arrays.asList(unit1,unit2,unit3,unit4,unit5,unit6));

        System.out.println(list);

        for (Map<String, Double> eachMap : list) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {

                System.out.println(eachEntry.getKey() + " : "+eachEntry.getValue());

            }
        }

        System.out.println("------------------------");


        for (Map<String, Double> eachMap : list) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {

                if (eachEntry.getValue() > 7){

                    System.out.println(eachEntry.getKey());
                }

            }
        }

        System.out.println("------------------------");

        for (Map<String, Double> eachMap : list) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {

                if (eachEntry.getValue() < 3){

                    System.out.println(eachEntry.getKey());
                }

            }
        }

        System.out.println("------------------------");


        Double maxHours = list.get(0).get("Print Statements");

        for (Map<String, Double> eachMap : list) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {

                if (eachEntry.getValue()>maxHours){

                    maxHours = eachEntry.getValue();
                }

            }
        }

        for (Map<String, Double> eachMap : list) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {

                if (eachEntry.getValue().equals(maxHours)){

                    System.out.println(eachEntry.getKey() + " has the maximum hours");
                }

            }
        }

        System.out.println("------------------------");


        Double minHours = list.get(0).get("Print Statements");

        for (Map<String, Double> eachMap : list) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {

                if (eachEntry.getValue()<minHours){

                    minHours = eachEntry.getValue();
                }

            }
        }

        for (Map<String, Double> eachMap : list) {

            for (Map.Entry<String, Double> eachEntry : eachMap.entrySet()) {

                if (eachEntry.getValue().equals(minHours)){

                    System.out.println(eachEntry.getKey() + " has the minimum hours");
                }

            }
        }








        /*

        5.5 Which Java Topic has the maximum hours?

            5.6 Which topic has the minimum hours?

         */
    }
}
