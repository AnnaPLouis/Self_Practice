package day42_tasks;

import java.util.*;

public class Cars {
    public static void main(String[] args) {


        Map<String, Object> car1 = new Hashtable<>();
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("color", "Red");
        car1.put("year", 2021);
        car1.put("price", 20000);
        car1.put("electric", false);

        Map<String, Object> car2 = new Hashtable<>();
        car2.put("brand", "Audi");
        car2.put("model", "Q7");
        car2.put("color", "Gray");
        car2.put("year", 2022);
        car2.put("price", 50000);
        car2.put("electric", false);

        Map<String, Object> car3 = new Hashtable<>();
        car3.put("brand", "Tesla");
        car3.put("model", "Model Y");
        car3.put("color", "White");
        car3.put("year", 2020);
        car3.put("price", 60000);
        car3.put("electric", true);

        Map<String, Object> car4 = new Hashtable<>();
        car4.put("brand", "Honda");
        car4.put("model", "Civic");
        car4.put("color", "White");
        car4.put("year", 2016);
        car4.put("price", 20000);
        car4.put("electric", false);

        Map<String, Object> car5 = new Hashtable<>();
        car5.put("brand", "Toyota");
        car5.put("model", "Corolla");
        car5.put("color", "Gray");
        car5.put("year", 2021);
        car5.put("price", 30000);
        car5.put("electric", false);

        Map<String, Object> car6 = new Hashtable<>();
        car6.put("brand", "Hundai");
        car6.put("model", "i20");
        car6.put("color", "Black");
        car6.put("year", 2015);
        car6.put("price", 18500);
        car6.put("electric", false);

        Map<Integer,Map<String, Object>> myCars = new LinkedHashMap<>();

        myCars.put(1, car1);
        myCars.put(2, car2);
        myCars.put(3, car3);
        myCars.put(4, car4);
        myCars.put(5, car5);
        myCars.put(6, car6);

        for (Map<String, Object> eachValue : myCars.values()) {

            System.out.println(eachValue.get("brand") + " - " + eachValue.get("model") + " - " + eachValue.get("price"));
        }

        for (Map<String, Object> eachValue : myCars.values()) {

            if (eachValue.get("electric").equals(true)){

                System.out.println(eachValue.get("brand") + " - " + eachValue.get("model") + " is electric");
            }

        }

        int biggestPrice = (int) myCars.get(1).get("price");


        for (Map<String, Object> eachValue : myCars.values()) {

            if ((int)eachValue.get("price") > biggestPrice){
                biggestPrice = (int)eachValue.get("price");
            }

        }

        for (Map<String, Object> eachValue : myCars.values()) {

            if ((int)eachValue.get("price") == biggestPrice){
                System.out.println(eachValue.get("brand") + " - " + eachValue.get("model") + " is the most expensive car");
            }

        }















        }






        /*


		4.3 Display all the electric cars

		4.4 Display the most expensive car

         */
    }

