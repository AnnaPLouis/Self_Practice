package Algorithms.week2;

import java.util.Arrays;
import java.util.List;

public class JadenSmith {
    public static void main(String[] args) {

       String jadenCased = JadenCased("How can mirrors be real if our eyes aren't real");

        System.out.println(jadenCased);


    }


    public static String JadenCased(String notJadenCased) {

        String jadenCased = "";

        for (int i = 0; i < notJadenCased.length(); i++) {

            if(notJadenCased.charAt(i) == ' '){

                jadenCased += "" + notJadenCased.charAt(i) + Character.toUpperCase(notJadenCased.charAt(i+1));
                i++;

            }else{
                jadenCased+=notJadenCased.charAt(i);
            }

        }

        return jadenCased;
    }








        //Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter. When writing on Twitter, he is known for almost always capitalizing every word. For simplicity, you'll have to capitalize each word, check out how contractions are expected to be in the example below.
        //Your task is to write a method that converts strings to how they would be written by Jaden Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
        //Note that this function should a return empty string for an empty string or null.
        //Example:
        //Not Jaden-Cased: "How can mirrors be real if our eyes aren't real" Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"

}
