package OfficeHoursWeek9;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));

        list.add(0,10);

        list.set(4, list.get(0));

        list.remove(2);




        System.out.println(list);
        System.out.println(list.get(2));





        /*Write a Java program to insert an element
        into the array list at the first position.
        Then retrieve an element (at a specified index) from the array list.
        Then update specific array element by given element.
        Lastly remove the third element from the array list.

         */
    }
}
