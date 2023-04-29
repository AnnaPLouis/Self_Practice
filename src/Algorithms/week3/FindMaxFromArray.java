package Algorithms.week3;

import java.util.Arrays;

public class FindMaxFromArray {

    public static void main(String[] args) {

       int[] array = {6, 8, 3, 5, 1, 9};

       int max = Arrays.stream(array).max().getAsInt();

        System.out.println(max);

        /*Write a function that can find the maximum number from an int Array.
        input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9

         */
    }
}
