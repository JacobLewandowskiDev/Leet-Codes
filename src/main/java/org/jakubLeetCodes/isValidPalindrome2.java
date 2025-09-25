package org.jakubLeetCodes;

public class isValidPalindrome2 {

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
       int left = 0;
       int right = s.length() - 1;
       boolean skipped = false;

       while (left < right) {
           if(s.charAt(left) == s.charAt(right)) {
               left++;
               right--;
           }
           else if (skipped) {
               return false;
           }
           return (isValid(s,left + 1, right) || isValid(s, left, right - 1));
       }
       return true;
    }

    private static boolean isValid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
