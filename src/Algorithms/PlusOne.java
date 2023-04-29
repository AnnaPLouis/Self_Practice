package Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr = new int[]{9};

        int[] result = plusOne(arr);

        System.out.println(Arrays.toString(result));

    }

    public static int[] plusOne(int[] arr){

        StringBuilder s = new StringBuilder();
        for (int i : arr) {
            s.append(i);
        }
        int number = Integer.parseInt(s.toString())+1;

        int [] result = Integer.toString(number).chars().map(c->c-'0').toArray();

        return result;
    }
}
