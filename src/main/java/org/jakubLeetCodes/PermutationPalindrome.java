package org.jakubLeetCodes;

public class PermutationPalindrome {

    public static void main(String[] args) {
         /** A palindromes properties are:
          * Pairs of letters,
          * only one instance of odd letter, <-- This is the deciding factor
         */
        System.out.println(permutationPalindrome("boboc"));
        System.out.println(permutationPalindrome("racecar"));
        System.out.println(permutationPalindrome("code"));
    }

    public static boolean permutationPalindrome(String str) {
        int[] charCount = new int[128];
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
            System.out.println(charCount[str.charAt(i)]);
        }

        int oddCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            oddCount += charCount[i] % 2;
        }
        System.out.println("Count: " + oddCount);
        return oddCount <= 1;
    }
}
