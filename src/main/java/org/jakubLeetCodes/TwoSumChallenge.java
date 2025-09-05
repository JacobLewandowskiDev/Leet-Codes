package org.jakubLeetCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSumChallenge {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(twoSum(numArr, 9)));
    }

    public static int[] twoSum(int[] num, int target) {

        Map<Integer, Integer> result = new HashMap<>();

        for(int i = 0; i < num.length; i++) {
            int component = target - num[i];
            if(result.containsKey(component)) {
                return new int[]{result.get(component), i};
            }
            else {
                result.put(num[i], i);
            }
        }
        return null;
    }
}
