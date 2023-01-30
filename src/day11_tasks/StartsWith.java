package day11_tasks;

import java.util.Scanner;

public class StartsWith {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word:");

        String word = input.next();

        boolean startsWithX = word.startsWith("x");

        if (startsWithX == true){

            word = word.replace('x','a');
            System.out.println(word);
        }else {
            System.out.println(word);
        }


        }








        /*Create a class named StartsWithX and write a program that asks user to enter a word.
         If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

         */
    }
