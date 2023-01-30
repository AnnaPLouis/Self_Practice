package day36_tasks;

import java.util.*;

import day34_tasks.carTask.*;

public class Cars {
    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot",2010, 25000, "White"),
                new Audi("Q6", 2014,32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000,"Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019,35000, "Blue"),
                new Tesla("Model 3", 2015,45000, "White"),
                new Tesla("Model Y", 2017, 50000 , "Silver"),
                new Tesla("Model X", 2016, 48000, "Grey"),
                new Tesla("Model X", 2014, 46000, "Blue"),
        };

        for (Car each : cars) {

            if (each instanceof Honda){
                if (each.getYear()>=2010 && each.getYear()<=2011){
                    System.out.println(each.getMake() + " " + each.getModel() + " "+ each.getYear()+" is eligible for recall");
                }
            }

        }

        for (Car each : cars) {

            if (each instanceof Audi){
                if (each.getYear()>=2015 && each.getYear()<=2019){
                    System.out.println(each.getMake() + " " + each.getModel() + " "+ each.getYear()+" is eligible for recall");
                }
            }

        }

        for (Car each : cars) {

            if (each instanceof Tesla){
                if (each.getYear()>=2015 && each.getYear()<=2016){
                    System.out.println(each.getMake() + " " + each.getModel() + " "+ each.getYear()+" is eligible for recall");
                }
            }

        }

        double highestPrice = cars[0].getPrice();

        for (Car each : cars) {

            if (each.getPrice()>highestPrice){
                highestPrice = each.getPrice();
            }

        }

        System.out.println(highestPrice);

        double lowestPrice = cars[0].getPrice();

        for (Car each : cars) {

            if (each.getPrice()<lowestPrice){
                lowestPrice = each.getPrice();
            }

        }

        System.out.println(lowestPrice);


        ArrayList<Tesla> teslaCars = new ArrayList<>();

        for (Car each : cars) {

            if (each.getMake().equals("Tesla")){

                teslaCars.add((Tesla) each);
            }

        }

        System.out.println(teslaCars);


    }


}
