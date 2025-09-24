package org.jakubLeetCodes;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "margana";
        System.out.println(checkForAnagram(s1, s2));
    }


    public static boolean checkForAnagram(String s1, String s2) {
        Map<Character, Integer> exists = new HashMap();
        if(s1.length() != s2.length()) {
            return false;
        }

        for(int i = 0; i < s1.length(); i++) {
            if(!exists.containsKey(s1.charAt(i))) {
                exists.put(s1.charAt(i), 1);
            } else {
                exists.put(s1.charAt(i), exists.get(s1.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!exists.containsKey(s2.charAt(i))) { // ✅ missing check
                return false;
            }

            int result = exists.get(s2.charAt(i)) - 1;
            exists.put(s2.charAt(i), result);

            if (result < 0) { // ✅ keep your existing check
                return false;
            }
        }

        // ✅ missing final validation
        for (int value : exists.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
