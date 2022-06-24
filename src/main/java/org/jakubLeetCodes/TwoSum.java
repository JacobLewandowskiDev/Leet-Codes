package org.jakubLeetCodes;


/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class TwoSum {

    public static void main(String[] args) {

        sumOfTwo(new int[] {2,5,5,11}, 10);

    }

    public static int[] sumOfTwo(int[] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if((arr[i] + arr[j] == target) && i !=j) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(i + ", " + j);
                    return result;
                }
            }
        }
        return null;
    }























    public static int[] twoSum(int[] nums, int target) {

        int[] sumNumbers = new int[2];
        int numSum;

            for (int i=0; i < nums.length; i++) {
                for (int j=1; j< nums.length; j++) {
                    numSum = nums[i] + nums[j];
                    if(numSum == target && i != j) {
                        sumNumbers[0] = i;
                        sumNumbers[1] = j;
                        return sumNumbers;
                }
            }
        }
            return null;
    }
}
