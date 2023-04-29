package Algorithms.week5;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int [] nums = {0,1,2};

        Arrays.sort(nums);

        int missingNumber = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i]+1==i+1){

                missingNumber = nums[i]+1;
            }
        }
        System.out.println(missingNumber);


    }
}
