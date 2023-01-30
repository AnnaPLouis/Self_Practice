package OfficeHoursWeek8;

import java.util.Arrays;
import java.util.Scanner;

public class RotatedLeft {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] x = new int[input.nextInt()];

        for (int i = 0; i < x.length; i++) {

            x[i] = input.nextInt();
        }


        int [] y = new int[x.length];

        for (int i = 0; i < x.length-1; i++) {
            y[i] = x[i+1];
        }

        y[x.length-1] = x[0];

        System.out.println(Arrays.toString(y));





        }

        public static int[] rotateLeft (int[] arr){

        int[] rotatedArray = new int[arr.length];

            for (int i = 0; i < arr.length-1; i++) {

                rotatedArray[i] = arr[i+1];
            }

            rotatedArray[arr.length-1] = arr[0];

            return rotatedArray;




    }



        }



