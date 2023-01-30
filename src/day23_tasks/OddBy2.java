package day23_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class OddBy2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,13,12,15));

        for (Integer each : list) {

            if (each%2 != 0){
                list.set(list.indexOf(each), each*2);
            }

        }
        System.out.println(list);








        /*rite a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

         */
    }
}
