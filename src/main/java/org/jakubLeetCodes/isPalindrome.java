package org.jakubLeetCodes;

import java.sql.Array;

/**
 * Given an integer x, return true if x is palindrome integer.
 * <p>
 * An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * For example, 121 is a palindrome while 123 is not.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Constraints:
 * -231 <= x <= 231 - 1
 */

public class isPalindrome {

    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        int num = x;
        int reversed = 0;
        while (x > 0) {
            int digit = x % 10; // Get last digit
            reversed = reversed * 10 + digit; // Add last digit to reversed number
            System.out.println(reversed);
            x /= 10;
        }
        if (reversed == num) {
            System.out.println("It is a palindrome");
            return true;
        } else {
            System.out.println("Sadly it is not a palindrome");
            return false;
        }
    }
}
