package Algorithms.week4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "hello world";
        String t = "world hello";

        boolean validAnagram;

        if(Arrays.stream(s.split("")).sorted().collect(Collectors.toList()).equals(Arrays.stream(t.split("")).sorted().collect(Collectors.toList()))){
            validAnagram = true;
        }else{
            validAnagram = false;

        }
        System.out.println(validAnagram);
    }
}
