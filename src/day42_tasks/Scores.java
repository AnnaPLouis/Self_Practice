package day42_tasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Scores {
    public static void main(String[] args) {

        Map <String, int[]> map = new LinkedHashMap<>();

        map.put("Anna", new int[]{90, 70, 75, 83, 99});
        map.put("Largo", new int[]{91, 71, 76, 84, 98});
        map.put("Alena", new int[]{92, 73, 77, 81, 96});
        map.put("Natalia", new int[]{91, 71, 76, 84, 98});
        map.put("Olesya", new int[]{90, 70, 75, 83, 99});


        for (Map.Entry<String, int[]> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " : " + Arrays.toString(entry.getValue()) );

        }

        /*Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores

         */
    }
}
