package org.jakubLeetCodes;

public class ExtraLetter {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "edcba";

        System.out.println(extraLetter(s, t));
    }

    public static char extraLetter(String s, String t) {
        int[] letters = new int[26];

        for(char c : s.toCharArray()) {
            letters[c - 'a']++;
        }

        for(char c : t.toCharArray()) {
            letters[c - 'a']--;
            if(letters[c - 'a'] < 0) {
                return c;
            }
        }
        return ' ';
    }
}
