package day23_tasks;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListsOfChars {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> specials = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        char [] chars = str.toCharArray();

        for (char each : chars) {

            if (Character.isDigit(each)){
                digits.add(each);
            }
            if (Character.isLetter(each)){
                letters.add(each);
            }
            if (!Character.isLetter(each) && !Character.isDigit(each)){
                specials.add(each);
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specials = " + specials);
    }
}
