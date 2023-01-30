package OfficeHoursWeek9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    public static void main(String[] args) {


        ArrayList<Integer>list = new ArrayList<>();

        list.addAll(Arrays.asList(98,56,49,44,39,0));

        Collections.sort(list);

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5));
        list2.addAll(list);

        System.out.println(list2);

        Collections.shuffle(list2);

        System.out.println(list2);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(list.subList(2,5));

        System.out.println(list3);
        
        boolean isEqual = list.equals(list3);

        System.out.println(isEqual);








        /*(Use Collections Utility Class)
        Search an element in a array list then sort the given array list.
        Copy one array list into another. Shuffle elements in a array list.
        Reverse elements in a array list.

         */
    }
}
