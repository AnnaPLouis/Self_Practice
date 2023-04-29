package Algorithms.week6;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int k = removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});

        System.out.println(k);



    } public static int removeDuplicates(int[] nums) {


        int uniqueIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] != nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[uniqueIndex] = nums[i + 1];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }


}

