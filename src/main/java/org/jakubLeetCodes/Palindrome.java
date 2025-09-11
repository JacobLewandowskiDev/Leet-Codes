package org.jakubLeetCodes;

public class Palindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left ++;
            right -= 1;
        }
        return true;
    }
}
