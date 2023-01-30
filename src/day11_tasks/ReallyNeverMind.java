package day11_tasks;

import java.util.Scanner;

public class ReallyNeverMind {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your word:");

        String word = input.next();

        if (word.endsWith("ly")) {
            System.out.println("really??");
        }else {
            System.out.println("never mind");
        }







    }














    // Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

}
