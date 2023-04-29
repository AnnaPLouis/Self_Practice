package Algorithms.week2;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountOfDuplicatedChars {
    public static void main(String[] args) {


        String input = "aA11";

        input = input.toLowerCase();

        Map<Character, Long> result = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        int count = 0;

        for (Long value : result.values()) {
            if (value>1){
                count++;
            }

        }

        System.out.println(count);







    }











    /*Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once. "aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`) "indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice. "aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.

     */
}
