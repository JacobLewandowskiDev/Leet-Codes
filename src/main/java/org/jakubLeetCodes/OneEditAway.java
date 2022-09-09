package org.jakubLeetCodes;

public class OneEditAway {

    public static void main(String[] args) {
        System.out.println(oneEditAway("one", "one"));
    }

    public static boolean oneEditAway(String first, String second) {
        if(first.length() == second.length()) {
            return oneEditReplace(first, second);
        }
        return false;
    }

    public static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }
}
