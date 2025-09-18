package org.jakubLeetCodes;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        int majority = 0;
        int maxCount = 0;

        for (int num : nums) {
            if(numbers.get(num) == null) {
                numbers.put(num, 0);
            }
            else {
                numbers.put(num, numbers.get(num) + 1);
            }
            if (numbers.get(num) > maxCount) {
                maxCount = numbers.get(num);
                majority = num;
            }
        }

        return majority;
    }
}
