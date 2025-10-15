package org.jakubLeetCodes;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0,1,2,0,3,4,5};

        System.out.println(Arrays.toString(moveZeros(nums)));
    }

    public static int[] moveZeros(int[] nums) {
        int nonZero = 0;

        for(int i = 0; i< nums.length; i++) {
           if(nums[i] != 0) {
               int temp = nums[i];
               nums[i] = nums[nonZero];
               nums[nonZero] = temp;
               nonZero++;
           }
        }
        return nums;
    }
}
