package org.jakubLeetCodes;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static void main(String[] args) {
        String s1 = "tom";
        String s2 = "mot";
        System.out.println(isThisAnagram(s1, s2));
    }

    public static boolean isThisAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        Map<Character,Integer> countMap = new HashMap<>();

        for (char c : s1.toCharArray()) {
            if(countMap.containsKey(c)) {
                int newVal = countMap.get(c) + 1;
                countMap.put(c, newVal);
            } else {
                countMap.put(c, 1);
            }
        }

        for (char c : s2.toCharArray()) {
            if(countMap.containsKey(c)) {
                int newVal = countMap.get(c) - 1;
                countMap.put(c, newVal);
            }
        }

        for (int val : countMap.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }


//      if(s1.length() == s2.length()) {
//        char[] s1Arr = s1.toLowerCase().toCharArray();
//        char[] s2Arr = s2.toLowerCase().toCharArray();
//
//        Arrays.sort(s1Arr);
//        Arrays.sort(s2Arr);
//
//        return Arrays.equals(s1Arr, s2Arr);
//    }
//        return false;
}
