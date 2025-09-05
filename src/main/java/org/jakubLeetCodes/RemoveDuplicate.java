package org.jakubLeetCodes;


import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4};
        System.out.println(removeDuplicate(nums));
    }

    public static int removeDuplicate(int[] nums) {

        int unique = 0;

        for(int nextUnique = unique + 1; nextUnique < nums.length; nextUnique++) {
            if(nums[nextUnique] != nums[unique]) {
                unique++;
                nums[unique] = nums[nextUnique];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(Arrays.copyOf(nums, unique + 1)));
        return unique + 1;
    }
}
