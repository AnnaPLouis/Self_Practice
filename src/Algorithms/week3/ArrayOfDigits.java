package Algorithms.week3;

import java.util.Arrays;

public class ArrayOfDigits {
    public static void main(String[] args) {

        int input = 14567;

        String temp = Integer.toString(input);

        int[] output = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {

            output[i] = Character.getNumericValue(temp.charAt(i));

        }

        System.out.println(Arrays.toString(output));










        /*How to convert a positive int to an array of digits.
Input: 490 Output: [4, 9, 0] (as int Array)

         */
    }
}
