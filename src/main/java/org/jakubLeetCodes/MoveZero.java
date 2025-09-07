package org.jakubLeetCodes;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    //Brute force option
//    public static int[] moveZeroes(int[] nums) {
//        int temp = 0;
//        int isZeroIndex = -1;
//
//        for(int i = 0; i < nums.length; i++) {
//            for(int j = i + 1; j< nums.length; j++) {
//                if(nums[i] == 0) {
//                    isZeroIndex = i;
//                }
//                if(nums[j] != 0 && isZeroIndex >=0) {
//                    temp = nums[j];
//                    nums[j] = nums[isZeroIndex];
//                    nums[isZeroIndex] = temp;
//                    isZeroIndex = -1;
//                }
//            }
//        }
//        return nums;
//    }

    public static int[] moveZeroes(int[] nums) {
        int lastNonZero = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastNonZero];
                nums[lastNonZero] = temp;
                lastNonZero++;
            }
        }
        return nums;
    }
}
