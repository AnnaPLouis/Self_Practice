package OfficeHoursWeek9;

public class LargestAndSmallestDiff {
    public static void main(String[] args) {


        int[] x = {2,10,7,1};

        int diff = largestAndSmallestDiff(x);

        System.out.println(diff);


/*Write a method that accepts an array and print the difference between the largest and
smallest values in the array.
int[] x = {10,3,5,6} = > 7
int[] y = {7,2,10,9} = > 8
int[] z = {2,10,7,2} = > 8

 */


    }

    public static int largestAndSmallestDiff (int[] x){

        int smallest = x[0];

        for (int each : x) {
            if (each<smallest){
                smallest = each;
            }

        }

        int largest = x[0];

        for (int each : x) {
            if (each>largest){
                largest = each;
            }

        }

        int diff = largest - smallest;

        return diff;


    }







}
