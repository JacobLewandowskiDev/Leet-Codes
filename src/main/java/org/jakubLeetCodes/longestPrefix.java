package org.jakubLeetCodes;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */

public class longestPrefix {

    public static void main(String[] args) {
        longestCommonPrefix(new String[]{"flower", "flight", "flow"});
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        System.out.println(prefix);
        return prefix;
    }
}
