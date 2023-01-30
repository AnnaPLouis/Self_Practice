package OfficeHoursWeek9;

import java.lang.reflect.Array;

public class NumberOfEvens {
    public static void main(String[] args) {

        int [] x = {2,1,2,3};


        int numberOfEvens = NumberOfEvens(x);

        System.out.println(numberOfEvens);


        /*1. Write a method that accepts an array and prints the number of even numbers in the
array.
int[] x = {2,1,2,3,4} = > 3
int[] y = {2,2,0} = > 3
int[] z = {1,3,5} = > 0

         */
    } public static int NumberOfEvens (int[] x){

        int count = 0;

        for (int i = 0; i < x.length; i++) {

            if (i%2==0){
                count++;
            }

        }

        return count;

    }
}
