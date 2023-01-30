package day24_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));


        Collections.sort(list);

        int max = Collections.max(list);
        int min = Collections.min(list);


        list.removeIf(p-> p==max);
        list.removeIf(p-> p==min);

        int secondMax = Collections.max(list);
        int secondMin = Collections.min(list);

        System.out.println("second maximum number is "+secondMax);
        System.out.println("second minimum number is "+secondMin);









        /*Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

         */
    }
}
