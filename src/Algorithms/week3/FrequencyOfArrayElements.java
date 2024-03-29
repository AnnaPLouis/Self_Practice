package Algorithms.week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {

        Map<String, Long> map = FrequencyOfElements(new String[]{"Apple", "Banana", "apple", "Cherry", "Apple"});

        System.out.println(map);


    } public static Map<String,Long> FrequencyOfElements(String[] array){

        return Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }



    /*Write a function that takes a String array as parameter and returns a map object that contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity. Order is not important.
EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}

     */
}
