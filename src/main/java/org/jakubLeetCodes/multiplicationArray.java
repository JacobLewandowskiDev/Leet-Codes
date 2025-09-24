package org.jakubLeetCodes;

import java.util.Arrays;

public class multiplicationArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(multiply(nums)));
    }

    public static int[] multiply(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 1; i< nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProducts = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rightProducts;
            rightProducts *= nums[i];
        }

        return result;
    }
}
