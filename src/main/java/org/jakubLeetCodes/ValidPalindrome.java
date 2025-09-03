package org.jakubLeetCodes;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("race a car"));
    }

    public static boolean isValidPalindrome(String s) {
        String noCharOrSpace = s.replaceAll("[,:;. ]", "").toLowerCase();

        String palindrome = "";
        for(int i = noCharOrSpace.length() - 1; i >= 0; i--) {
            palindrome += noCharOrSpace.charAt(i);
        }
        return noCharOrSpace.equals(palindrome);
    };
}
