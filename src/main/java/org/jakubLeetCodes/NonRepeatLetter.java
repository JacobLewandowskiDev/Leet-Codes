package org.jakubLeetCodes;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatLetter {

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(nonRepeat(s));
    }

    public static int nonRepeat(String s) {
        Map<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i< s.length(); i++) {
            if(!letters.containsKey(s.charAt(i))){
                letters.put(s.charAt(i), 1);
            } else {
                letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1);
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if (letters.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
