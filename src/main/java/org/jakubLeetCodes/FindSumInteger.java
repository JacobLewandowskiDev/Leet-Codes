package org.jakubLeetCodes;

public class FindSumInteger {

    public static void main(String[] args) {
        // sum left == sum right
        // integer in between left and right is answer
        // right = totalSum - left - integer --> integer = totalSum - right - left
        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println(findInteger(nums));
    }

    public static int findInteger(int[] nums) {
        int left = 0;
        int right;
        int totalSum = 0;

        for(int num : nums) {
            totalSum +=num;
        }

        for(int i = 0; i < nums.length; i++) {
            right = totalSum - left - nums[i];
            if(left == right) {
                return i;
            } else {
                left += nums[i];
            }
        }
        return -1;
    }
}
