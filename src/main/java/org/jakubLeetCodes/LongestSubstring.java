package org.jakubLeetCodes;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(longestSubString("pwwkew"));
    }

    public static int longestSubString(String text) {
       Map<Character, Integer> lastSeen = new HashMap<>();
       int longestSubstring = 0;
       int start = 0;

       for(int end = 0; end < text.length(); end ++) {
           char c = text.charAt(end);

            if(lastSeen.containsKey(c) && lastSeen.get(c) >= start) {
                start = lastSeen.get(c) + 1;
            }

            lastSeen.put(c, end);
           longestSubstring = Math.max(longestSubstring, end - start + 1);
       }
         return longestSubstring;
    }
}
