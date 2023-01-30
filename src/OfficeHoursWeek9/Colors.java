package OfficeHoursWeek9;

import java.util.ArrayList;
import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>();

        colors.add(input.next());
        colors.add(input.next());
        colors.add(input.next());
        colors.add(input.next());
        colors.add(input.next());

        for (String each : colors) {

            System.out.println(each);

        }






        /*Write a Java program to create a new array list,
        add some colors (string) and print out the collection by iterate through
        all elements in an array list.

         */
    }
}
