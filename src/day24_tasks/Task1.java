package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, 2, 3, 4, 4, 5, 5));

        ArrayList<Integer> uniques = new ArrayList<>();

        for (Integer each : list) {
            if (Collections.frequency(list, each) == 1){
                uniques.add(each);
            }

        }

        System.out.println(uniques);







        /*Write a program that can display the unique elements of an arrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

         */
    }
}
