package Algorithms.week3;

import java.util.Optional;
import java.util.stream.Stream;

public class FirstUniqueCharacter {
    public static void main(String[] args) {


        System.out.println(FirstUniqueCharacter("suucceess"));



    } public static String FirstUniqueCharacter(String word){

        String result = Stream.of(word.split("")).filter(p->word.indexOf(p) == word.lastIndexOf(p)).findFirst().orElse("_");


        return result;
    }

    /*
    Write a function that returns the first non-repeated character from a string. If all characters are repeated return a space character.
EXAMPLE:
Input: "success" output: u
Explanation: u and e are non-repeated, u is the first non-repeated character
     */

}
