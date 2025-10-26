package org.jakubLeetCodes;

import java.util.HashSet;

public class HasDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,4,5};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate (int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for(int num : nums) {
            if(numbers.contains(num)) {
                return true;
            } else {
                numbers.add(num);
            }
        }
        return false;
    }
}
