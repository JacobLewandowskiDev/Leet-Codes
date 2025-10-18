package org.jakubLeetCodes;

import java.util.HashSet;
import java.util.Set;

public class GetCommon {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,7,5, 5};
        int[] nums2 = {5,2,3,6};
        System.out.println((getCommon(nums1, nums2)));
    }

    public static Set<Integer> getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1) {
            set1.add(num);
        }

        for(int num : nums2) {
            if(set1.contains(num)) {
              set2.add(num);
            };
        }
        return set2;
    }
}
