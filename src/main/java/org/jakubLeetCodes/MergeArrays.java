package org.jakubLeetCodes;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] nums1 = {1,3,5,0,0,0};
        int[] nums2 = {2,4,6};

        System.out.println(Arrays.toString(mergeArray(nums1, nums2)));
    }

    public static int[] mergeArray(int[] nums1, int[] nums2) {
        int i = 3 - 1;
        int j = 3 - 1;
        int k = 3 + 3 - 1;
        while(j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }

        }
        return nums1;
    }
}
