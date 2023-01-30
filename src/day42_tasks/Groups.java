package day42_tasks;

import java.util.*;

public class Groups {

    public static void main(String[] args) {


        String[] group1 = {"Anna", "Alyona"};
        String[] group2 = {"Largo", "Buble"};
        String[] group3 = {"Olesya", "Tania"};
        String[] group4 = {"Rico", "Jim"};
        String[] group5 = {"John", "Maria"};

        Map<Integer, String[]> groups = new LinkedHashMap();

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);

        System.out.println(Arrays.toString(groups.get(1)));

        for (String each : groups.get(1)) {

            System.out.println(each);

        }

        for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {
            for (String each : groups.get(eachEntry.getKey())) {

                System.out.println(each);


            }
        }

        for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {


                System.out.println(eachEntry.getKey() + ": " + Arrays.toString(eachEntry.getValue()));
            }










        /*4.1 Create a map that contains group id and names of group members

        Map<Integer, String[]> groups = new LinkedHashMap();

        add all the group 1d and group members into the map named groups

        4.2 Display the names of each student with group id of 1

        4.3 Display the names o */
        }
    }

