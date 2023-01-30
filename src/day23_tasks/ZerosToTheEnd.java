package day23_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ZerosToTheEnd {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,56,89,0,0,67,0,0,0,56));

        ArrayList<Integer> listNoZeros = new ArrayList<>();
        ArrayList<Integer> onlyZeroz = new ArrayList<>();

        for (Integer each : list) {

            if (each != 0){

                listNoZeros.add(each);

                }else {

                onlyZeroz.add(each);


            }

        }

        list.clear();
        list.addAll(listNoZeros);
        list.addAll(onlyZeroz);

        System.out.println(list);













/*Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]

 */
    }
}
