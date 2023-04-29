package Algorithms.week9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = new int[]{4,1,2,1,2};

        Integer singleNumber = singleNumber(nums);

        System.out.println(singleNumber);

    }

    public static Integer singleNumber(int[] nums) {

            HashMap<Integer,Integer>map=new LinkedHashMap<>();

            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            for(Map.Entry<Integer,Integer>entry: map.entrySet()){
                if(entry.getValue()==1){
                    return entry.getKey();
                }
            }
            return -1;
        }
}
