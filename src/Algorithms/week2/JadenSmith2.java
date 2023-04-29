package Algorithms.week2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenSmith2 {
    public static void main(String[] args) {


        String jadenCased = JadenCased("How can mirrors be real if our eyes aren't real");

        System.out.println(jadenCased);

    }


    public static String JadenCased (String notJadenCased){

        String result = Stream.of(notJadenCased.split(" "))
                .map(p-> Character.toUpperCase(p.charAt(0))+p.substring(1))
                .collect(Collectors.joining(" "));


        return result;
    }
}
