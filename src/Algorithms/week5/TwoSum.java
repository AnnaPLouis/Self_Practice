package Algorithms.week5;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {16, 3, 11, 5, 15};

        int [] arr = twoSum(nums, 8);

        System.out.println(Arrays.toString(arr));

    }


    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);

        int left = 0;

        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }

        }
        return new int[]{};
    }
}
