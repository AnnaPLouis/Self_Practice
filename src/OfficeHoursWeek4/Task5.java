package OfficeHoursWeek4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter animal:");
        String animal = input.next();

        switch (animal){
            case "Dog":
                System.out.println(animal + " is a domestic animal");
                break;
            case "Cat":
                System.out.println(animal + " is a domestic animal");
                break;
            case "Tiger":
                System.out.println(animal + " is a wild animal");
                break;
            default:
                System.out.println("unknown animal");

        }






        /*Create  a program that accepts animal as String

							DOG 	- domestic animal
							CAT 	- domestic animal
							TIGER 	- wild  animal

							For other animal - unknown animal

							INPUT : DOG 		EXPECTED OUTPUT : DOG is domestic animal


         */
    }
}
