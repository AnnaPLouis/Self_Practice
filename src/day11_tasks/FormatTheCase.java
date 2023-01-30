package day11_tasks;

import java.util.Locale;
import java.util.Scanner;

public class FormatTheCase {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("first");

       String first = input.next().toLowerCase();

        System.out.println("second");

       String second = input.next().toLowerCase();

      String firstFix = (("" + first.charAt(0)).toUpperCase()) + (first.substring(1));

        String secondFix = (("" + second.charAt(0)).toUpperCase()) + (second.substring(1));

        System.out.println(firstFix + " "+ secondFix);



        /*Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

         */



    }
}
