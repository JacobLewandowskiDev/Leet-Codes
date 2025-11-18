package org.jakubLeetCodes;

import java.util.HashSet;

public class TheLongestSubstring {

    public static void main(String[] args) {
        String word = "abccdee";
        System.out.println(longestSubstring(word));
    }

    public static int longestSubstring(String word) {
        HashSet<Character> seenBefore = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < word.length()) {
            if(!seenBefore.contains(word.charAt(right))) {
                seenBefore.add(word.charAt(right));
                right++;
                maxLength = Math.max(seenBefore.size(), maxLength);
            } else {
                seenBefore.remove(word.charAt(left));
                left++;
            }
        }


        return maxLength;
    }
}
