package Algorithms;

import java.util.*;

public class UniqueNumberOfOccurances {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2};

        boolean unoo = uniqueNumOfOccur(nums);

        System.out.println(unoo);


    }

    public static boolean uniqueNumOfOccur(int[] nums) {

        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        /*Set<Integer> set = new HashSet<>();

        for (Integer value : map.values()) {
            if(!set.add(value))
                return false;

        }

        return true;*/

        Set<Integer> set = new HashSet<>(map.values());

        return set.size() == map.values().size();


    }

}

