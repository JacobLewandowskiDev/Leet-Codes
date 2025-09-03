package org.jakubLeetCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumChallenge {
    public static void main(String[] args) {
        int[] numArr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(twoSum(numArr, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
