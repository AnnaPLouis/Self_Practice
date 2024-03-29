package Algorithms.week6;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[]nums = new int[]{0, 1, 0, 3, 12};

        System.out.println(Arrays.toString(moveZeros(nums)));





    } public static int[] moveZeros(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                count++;
            } else if (count>0) {
                nums[i-count] = nums[i];
                nums[i]=0;
            }
        }

        return nums;
    }


    /*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non- zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0, 1, 0, 3, 12]
Example 2: Input: nums = [0]
Constraints:
• 1 <= nums.length <= 104
• -231 <= nums[i] <= 231 - 1
Output: [1, 3, 12, 0, 0] Output: [0]
 Follow up: Could you minimize the total number of operations done?

     */
}
