package OfficeHoursWeek4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter age:");

        int age = input.nextInt();

        System.out.println("Enter weight:");

        int weight = input.nextInt();

        if (age >=18 && weight>50){
            System.out.println("You are eligible to donate blood");
        } else if (age >= 18 && weight <=50 ) {
            System.out.println("You are not eligible to donate blood");
        } else if (age < 18) {
            System.out.println("Age must be greater than 18");

        }






        /*Create a program that accepts age and weight(kg) as int.

					        If age greater than or equal 18 and weight greater than 50 kg give a message
					        	EXPECTED  :  "You are eligible to donate blood"

					        If age greater than or equal 18 and weight smaller or equal than 50 kg give a message
					        	EXPECTED  :  "You are not eligible to donate blood"

					        If age is smaller than 18 "Age must be greater than 18"
					        	EXPECTED  :  "Age must be greater than 18"

         */
    }
}
