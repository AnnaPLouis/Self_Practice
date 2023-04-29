package Algorithms.week7;

import java.util.Arrays;
import java.util.List;

public class LengthOfLastWord {

    public static void main(String[] args) {

        int output = lengthOfLastWord(" fly me  to  the moon ");

        System.out.println(output);


    }
    public static int lengthOfLastWord(String str){

        String[] arr = str.split(" ");

        for (String s : arr) {
            s.replaceAll(" ","");
            }

        return arr[arr.length-1].length();

    }
}
