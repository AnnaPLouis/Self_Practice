package Algorithms.week7;

import java.util.*;

public class AnimalsTwoByTwo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("dog", "cat", "dog", "cat", "beaver", "cat");

        Map<String, Integer> output = onlyCouples(list);

        System.out.println(output);


    }

    public static Map<String, Integer> onlyCouples(List<String> stringList) {

        Map<String, Integer> tempMap = new HashMap<>();

        int count;
        for (String str : stringList) {
            if (tempMap.containsKey(str)) {
                count = tempMap.get(str);
                tempMap.put(str, count + 1);
            } else tempMap.put(str, 1);
        }

        Map<String, Integer> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry : tempMap.entrySet()) {

            String eachKey = entry.getKey();
            Integer eachValue = entry.getValue();

            if (eachValue>=2){
                map.put(eachKey,2);
            }
        }

        return map;
    }
}
