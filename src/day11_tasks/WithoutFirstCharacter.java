package day11_tasks;

import java.util.Scanner;

public class WithoutFirstCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your 1st word:");

        String word1 = input.next();

        System.out.println("enter your 2nd word:");

        String word2 = input.next();

        String result = word1.substring(1) + word2.substring(1);

        System.out.println(result);









        /*Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana

         */






    }
}
