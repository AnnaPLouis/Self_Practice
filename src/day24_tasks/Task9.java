package day24_tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<LocalDate> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                LocalDate.of(2020, 5, 30), LocalDate.of(2015,04,18),
                LocalDate.of(2022,11,27)));

        System.out.println(list);

        list.removeIf(p -> p.isBefore(LocalDate.of(2016, 8, 15)));

        System.out.println(list);


        //9. create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
    }
}
